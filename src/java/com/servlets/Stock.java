
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Categorie;
import com.beans.Produit;
import com.beans.SousCategorie;
import com.forms.ProduitForm;
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
public class Stock extends HttpServlet {
    
    private static final String VUE = "/WEB-INF/stock.jsp";
    private static final String ATTR_SOUSCAT_LISTE = "listeSousCategorie";
    private static final String ATTR_CAT_LISTE = "listeCategorie";
    private static final String ATTR_PRODUIT ="produit";
    private static final String ATTR_PRODUIT_FORM ="produitForm";
    private static final String ATTR_PRODUIT_LISTE = "listeProduit";
    DAO<Produit> produitDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getProduitDAO();
    DAO<Categorie> categorieDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getCategorieDAO();
    DAO<SousCategorie> souscategorieDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getSouscategorieDAO();
    List<Produit> listeProduit = produitDAO.getAll();
    List<Categorie> listeCategorie = categorieDAO.getAll();
    List<SousCategorie> listeSousCategorie = souscategorieDAO.getAll();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //Attributs
        
       
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
        
        ProduitForm form = new ProduitForm();
        Produit produit = form.createProduit(request);
        
       //Attributs
        
        request.setAttribute(ATTR_PRODUIT_FORM, form);
        request.setAttribute(ATTR_PRODUIT, produit);
        request.setAttribute(ATTR_CAT_LISTE, listeCategorie);
        request.setAttribute(ATTR_SOUSCAT_LISTE, listeSousCategorie);
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        if(form.getErreurs().isEmpty()){
           produitDAO.operationIUD(1, produit) ;  
        }
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
