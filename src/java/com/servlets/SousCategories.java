
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Categorie;
import com.beans.Produit;
import com.beans.SousCategorie;
import com.forms.SousCategorieForm;
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
public class SousCategories extends HttpServlet {

    private static final String VUE = "/WEB-INF/stock.jsp";
    private static final String ATTR_SOUSCAT_LISTE = "listeSousCategorie";
    private static final String ATTR_CAT_LISTE = "listeCategorie";
    private static final String ATTR_SOUSCAT_FORM = "sousCategorieForm";
    private static final String ATTR_SOUSCATEGORIE = "souscategorie";
    private static final String ATTR_PRODUIT_LISTE = "listeProduit";
    DAO<Produit> produitDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getProduitDAO();
    List<Produit> listeProduit = produitDAO.getAll();
    DAO<Categorie> categorieDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getCategorieDAO();
    DAO<SousCategorie> souscategorieDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getSouscategorieDAO();
    List<Categorie> listeCategorie = categorieDAO.getAll();
    List<SousCategorie> listeSousCategorie = souscategorieDAO.getAll();
   
    void loadData(){
       listeProduit.clear();
       listeCategorie.clear();
       listeSousCategorie.clear();
       listeCategorie = categorieDAO.getAll();
       listeSousCategorie = souscategorieDAO.getAll();
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
       
        //Attributs
        if(request.getParameter("id") != null){
            SousCategorie souscategorie = new SousCategorie();
            Long id = Long.parseLong(request.getParameter("id"));
            souscategorie.setId(id);
            souscategorieDAO.operationIUD(3, souscategorie);
        }
         loadData();
        request.setAttribute(ATTR_CAT_LISTE, listeCategorie);
        request.setAttribute(ATTR_SOUSCAT_LISTE, listeSousCategorie);
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
        //Objects
        
        SousCategorieForm form = new SousCategorieForm();
        SousCategorie souscategorie = form.createSousCategorie(request);
        
        if(form.getErreurs().isEmpty()){
            if(request.getParameter("btnSave").equals("save")){
                souscategorieDAO.operationIUD(1, souscategorie);
            }else if (request.getParameter("btnSave").equals("update")){
                souscategorieDAO.operationIUD(2, souscategorie);
            } 
        }
        
    //Attributs
        loadData();
        request.setAttribute(ATTR_SOUSCAT_FORM, form);
        request.setAttribute(ATTR_SOUSCATEGORIE, souscategorie);
        request.setAttribute(ATTR_CAT_LISTE, listeCategorie);
        request.setAttribute(ATTR_SOUSCAT_LISTE, listeSousCategorie);
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        
        
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
