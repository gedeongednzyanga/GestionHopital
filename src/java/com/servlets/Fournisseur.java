
package com.servlets;


import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Fournisseurs;
import com.forms.FournisseurForm;
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
public class Fournisseur extends HttpServlet {

    private static final String VUE = "/WEB-INF/fournisseur.jsp";
    private static final String FOURNISSEUR = "fournisseur";
    private static final String FORM_FOURNISSEUR = "fournisseurForm";
    private static final String LISTE_FOURNISSEUR = "listeFournisseur";
    DAO<Fournisseurs> fournisseurDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getFournisseurDAO();
    List<Fournisseurs> listeFournisseur = fournisseurDAO.getAll();
     void loadData(){
       listeFournisseur.clear();
       listeFournisseur = fournisseurDAO.getAll();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        loadData();
        request.setAttribute(LISTE_FOURNISSEUR, listeFournisseur);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        loadData();
        FournisseurForm form = new FournisseurForm();
        Fournisseurs fournisseurs = form.createFournisseur(request);
        if(form.getErreurs().isEmpty()){
            fournisseurDAO.operationIUD(1, fournisseurs);
        }
        request.setAttribute(FORM_FOURNISSEUR, form);
        request.setAttribute(FOURNISSEUR, fournisseurs);
        request.setAttribute(LISTE_FOURNISSEUR, listeFournisseur);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
