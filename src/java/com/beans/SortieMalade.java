
package com.beans;

import java.util.Date;

/**
 *
 * @author GEDEON
 */
public class SortieMalade extends Sortie {
    private long id;
    private Malade malade;
    private String usersession;
    private int maladeid;
    private int idproduit;
    
    public SortieMalade() {
    }

    public SortieMalade(long id, Malade malade, String usersession, Date dateSortie) {
        this.id = id;
        this.malade = malade;
        this.usersession = usersession;
        
    }

    public SortieMalade(long id, Malade malade, String usersession, int quantite, double prixVenteU, Date dateSortie) {
        super(quantite, prixVenteU, dateSortie);
        this.id = id;
        this.malade = malade;
        this.usersession = usersession;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Malade getMalade() {
        return malade;
    }

    public void setMalade(Malade malade) {
        this.malade = malade;
    }

    public String getUsersession() {
        return usersession;
    }

    public void setUsersession(String usersession) {
        this.usersession = usersession;
    }

    public int getMaladeid() {
        return maladeid;
    }

    public void setMaladeid(int maladeid) {
        this.maladeid = maladeid;
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }
    
}
