
package com.beans;

/**
 *
 * @author GEDEON
 */
public class SousCategorie {
    
    private long id = 0;
    private String designation;
    private long idcategorie;
    private Categorie categorie;
    private int compteur;

    public SousCategorie() {
    }

    public SousCategorie(long id, String designation, long idcategorie) {
        
        this.id = id;
        this.designation = designation;
        this.idcategorie = idcategorie;
    }
     public SousCategorie(int compteur,long id, String designation) {
         this.compteur = compteur;
        this.id = id;
        this.designation = designation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public long getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(long idcategorie) {
        this.idcategorie = idcategorie;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
    
}
