
package com.beans;

/**
 *
 * @author GEDEON
 */
public class Service {
    
    private long id;
    private String designation;
    private String description;
    private String responsable;
    private int compteur;

    public Service() {
    }

    public Service(int compteur, long id, String designation, String description, String responsable) {
        this.compteur = compteur;
        this.id = id;
        this.designation = designation;
        this.description = description;
        this.responsable = responsable;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
}
