/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Produit;
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
public class Acceuil extends HttpServlet {

    private static final String ACCUEIL = "/WEB-INF/accueil.jsp";
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
        loadData();
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        this.getServletContext().getRequestDispatcher(ACCUEIL).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
