
package com.forms;

import com.DAO.utilisateurDAO;
import com.beans.Utilisateur;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author GEDEON
 */
public class ConnexionForm extends AbstractForm{
    
    private static final String CHAMP_USERNAME ="user_name";
    private static final String CHAMP_MOTPASSE = "mot_passe";
    
    private void validateCahmp(String champ) throws Exception{
        if(champ == null && champ.equals("")){
            throw new Exception ("Veillez complètez cette case SVP.");
        }
    }
    
    public Utilisateur connexionUtilisateur(HttpServletRequest request){
        String username = getValeur(request, CHAMP_USERNAME);
        String password = getValeur(request, CHAMP_MOTPASSE);
        Utilisateur utilisateur = new Utilisateur();
        
        try{
            validateCahmp(username);
        }catch(Exception e){
            getErreur(CHAMP_USERNAME, e.getMessage());
        }
        utilisateur.setNomUtilisateur(username);
        try{
            validateCahmp(password);
        }catch(Exception e){
            getErreur(CHAMP_MOTPASSE, e.getMessage());
        }
        utilisateur.setMotdePasse(password);
        
        if(erreurs.isEmpty()){
            if(new utilisateurDAO().testConnexion(username, password) != null){
                resultat = "Vous etes connectes";
                return new utilisateurDAO().testConnexion(username, password);
            }else{
                resultat = "Echec de connexion. Nom d'utilisateur ou mot de passe icorrect.";
               return null;
            }
        }else{
            resultat = "Echec de connexion. Nom d'utilisateur introuvable.";
            return utilisateur;
        }
       
    }
}
