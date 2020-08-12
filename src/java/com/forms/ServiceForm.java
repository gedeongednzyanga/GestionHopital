
package com.forms;

import com.beans.Service;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author GEDEON
 */
public class ServiceForm extends AbstractForm {
    
    private static final String CHAMP_ID = "id";
    private static final String CHAMP_DESIGNATION = "designation";
    private static final String CHAMP_DESCRIPTION = "description";
    private static final String CHAMP_RESPONSABLE = "responsable";
    
    public Service createService(HttpServletRequest request){
        Service service = new Service();
        String id = getValeur(request, CHAMP_ID);
        String designation = getValeur(request, CHAMP_DESIGNATION);
        String description = getValeur(request, CHAMP_DESCRIPTION);
        String responsable = getValeur(request, CHAMP_RESPONSABLE);
         
        try{
            validateId(Integer.parseInt(id));
        }catch(Exception e){
            getErreur(CHAMP_ID, e.getMessage());
        }
        service.setId(Long.parseLong(id));
        
        try{
            validateDesignation(designation);
        }catch(Exception e){
            getErreur(CHAMP_DESIGNATION, e.getMessage());
        }
        service.setDesignation(designation);
        
        try{
            validateDesignation(description);
        }catch(Exception e){
            getErreur(CHAMP_DESCRIPTION, e.getMessage());
        }
        service.setDescription(description);
        
        try{
            validateDesignation(responsable);
        }catch(Exception e){
            getErreur(CHAMP_RESPONSABLE, e.getMessage());
        }
        service.setResponsable(responsable);
        
        if(erreurs.isEmpty()){
            resultat = "Service enregistré avec succès.";
        }else{
            resultat = "Echec d'enregistrement.";
        }
        return service;
    }
    
}
