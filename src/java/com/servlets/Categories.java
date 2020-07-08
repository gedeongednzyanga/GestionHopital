
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Categorie;
import com.beans.SousCategorie;
import com.forms.CategorieForm;
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
public class Categories extends HttpServlet {
    
    private static final String VUE = "/WEB-INF/stock.jsp";
    private static final String ATTR_CATEGORIE ="Categorie";
    private static final String ATTR_CAT_FORM = "CategorieForm";
    private static final String ATTR_CAT_LISTE = "listeCategorie";
    private static final String ATTR_SOUSCAT_LISTE = "listeSousCategorie";
    DAO<SousCategorie> souscategorieDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getSouscategorieDAO();
    DAO<Categorie> categorieDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getCategorieDAO();
    List<SousCategorie> listeSousCategorie = souscategorieDAO.getAll();
    List<Categorie> listeCategorie = categorieDAO.getAll();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
        request.setAttribute(ATTR_CAT_LISTE, listeCategorie);
        request.setAttribute(ATTR_SOUSCAT_LISTE, listeSousCategorie);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //Objects
        
        CategorieForm formCat = new CategorieForm();
        Categorie categorie = formCat.createCategorie(request);
        
        //Attributs
       
        request.setAttribute(ATTR_CATEGORIE, categorie);
        request.setAttribute(ATTR_CAT_FORM, formCat);
        request.setAttribute(ATTR_CAT_LISTE, listeCategorie);
        request.setAttribute(ATTR_SOUSCAT_LISTE, listeSousCategorie);
        if(formCat.getErreurs().isEmpty()){
            categorieDAO.operationIUD(1, categorie);  
        }
        
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

}
