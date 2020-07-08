
package com.beans;

import java.util.Date;

/**
 *
 * @author GEDEON
 */
public class Sortie {
    
    private int quantite;
    private double prixVenteU;
    private Date dateSortie;

    public Sortie() {
    }

    public Sortie(int quantite, double prixVenteU, Date dateSortie) {
        this.quantite = quantite;
        this.prixVenteU = prixVenteU;
        this.dateSortie = dateSortie;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixVenteU() {
        return prixVenteU;
    }

    public void setPrixVenteU(double prixVenteU) {
        this.prixVenteU = prixVenteU;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

}
