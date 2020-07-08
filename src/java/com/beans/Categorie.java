
package com.beans;

/**
 *
 * @author GEDEON
 */
public class Categorie {
    private long id = 0;
    private String designation;

    public Categorie() {
    }

    public Categorie(long id, String designation) {
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
}
