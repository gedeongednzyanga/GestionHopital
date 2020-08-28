
package com.forms;

import com.beans.Utilisateur;
import javax.servlet.ServletRequest;

/**
 *
 * @author GEDEON
 */
public class UtilisateurForm extends AbstractForm {
    
    private static final String ID = "id";
    private static final String NOM = "nom";
    private static final String PRENOM = "prenom";
    private static final String USERNAME = "username";
    private static final String MOTPASS = "motpass";
    private static final String DENREG = "denregistre";
    private static final String DMODIF = "dmodifier";
    private static final String DSUPPR = "dsupprimer";
    private static final String COMPTE = "compte";
    
    public Utilisateur createUser(ServletRequest request){
        Utilisateur utilisateur = new Utilisateur();
        String id = getValeur(request, ID);
        String nom = getValeur(request, NOM);
        String prenom = getValeur(request, PRENOM);
        String username = getValeur(request, USERNAME);
        String motpasse = getValeur(request, MOTPASS);
        String denregistre = getValeur(request, DENREG);
        String dmodifier = getValeur(request, DMODIF);
        String dsupprimer = getValeur(request, DSUPPR);
        String compte = getValeur(request, COMPTE);
        
        try{
            validateId(Integer.parseInt(id));
        }catch(Exception e){
            getErreur(id, ID);
        }
        utilisateur.setId(Integer.parseInt(id));
        
        try{
            validateDesignation(nom);
        }catch(Exception e){
            getErreur(NOM, e.getMessage());
        }
        utilisateur.setNom(nom);
        
        try{
            validateDesignation(prenom);
        }catch(Exception e){
            getErreur(PRENOM, e.getMessage());
        }
        utilisateur.setPrenom(prenom);
        
        try{
            validateDesignation(username);
        }catch(Exception e){
            getErreur(USERNAME, e.getMessage());
        }
        utilisateur.setNomUtilisateur(username);
        
        try{
            validateDesignation(motpasse);
        }catch(Exception e){
            getErreur(MOTPASS, e.getMessage());
        }
        utilisateur.setMotdePasse(motpasse);
        
        utilisateur.setCompte(compte);
        utilisateur.setdSave(Integer.parseInt(denregistre));
        utilisateur.setdUpdate(Integer.parseInt(dmodifier));
        utilisateur.setdDelete(Integer.parseInt(dsupprimer));
        
        
        if(erreurs.isEmpty()){
            resultat = "Bien enregistrer";
        }else{
            resultat = "Echec d'enregistrement";
        }
        return utilisateur;
        
    }
    
}
