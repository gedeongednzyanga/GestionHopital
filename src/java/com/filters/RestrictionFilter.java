
package com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author GEDEON
 */
public class RestrictionFilter implements Filter {
    
    private static final boolean debug = true;
    
    private static final String ATTR_CONNEXION = "/Login";
    private static final String ATTR_SESSION_USER = "sessionUtilisateur"; 
    
    private FilterConfig filterConfig = null;
    
    public RestrictionFilter() {
    }    
    
    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("RestrictionFilter:DoBeforeProcessing");
        }
    }    
    
    private void doAfterProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("RestrictionFilter:DoAfterProcessing");
        }
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse rep = (HttpServletResponse) response;
        String style = req.getRequestURI().substring(req.getContextPath().length());
        if(style.startsWith("/assets")){
            chain.doFilter(req, rep);
            return;
        }
        HttpSession session = req.getSession();
        if(session.getAttribute(ATTR_SESSION_USER) == null){
            req.getRequestDispatcher(ATTR_CONNEXION).forward(request, response);
        }else{
            chain.doFilter(req, rep);
        }
        
    }

    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    public void destroy() {        
    }

    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {                
                log("RestrictionFilter:Initializing filter");
            }
        }
    }

    
    public void log(String msg) {
        filterConfig.getServletContext().log(msg);        
    }
    
}
