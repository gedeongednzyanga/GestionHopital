
package com.forms;

import com.beans.Approvisionnement;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author GEDEON
 */
public class ApprovisionnementForm extends AbstractForm {
    
    //Approvisionnement
    private static final String CHAMP_ID = "id";
    private static final String CHAMP_DATE ="dateapprov";
    private static final String CHAMP_UTILISATEUR ="utilisateur";
    private static final String CHAMP_FOURNISSEUR ="fournisseur";
    
    //Detail approvisionnement
    private static final String CHAMP_QUANTITE = "quantite";
    private static final String CHAMP_PRIX = "prix";
    private static final String CHAMP_DFABRICATION = "fabrication";
    private static final String CHAMP_DEXPIRATION = "expiration";
    private static final String CHAMP_PRODUIT = "produit";
    
    public Approvisionnement nouveauApprovisionnement (HttpServletRequest request){
        
        Approvisionnement approvisionnement = new Approvisionnement();
        String id = getValeur(request, CHAMP_ID);
        String deteapprov = getValeur(request, CHAMP_DATE);
        String utilisateur = getValeur(request, CHAMP_UTILISATEUR);
        String fournisseur = getValeur(request, CHAMP_FOURNISSEUR);
        try{
            validateId(Integer.parseInt(id));
        }catch(Exception e){
            getErreur(CHAMP_ID, e.getMessage());
        }
        approvisionnement.setId(Long.parseLong(id));
        approvisionnement.setDateApprov(Date.valueOf(deteapprov));
        
        try{
            validateDesignation(utilisateur);
        }catch(Exception e){
            getErreur(CHAMP_UTILISATEUR, e.getMessage());
        }
        approvisionnement.setUserSession(utilisateur);
        approvisionnement.setIdFournisseur(Long.parseLong(fournisseur));
        
        if(erreurs.isEmpty()){
            resultat = "Bien enregistrer !!!";
        }else{
            resultat = "Echec d'enregistrement !!!";
        }
         
        return approvisionnement;
    }
    public Approvisionnement createApprovisionnement (HttpServletRequest request){
        
        Approvisionnement approvisionnement =new Approvisionnement();
        String id = getValeur(request, CHAMP_ID);
        String quantite = getValeur(request, CHAMP_QUANTITE);
        String prix = getValeur(request, CHAMP_PRIX);
        String fabrication = getValeur(request, CHAMP_DFABRICATION);
        String expiration = getValeur(request, CHAMP_DEXPIRATION);
        String produit = getValeur(request, CHAMP_PRODUIT);
        try{
            validateId(Integer.parseInt(id));
        }catch(Exception e){
            getErreur(CHAMP_ID, e.getMessage());
        }
        approvisionnement.setId(Long.parseLong(id));
        
        try{
            validateId(Integer.parseInt(quantite));
        }catch(Exception e){
            getErreur(CHAMP_QUANTITE, e.getMessage());
        }
        approvisionnement.setQuantite(Integer.parseInt(quantite));
        
        try{
            validatePrix(Float.parseFloat(prix));
        }catch(Exception e){
            getErreur(CHAMP_PRIX, e.getMessage());
        }
        approvisionnement.setPrixAchatU(Double.parseDouble(prix));
        approvisionnement.setDateFabrication(Date.valueOf(fabrication));
        approvisionnement.setDateExpiration(Date.valueOf(expiration));
        approvisionnement.setIdProduit(Integer.parseInt(produit));
        
        if(erreurs.isEmpty()){
            resultat = "Bien enregistrer !!!";
        }else{
            resultat = "Echec d'enregistrement !!!";
        }
//        try{
//            validatePrix(Float.parseFloat(prix));
//        }catch(Exception e){
//            getErreur(CHAMP_PRIX, e.getMessage());
//        }
//        approvisionnement.setPrixAchatU(Double.parseDouble(prix));
        
        return approvisionnement;
        
    }
}
