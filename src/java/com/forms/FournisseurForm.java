
package com.forms;

import com.beans.Fournisseurs;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author GEDEON
 */
public class FournisseurForm extends AbstractForm {
    
    private static final String CHAMP_ID = "id";
    private static final String CHAMP_NOM = "nom";
    private static final String CHAMP_PRENOM = "prenom";
    private static final String CHAMP_ADRESSE = "adresse";
    private static final String CHAMP_TEL = "telephone";
    private static final String CHAMP_MAIL = "mail";
    private static final String CHAMP_WEB = "web";
    
    public Fournisseurs createFournisseur (HttpServletRequest request){
        
        Fournisseurs fournisseur = new Fournisseurs();
        String id = getValeur(request, CHAMP_ID);
        String nom = getValeur(request, CHAMP_NOM);
        String prenom = getValeur(request, CHAMP_PRENOM);
        String adresse = getValeur(request, CHAMP_ADRESSE);
        String telephone = getValeur(request, CHAMP_TEL);
        String mail = getValeur(request, CHAMP_MAIL);
        String web = getValeur(request, CHAMP_WEB);
        
       
        fournisseur.setId(Long.parseLong(id));
        
        try{
            validateDesignation(nom);
        }catch(Exception e){
            getErreur(CHAMP_NOM, e.getMessage());
        }
        fournisseur.setNom(nom);
        
        try{
            validateDesignation(prenom);
        }catch(Exception e){
            getErreur(CHAMP_PRENOM, e.getMessage());
        }
        fournisseur.setPrenom(prenom);
        
         try{
            validateDesignation(adresse);
        }catch(Exception e){
            getErreur(CHAMP_ADRESSE, e.getMessage());
        }
        fournisseur.setAdresse(adresse);
        
         try{
            validateDesignation(telephone);
        }catch(Exception e){
            getErreur(CHAMP_TEL, e.getMessage());
        }
         fournisseur.setTelephone(telephone);
        
        try{
            validateDesignation(mail);
        }catch(Exception e){
            getErreur(CHAMP_MAIL, e.getMessage());
        }
        fournisseur.setMail(mail);
        
        try{
            validateDesignation(web);
        }catch(Exception e){
            getErreur(CHAMP_WEB, e.getMessage());
        }
        fournisseur.setSiteWeb(web);
        if(erreurs.isEmpty()){
            resultat = "Bien enregistrer !!";
        }else{
            resultat = "Echec d'enregistrement";
        }
        return fournisseur;
    }
    //private static final String CHAMP_
}
