
package com.forms;

import com.beans.Produit;
import javax.servlet.ServletRequest;

/**
 *
 * @author GEDEON
 */
public class ProduitForm extends AbstractForm {
    
    private static final String CHAMP_ID = "id";
    private static final String CHAMP_DESIGNATION ="designation";
    private static final String CHAMP_DOSAGE = "dosage";
    private static final String CHAMP_PVU ="prixVenteU";
    private static final String CHAMP_STALERT = "stockAlert";
    private static final String CHAMP_SOUSCATID = "souscategorie";
    private static final String CHAMP_USERSESSION = "utilisateur";
    
    public Produit createProduit(ServletRequest request){
        
        Produit produit = new Produit();
        String id = getValeur(request, CHAMP_ID);
        String designation = getValeur(request, CHAMP_DESIGNATION);
        String prixVenteU = getValeur(request, CHAMP_PVU);
        String stockAlert = getValeur(request, CHAMP_STALERT);
        String sousategorie = getValeur(request, CHAMP_SOUSCATID);
        String usersession = getValeur(request, CHAMP_USERSESSION);
        String dosage = getValeur (request, CHAMP_DOSAGE);
        
        try{
            validateId(Integer.parseInt(id));
        }catch(Exception e){
            getErreur(CHAMP_ID, e.getMessage());
        }
        produit.setId(Integer.parseInt(id));
        
        try{
            validateDesignation(designation);
        }catch(Exception e){
            getErreur(CHAMP_DESIGNATION, e.getMessage());
        }
        produit.setDesignation(designation);
        
        try{
            validatePrix(Float.parseFloat(prixVenteU));
        }catch(Exception e){
            getErreur(CHAMP_PVU, e.getMessage());
        }
       produit.setPrixVenteU(Float.parseFloat(prixVenteU));
        
        try{
            validateDesignation(dosage);
        }catch(Exception e){
            getErreur(CHAMP_DOSAGE, e.getMessage());
        }
        produit.setDosage(dosage);

        try{
            if(stockAlert.trim().equals("")){
                getErreur(CHAMP_STALERT, "Valeur nulle");
            }
            else{
                validateId(Integer.parseInt(stockAlert));  
            }
        }catch(Exception e){
            getErreur(CHAMP_STALERT, e.getMessage());
        }
         produit.setStockAlert(Integer.parseInt(stockAlert));
         
        try{
            validateDesignation(usersession);
        }catch(Exception e){
            getErreur(CHAMP_USERSESSION, e.getMessage());
        }
        produit.setUtilisateur(usersession);
        
        produit.setSouCatid(Integer.parseInt(sousategorie));
        produit.setStock(0);
        
        if(erreurs.isEmpty()){
            resultat = "Bien enregistrer";
        }else{
            resultat = "Echec d'enregistrement";
        }
        return produit;
    }
}
