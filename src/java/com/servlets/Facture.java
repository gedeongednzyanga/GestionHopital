/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.DAO.sortieServiceDAO;
import com.beans.SortieService;
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
public class Facture extends HttpServlet {

    private static final String VUE = "/WEB-INF/facture.jsp";
    private static final String LISTE_SORTIE = "facture";
    private final sortieServiceDAO sortieDAO = new sortieServiceDAO();
    List<SortieService> facture;
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        facture = sortieDAO.facture(request.getParameter("facture"));
        float total = sortieDAO.sumValeur(request.getParameter("facture"));
        request.setAttribute("numfacture", request.getParameter("facture"));
        request.setAttribute("datesortie", request.getParameter("ds"));
        request.setAttribute("datefacturation", request.getParameter("de"));
        request.setAttribute("servicef", request.getParameter("s"));
        request.setAttribute(LISTE_SORTIE, facture);
        request.setAttribute("total", String.valueOf(total));
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
