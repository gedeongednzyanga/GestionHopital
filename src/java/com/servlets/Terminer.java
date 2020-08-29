
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Produit;
import com.beans.Service;
import com.beans.SortieService;
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
public class Terminer extends HttpServlet {
    
    private static final String ATTR_SESSION_SERVICE = "sessionService";
    private static final String VUE = "/WEB-INF/sorties.jsp";
    private static final String ATTR_PRODUIT_LISTE = "listeProduit";
    private static final String LISTE_SORTIE = "sortieStock";
    private static final String ATTR_SERVICE ="services";
    
    DAO<Produit> produitDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getProduitDAO();
    DAO<Service> serviceDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getServiceDAO();
    DAO<SortieService> sortieServiceDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getSortieServiceDAO();
    List<Produit> listeProduit = produitDAO.getAll();
    List<Service> listeService = serviceDAO.getAll();
    List<SortieService> sortieStock = sortieServiceDAO.getAll();
    void load(){
        sortieStock.clear();
        listeService.clear();
        listeProduit.clear();
        listeProduit = produitDAO.getAll();
        sortieStock = sortieServiceDAO.getAll();
        listeService = serviceDAO.getAll();
    }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        session.removeAttribute(ATTR_SESSION_SERVICE);
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        request.setAttribute(ATTR_SERVICE, listeService);
        request.setAttribute(LISTE_SORTIE, sortieStock);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
        
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
