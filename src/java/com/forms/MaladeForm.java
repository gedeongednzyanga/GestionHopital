
package com.forms;

import com.beans.Malade;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author GEDEON
 */
public class MaladeForm extends AbstractForm {
    
    private static final String CHAMP_ID ="id";
    private static final String CHAMP_NOM = "nom";
    private static final String CHAMP_PRENOM ="prenom";
    private static final String CHAMP_SEXE = "sexe";
    private static final String CHAMP_DATENAISSE ="naissance";
    private static final String CHAMP_LIEU = "lieu";
    private static final String CHAMP_RESIDANCE ="residance";
    private static final String CHAMP_PERE = "pere";
    private static final String CHAMP_MERE = "mere";
    private static final String CHAMP_MOTIF ="motif";
    
    public Malade createMalade(HttpServletRequest request){
        String id = getValeur(request, CHAMP_ID);
        String nom = getValeur(request, CHAMP_NOM);
        String prenom = getValeur(request, CHAMP_PRENOM);
        String sexe = getValeur(request, CHAMP_SEXE);
        String naissance = getValeur(request, CHAMP_DATENAISSE);
        String lieu = getValeur(request, CHAMP_LIEU);
        String residance = getValeur(request, CHAMP_RESIDANCE);
        String pere = getValeur(request, CHAMP_PERE);
        String mere = getValeur(request, CHAMP_MERE);
        String motif = getValeur(request, CHAMP_MOTIF);
        Malade malade = new Malade();
        
        malade.setId(Long.parseLong(id));
        try{
            validateDesignation(nom);
        }catch(Exception e){
            getErreur(CHAMP_NOM, e.getMessage());
        }
        malade.setNom(nom);
        
        try{
            validateDesignation(prenom);
        }catch(Exception e){
            getErreur(CHAMP_PRENOM, e.getMessage());
        }
        malade.setPrenom(prenom);
        malade.setSexe(sexe);
        malade.setNaissance(Date.valueOf(naissance));
        
        try{
            validateDesignation(lieu);
        }catch(Exception e){
            getErreur(CHAMP_LIEU, e.getMessage());
        }
        malade.setLieu(lieu);
        
        try{
            validateDesignation(residance);
        }catch(Exception e){
            getErreur(CHAMP_RESIDANCE, e.getMessage());
        }
        malade.setResidance(residance);
        
        try{
            validateDesignation(pere);
        }catch(Exception e){
            getErreur(CHAMP_PERE, e.getMessage());
        }
        malade.setPere(pere);
        
        try{
            validateDesignation(mere);
        }catch(Exception e){
            getErreur(CHAMP_MERE, e.getMessage());
        }
        malade.setMere(mere);
        
        try{
            validateDesignation(motif);
        }catch(Exception e){
            getErreur(CHAMP_MOTIF, e.getMessage());
        }
        malade.setMotif(motif);
        
        if(erreurs.isEmpty()){
            resultat = "Bien enregistrer ";
        }else{
            resultat = "Echec";
        }
        return malade;
    }
}
