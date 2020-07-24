
package com.servlets;


import com.DAO.DAO;
import com.DAO.approvisionnementDAO;
import com.DAO.sortieMaladeDAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Approvisionnement;
import com.beans.Categorie;
import com.beans.Malade;
import com.beans.Produit;
import com.beans.SortieMalade;

import com.beans.SousCategorie;
import com.forms.FactureForm;
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
public class Sorties extends HttpServlet {

    private static final String VUE = "/WEB-INF/sorties.jsp" ;

    private static final String ATTR_FORM_SM = "sortieMForm";
    private static final String ATTR_SORTIEM = "sortiem";
    private static final String ATTR_MALADE ="malade";
    private static final String ATTR_PRODUIT_FORM ="produitForm";
    private static final String ATTR_PRODUIT_LISTE = "listeProduit";
    private static final String ATTR_APPROVINNEMENT = "approvisionnement";
    DAO<Malade> maladeDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getMaladeDAO();
    DAO<Produit> produitDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getProduitDAO();
    DAO<SortieMalade> sortieMaladeDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getSortieMaladeDAO();
    
    List<Malade> listeMalade =maladeDAO.getAll();
    List<Produit> listeProduit = produitDAO.getAll();
//    List<SousCategorie> listeSousCategorie = souscategorieDAO.getAll();
    Approvisionnement approvi = new approvisionnementDAO().getLastApprovionnement();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        request.setAttribute(ATTR_MALADE, listeMalade);
        request.setAttribute(ATTR_APPROVINNEMENT, approvi);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        if(request.getParameter("factureCreate") != null){
            FactureForm formS = new FactureForm();
            SortieMalade sm = formS.createFacture(request);
            new sortieMaladeDAO().createFacture(1,sm);
        }else if (request.getParameter("btnSaveS") != null){
            FactureForm form = new FactureForm();
            SortieMalade smal = form.addToFacture(request);
            if(form.getErreurs().isEmpty()){
                sortieMaladeDAO.operationIUD(1, smal);
            }
             request.setAttribute(ATTR_FORM_SM, form);
             request.setAttribute(ATTR_SORTIEM, smal);
        }
        
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        request.setAttribute(ATTR_MALADE, listeMalade);
        
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
