
package com.beans;

import java.sql.Date;

/**
 *
 * @author GEDEON
 */
public class FicheStock extends Produit {
    private int quantitee;
    private int quantites;
    private int quantite;
    private Date dateperemption;

    public FicheStock() {
    }

    public FicheStock(int quantitee, int quantites, int quantite, Date dateperemption, long id, String designation, float prixVenteU, double prixVenteT, int compteur) {
        super(id, designation, prixVenteU, prixVenteT, compteur);
        this.quantitee = quantitee;
        this.quantites = quantites;
        this.quantite = quantite;
        this.dateperemption = dateperemption;
    }

    public int getQuantitee() {
        return quantitee;
    }

    public void setQuantitee(int quantitee) {
        this.quantitee = quantitee;
    }

    public int getQuantites() {
        return quantites;
    }

    public void setQuantites(int quantites) {
        this.quantites = quantites;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Date getDateperemption() {
        return dateperemption;
    }

    public void setDateperemption(Date dateperemption) {
        this.dateperemption = dateperemption;
    }

   
}
