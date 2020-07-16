
package com.forms;

import com.beans.Categorie;
import javax.servlet.ServletRequest;

/**
 *
 * @author GEDEON
 */
public final class CategorieForm extends AbstractForm {
    
    private static final String CHAMP_ID ="id";
    private static final String CHAMP_DESIGNATION = "designation";
    
    public Categorie createCategorie(ServletRequest request){
        String id = getValeur(request, CHAMP_ID);
        String designation = getValeur(request, CHAMP_DESIGNATION);
        Categorie categorie = new Categorie();
        
        try{
            validateId(Integer.parseInt(id));
        }catch(Exception e){
            getErreur(CHAMP_ID, e.getMessage());
        }
        categorie.setId(Long.parseLong(id));
        try{
            validateDesignation(designation);
        }catch(Exception e){
            getErreur(CHAMP_DESIGNATION, e.getMessage());
        }
        categorie.setDesignation(designation);
        
        if(erreurs.isEmpty()){
            resultat = "Bien creer.";
        }else{
            resultat = "Echec de creation.";
        }
        return categorie;
    }
}
