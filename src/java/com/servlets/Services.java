
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Service;
import com.forms.ServiceForm;
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
public class Services extends HttpServlet {

    private static final String VUE = "/WEB-INF/service.jsp";
    private static final String FORM_SERVICE = "serviceForm";
    private static final String SERVICE = "service";
    private static final String LISTE_SERVICE = "listeservice";
   
    DAO<Service> serviceDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getServiceDAO();
    List<Service> listeservice = serviceDAO.getAll();
    void load(){
        listeservice.clear();
        listeservice = serviceDAO.getAll();
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
            Service service = new Service();
            Long id = Long.parseLong(request.getParameter("id"));
            service.setId(id);
            serviceDAO.operationIUD(3, service);
        }
        load();
        request.setAttribute(LISTE_SERVICE, listeservice);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
         ServiceForm form = new ServiceForm();
         Service service = form.createService(request);
        if("btnSave".equals(request.getParameter("btnSave"))){
            if(form.getErreurs().isEmpty()){
                serviceDAO.operationIUD(1, service);
            }else{
                request.setAttribute(FORM_SERVICE, form);
                request.setAttribute(SERVICE, service);
            }  
        }else if ("btnUpdate".equals(request.getParameter("btnSave"))){
             if(form.getErreurs().isEmpty()){
                serviceDAO.operationIUD(2, service);
            }else{
                request.setAttribute(FORM_SERVICE, form);
                request.setAttribute(SERVICE, service);
            }  
        }
        load();
        request.setAttribute(LISTE_SERVICE, listeservice);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
