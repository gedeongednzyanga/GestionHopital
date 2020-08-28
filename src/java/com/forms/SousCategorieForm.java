
package com.forms;

import com.beans.SousCategorie;
import javax.servlet.ServletRequest;

/**
 *
 * @author GEDEON
 */
public class SousCategorieForm extends AbstractForm {
    
    private static final String CHAMP_ID = "idcat";
    private static final String CHAMP_DESIGNATION = "designation";
   
    
    public SousCategorie createSousCategorie(ServletRequest request){
        String id = getValeur(request, CHAMP_ID);
        String designation = getValeur(request, CHAMP_DESIGNATION);
       
        SousCategorie souscategorie = new SousCategorie();
        
        try{
            validateId(Integer.parseInt(id));
        }catch(Exception e){
            getErreur(CHAMP_ID, e.getMessage());
        }
        souscategorie.setId(Long.parseLong(id));
        try{
            validateDesignation(designation);
        }catch(Exception e){
            getErreur(CHAMP_DESIGNATION, e.getMessage());
        }
         souscategorie.setDesignation(designation);
         
        
       if(erreurs.isEmpty()){
           resultat = "Bien creer";
       }else{
           resultat = "Echec de creation";
       }
        return souscategorie;
    }
}
