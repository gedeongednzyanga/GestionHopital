
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Approvisionnement;
import com.beans.Fournisseurs;
import com.beans.Produit;
import com.forms.ApprovisionnementForm;
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
public class Achat extends HttpServlet {

    private static final String VUE = "/WEB-INF/achat.jsp";
    private static final String ATTR_APPROVISIONNEMENT = "approvisionnement";
    private static final String ATTR_APPROVFORM = "approvForm";
    private static final String ATTR_LISTE = "listeAchat";
    private static final String ATTR_LISTEP = "listeProduit";
    private static final String ATTR_LISTEF = "listeFournisseur";
    DAO<Approvisionnement> approvisionnementDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getApprovisionnementDAO();
    DAO<Approvisionnement> detailApprovisionnementDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getDetailapprovisionnementDAO();
    DAO<Produit> produitDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getProduitDAO();
    DAO<Fournisseurs> fournisseurDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getFournisseurDAO();
    List<Produit> listeProduit = produitDAO.getAll();
    List<Fournisseurs> listeFournisseur = fournisseurDAO.getAll();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        request.setAttribute(ATTR_LISTEP, listeProduit);
        request.setAttribute(ATTR_LISTEF, listeFournisseur);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        ApprovisionnementForm form = new ApprovisionnementForm();
        if("btnNouveauApprovisionnement".equals(request.getParameter("btn"))){
            Approvisionnement approvisionnement = form.nouveauApprovisionnement(request);
            approvisionnementDAO.operationIUD(1, approvisionnement);
            request.setAttribute(ATTR_APPROVISIONNEMENT, approvisionnement);
        }else if ("btnApprovisionnement".equals(request.getParameter("btn"))){
            Approvisionnement approvisionnement = form.createApprovisionnement(request);
            detailApprovisionnementDAO.operationIUD(1, approvisionnement);
            request.setAttribute(ATTR_APPROVISIONNEMENT, approvisionnement);
        }
        
        request.setAttribute(ATTR_APPROVFORM, form);
        request.setAttribute(ATTR_LISTEP, listeProduit);
        request.setAttribute(ATTR_LISTEF, listeFournisseur);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
