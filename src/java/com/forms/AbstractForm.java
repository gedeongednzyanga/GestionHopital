
package com.forms;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletRequest;

/**
 *
 * @author GEDEON
 */
public abstract class AbstractForm {
    protected String resultat;
    protected Map<String, String> erreurs = new HashMap<>();

    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
    protected String getValeur(ServletRequest request, String nomChamp){
        String valeur = request.getParameter(nomChamp);
        if(valeur == null || valeur.trim().length() == 0)
            return null;
        else
            return valeur.trim();
    }
    protected void getErreur(String nomChamp, String message){
        erreurs.put(nomChamp, message);
    }
    protected void validateDesignation(String designation) throws Exception{
        if(designation == null)
            throw new Exception("Cette case ne doit pas être vide.");
        else if (designation.trim().length() < 3)
            throw new Exception ("Cette case doit contenir au moins 3 catecteres.");
    }
    protected void validateId(int id) throws Exception{
        if(id != 0 && id < 0)
            throw new Exception("Cette case doit contenir un nombre entier.");
        else if(id < 0)
            throw new Exception("Cette case ne doit pas contenir un nombre négatif.");
    }
    protected void validatePrix(float prix) throws Exception{
        if(prix < 0){
            throw new Exception ("Merci de saisir le prix unitaire.");
        }
        else if(prix != 0 && prix < 0)
            throw new Exception("Nombre invalide.");
        else if(prix < 0)
            throw new Exception("Nombre invalide.");
    }
}
