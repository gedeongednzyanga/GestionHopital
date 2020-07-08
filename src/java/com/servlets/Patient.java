
package com.servlets;

import com.DAO.DAO;
import com.Factory.AbstractDAOFactory;
import com.Factory.FactoryType;
import com.beans.Malade;
import com.forms.MaladeForm;
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
public class Patient extends HttpServlet {

    private static final String VUE = "/WEB-INF/patient.jsp";
    private static final String ATTR_PATIENT ="patient";
    private static final String ATTR_FORM = "patientForm";
    private static final String ATTR_LISTE = "listePatient";
    DAO<Malade> maladeDAO = AbstractDAOFactory.getFactory(FactoryType.MySQL).getMaladeDAO();
    //List<Malade> listePatient = maladeDAO.getAll();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       // request.setAttribute(ATTR_LISTE, listePatient);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        MaladeForm form = new MaladeForm();
        Malade patient = form.createMalade(request);
        if(form.getErreurs().isEmpty()){
            maladeDAO.operationIUD(1, patient);
        }
        request.setAttribute(ATTR_PATIENT, patient);
        request.setAttribute(ATTR_FORM, form);
        //request.setAttribute(ATTR_LISTE, listePatient);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
