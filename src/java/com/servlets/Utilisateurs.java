
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Utilisateur;
import com.forms.UtilisateurForm;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GEDEON
 */
public class Utilisateurs extends HttpServlet {
    
    private static final String VUE = "/WEB-INF/utilisateurs.jsp";
    private static final String ATTR_FORM = "userform";
    private static final String ATTR_USER = "user";
    private static final String ATTR_LISTE = "listeUtilisateur";
    DAO<Utilisateur> utilisateurDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getUtilisateurDAO();
    List<Utilisateur> listeUtilisateur = utilisateurDAO.getAll();
    
    void load(){
        listeUtilisateur.clear();
        listeUtilisateur = utilisateurDAO.getAll();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
        if(request.getParameter("id") != null){
            Utilisateur user = new Utilisateur();
            user.setId(Long.parseLong(request.getParameter("id")));
            utilisateurDAO.operationIUD(3, user);
        }
        
        load();
        request.setAttribute(ATTR_LISTE, listeUtilisateur);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        UtilisateurForm form = new UtilisateurForm();
        Utilisateur user = form.createUser(request);
        
        if(form.getErreurs().isEmpty()){
            if("save".equals(request.getParameter("btnSave"))){
                 utilisateurDAO.operationIUD(1, user);
            }else if ("update".equals(request.getParameter("btnSave"))){
                 utilisateurDAO.operationIUD(2, user);
            }            
        }
        load();
        request.setAttribute(ATTR_LISTE, listeUtilisateur);
        request.setAttribute(ATTR_FORM, form);
        request.setAttribute(ATTR_USER, user);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
