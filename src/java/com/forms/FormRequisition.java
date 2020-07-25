/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.forms;

import com.beans.SortieMalade;
import com.beans.SortieService;
import java.sql.Date;
import javax.servlet.ServletRequest;

/**
 *
 * @author GEDEON
 */
public class FormRequisition extends AbstractForm {
    
    private static final String CHAMP_ID = "id";
    private static final String CHAMP_SERVICE ="service";
    private static final String CHAMP_USER = "utilisateur";
    private static final String CHAMP_DSORTIE = "datesorties";
    
    private static final String CHAMP_PRODUIT = "produit";
    private static final String CHAMP_QUANTITE = "quantite";
    
    
    public SortieService createRequisition (ServletRequest request){
        SortieService ss = new SortieService();
        String id = getValeur(request, CHAMP_ID);
        String service = getValeur(request, CHAMP_SERVICE);
        String user = getValeur(request, CHAMP_USER);
        String dsortie = getValeur(request, CHAMP_DSORTIE);
        
        ss.setId(Long.parseLong(id));
        ss.setServiceid(Integer.parseInt(service));
        ss.setUsersession(user);
        ss.setDateSortie(Date.valueOf(dsortie));
        
        return ss;   
    }
    
    public SortieService addToRecquisition (ServletRequest request){
        SortieService ss = new SortieService();
        String id = getValeur(request, CHAMP_ID);
        String produit = getValeur(request, CHAMP_PRODUIT);
        String quantite = getValeur(request, CHAMP_QUANTITE);
         
        ss.setId(Long.parseLong(id));
        ss.setProduitId(Integer.parseInt(produit));
        try{
            validateQuantite(Integer.parseInt(quantite));
        }catch(Exception e){
            getErreur(CHAMP_QUANTITE, e.getMessage());
        }
        ss.setQuantite(Integer.parseInt(quantite));
        
        return ss;   
    }
}
