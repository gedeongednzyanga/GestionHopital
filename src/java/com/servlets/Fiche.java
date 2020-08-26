/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.DAO.produitDAO;
import com.beans.FicheStock;
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
public class Fiche extends HttpServlet {

   private static final String FICHE = "/WEB-INF/fichestock.jsp";
   private static final String ATTR_FICHE = "fiche";
   List<FicheStock> fiche = new produitDAO().getFiche();
   void load(){
       fiche.clear();
       fiche = new produitDAO().getFiche();
   }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        load();
        request.setAttribute(ATTR_FICHE, fiche);
        this.getServletContext().getRequestDispatcher(FICHE).forward(request, response);
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
