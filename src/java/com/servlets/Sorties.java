
package com.servlets;


import com.DAO.DAO;
import com.DAO.approvisionnementDAO;
import com.DAO.sortieMaladeDAO;
import com.DAO.sortieServiceDAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Approvisionnement;

import com.beans.Malade;
import com.beans.Produit;
import com.beans.Service;
import com.beans.SortieMalade;
import com.beans.SortieService;

import com.forms.FactureForm;
import com.forms.FormRequisition;
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
public class Sorties extends HttpServlet {

    private static final String VUE = "/WEB-INF/sorties.jsp" ;
    private static final String ATTR_FORM_SM = "sortieMForm";
    private static final String ATTR_SORTIEM = "sortiem";
    private static final String ATTR_MALADE ="malade";
    private static final String ATTR_FORM_SS = "sortieSForm";
    private static final String ATTR_SORTIES = "sorties";
    private static final String ATTR_SERVICE ="services";
    private static final String ATTR_PRODUIT_LISTE = "listeProduit";
    private static final String ATTR_APPROVINNEMENT = "approvisionnement";
    private static final String ATTR_SESSION_MALADE = "sessionMalade";
    private static final String ATTR_SESSION_SERVICE = "sessionService";
    private static final String ATTR_PANIER_CLIENT = "panierClient";
    private static final String ATTR_PANIER_SERVICE = "panierService";
    private static final String LISTE_SORTIE = "sortieStock";
    DAO<Malade> maladeDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getMaladeDAO();
    DAO<Produit> produitDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getProduitDAO();
    DAO<Service> serviceDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getServiceDAO();
    DAO<SortieMalade> sortieMaladeDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getSortieMaladeDAO();
    DAO<SortieService> sortieServiceDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getSortieServiceDAO();
    List<Malade> listeMalade =maladeDAO.getAll();
    List<Produit> listeProduit = produitDAO.getAll();
    List<Service> listeService = serviceDAO.getAll();
    List<SortieMalade> panierClient;
    List<SortieService> panierService;
    List<SortieService> sortieStock = sortieServiceDAO.getAll();
    Approvisionnement approvi = new approvisionnementDAO().getLastApprovionnement();
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
        processRequest(request, response);
        
        if(request.getParameter("id") != null){
            FormRequisition form = new FormRequisition();
            SortieService ssl = form.addToRecquisition(request);
            if(form.getErreurs().isEmpty()){
                sortieServiceDAO.operationIUD(3, ssl);
                panierService = new sortieServiceDAO().getPanier(Integer.parseInt(request.getParameter("serviceid")));
            }
        }
        
        load();
        request.setAttribute(ATTR_PANIER_SERVICE, panierService);
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        request.setAttribute(ATTR_MALADE, listeMalade);
        request.setAttribute(ATTR_SERVICE, listeService);
        request.setAttribute(ATTR_APPROVINNEMENT, approvi);
        request.setAttribute(LISTE_SORTIE, sortieStock);
        
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        HttpSession session = request.getSession();
        
        if(request.getParameter("factureCreate") != null){
            FactureForm formS = new FactureForm();
            SortieMalade sm = formS.createFacture(request);
            new sortieMaladeDAO().createFacture(1,sm);
            session.setAttribute(ATTR_SESSION_MALADE, maladeDAO.find(Integer.parseInt(request.getParameter("malade"))));
        }else if (request.getParameter("btnSaveS") != null){
            FactureForm form = new FactureForm();
            SortieMalade smal = form.addToFacture(request);
            if(form.getErreurs().isEmpty()){
                sortieMaladeDAO.operationIUD(1, smal);
                panierClient = new sortieMaladeDAO().getPanier(Integer.parseInt(request.getParameter("maladeid")));
            }
            request.setAttribute(ATTR_FORM_SM, form);
            request.setAttribute(ATTR_SORTIEM, smal);
            
            
        }else if(request.getParameter("factureRec") != null){
            FormRequisition formR = new FormRequisition();
            SortieService ss = formR.createRequisition(request);
            if(formR.getErreurs().isEmpty()){
                new sortieServiceDAO().createRequisition(1, ss);
                session.setAttribute(ATTR_SESSION_SERVICE, serviceDAO.find(Integer.parseInt(request.getParameter("service"))));
            }
            request.setAttribute(ATTR_FORM_SS, formR);
            request.setAttribute(ATTR_SORTIES, ss);

        }else if(request.getParameter("btnSaveSS") != null){
            FormRequisition form = new FormRequisition();
            SortieService ssl = form.addToRecquisition(request);
            if(form.getErreurs().isEmpty()){
                sortieServiceDAO.operationIUD(1, ssl);
                panierService = new sortieServiceDAO().getPanier(Integer.parseInt(request.getParameter("serviceid")));
            }
            
            request.setAttribute(ATTR_FORM_SS, form);
            request.setAttribute(ATTR_SORTIES, ssl);
        }
        load();
        request.setAttribute(ATTR_PANIER_CLIENT, panierClient);
        request.setAttribute(ATTR_PANIER_SERVICE, panierService);
        request.setAttribute(ATTR_PRODUIT_LISTE, listeProduit);
        request.setAttribute(ATTR_MALADE, listeMalade);
        request.setAttribute(ATTR_SERVICE, listeService);
        request.setAttribute(LISTE_SORTIE, sortieStock);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
