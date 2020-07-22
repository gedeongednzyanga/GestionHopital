
package com.forms;

import com.beans.SortieMalade;
import javax.servlet.ServletRequest;

/**
 *
 * @author GEDEON
 */
public class FactureForm extends AbstractForm {
    private static final String CHAMP_ID = "id";
    private static final String CHAMP_MALADE ="malade";
    private static final String CHAMP_USER = "utilisateur";
    
    public SortieMalade createFacture (ServletRequest request){
        SortieMalade sm = new SortieMalade();
        String id = getValeur(request, CHAMP_ID);
        String malade = getValeur(request, CHAMP_MALADE);
        String user = getValeur(request, CHAMP_USER);
        
        sm.setId(Long.parseLong(id));
        sm.setMaladeid(Integer.parseInt(malade));
        sm.setUsersession(user);
        
        return sm;
        
    }
    
}
