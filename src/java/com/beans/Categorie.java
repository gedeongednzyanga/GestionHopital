
package com.beans;

/**
 *
 * @author GEDEON
 */
public class Categorie {
    private long id = 0;
    private String designation;
    private int compteur;

    public Categorie() {
    }

    public Categorie(int compteur, long id, String designation) {
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

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
}
