
package com.forms;

import com.beans.SortieMalade;
import java.sql.Date;
import javax.servlet.ServletRequest;

/**
 *
 * @author GEDEON
 */
public class FactureForm extends AbstractForm {
    private static final String CHAMP_ID = "id";
    private static final String CHAMP_MALADE ="malade";
    private static final String CHAMP_USER = "utilisateur";
    private static final String CHAMP_DSORTIE = "datesortiem";
    
    private static final String CHAMP_PRODUIT = "produit";
    private static final String CHAMP_QUANTITE = "quantite";
    
    
    public SortieMalade createFacture (ServletRequest request){
        SortieMalade sm = new SortieMalade();
        String id = getValeur(request, CHAMP_ID);
        String malade = getValeur(request, CHAMP_MALADE);
        String user = getValeur(request, CHAMP_USER);
        String dsortie = getValeur(request, CHAMP_DSORTIE);
        
        sm.setId(Long.parseLong(id));
        sm.setMaladeid(Integer.parseInt(malade));
        sm.setUsersession(user);
        sm.setDateSortie(Date.valueOf(dsortie));
        
        return sm;   
    }
    
    public SortieMalade addToFacture (ServletRequest request){
        SortieMalade sm = new SortieMalade();
        String id = getValeur(request, CHAMP_ID);
        String produit = getValeur(request, CHAMP_PRODUIT);
        String quantite = getValeur(request, CHAMP_QUANTITE);
         
        sm.setId(Long.parseLong(id));
        sm.setIdproduit(Integer.parseInt(produit));
        try{
            validateQuantite(Integer.parseInt(quantite));
        }catch(Exception e){
            getErreur(CHAMP_QUANTITE, e.getMessage());
        }
        sm.setQuantite(Integer.parseInt(quantite));
        
        return sm;   
    }
    
}
