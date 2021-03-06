
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Produit;
import com.beans.Utilisateur;
import com.forms.ConnexionForm;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author GEDEON
 */
public class Login extends HttpServlet {
    
    private static final String LOGIN = "/WEB-INF/login.jsp";
    private static final String ACCUEIL = "/WEB-INF/accueil.jsp";
    private static final String ATTR_FORM = "connexionForm";
    private static final String ATTR_SESSION_USER = "sessionUtilisateur"; 
    private static final String ATTR_UTILISATEUR = "utilisateur";
     private static final String ATTR_PRODUIT_LISTE = "listeProduit";
    DAO<Produit> produitDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getProduitDAO();
    List<Produit> listeProduit = produitDAO.getAll();
    
     void loadData(){
       listeProduit.clear();
//       listeCategorie.clear();
//       listeSousCategorie.clear();
//       listeCategorie = categorieDAO.getAll();
//       listeSousCategorie = souscategorieDAO.getAll();
       listeProduit = produitDAO.getAll();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        this.getServletContext().getRequestDispatcher(LOGIN).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        loadData();
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        ConnexionForm form = new ConnexionForm();
        Utilisateur utilisateur = form.connexionUtilisateur(request);
        HttpSession session = request.getSession();
        
        if(form.getErreurs().isEmpty()){
            session.setAttribute(ATTR_SESSION_USER, utilisateur);
            if(session.getAttribute(ATTR_SESSION_USER) == null){
                 request.setAttribute(ATTR_FORM, form);
                this.getServletContext().getRequestDispatcher(LOGIN).forward(request, response);
            }else{
                this.getServletContext().getRequestDispatcher(ACCUEIL).forward(request, response);
            }
        }else{
            session.setAttribute(ATTR_SESSION_USER, null);
            request.setAttribute(ATTR_UTILISATEUR, utilisateur);
            request.setAttribute(ATTR_FORM, form);
            this.getServletContext().getRequestDispatcher(LOGIN).forward(request, response);
        }
       
      
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
