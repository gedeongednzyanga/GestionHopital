
package com.beans;

/**
 *
 * @author GEDEON
 */
public class Produit {
    
    private long id;
    private String designation;
    private String dosage;
    private float prixVenteU;
    private double prixVenteT;
    private int stockAlert;
    private int stock = 0;
    private int souCatid;
    private SousCategorie sousCategorie;
 
    private String utilisateur;
    private int compteur;
    public Produit() {
    }

    public Produit( int compteur, long id, String designation, String dosage, float prixVenteU, double prixVenteT, int stockAlert, 
            int stock, SousCategorie sousCategorie, String usersession) {
        this.compteur = compteur;
        this.id = id;
        this.designation = designation;
        this.dosage = dosage;
        this.prixVenteU = prixVenteU;
        this.prixVenteT = prixVenteT;
        this.stockAlert = stockAlert;
        this.stock = stock;
        this.sousCategorie = sousCategorie;
        this.utilisateur = usersession;
       
    }

    public Produit(long id, String designation, float prixVenteU, double prixVenteT, int compteur) {
        this.id = id;
        this.designation = designation;
        this.prixVenteU = prixVenteU;
        this.prixVenteT = prixVenteT;
        this.compteur = compteur;
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

    public float getPrixVenteU() {
        return prixVenteU;
    }

    public void setPrixVenteU(float prixVenteU) {
        this.prixVenteU = prixVenteU;
    }

    public double getPrixVenteT() {
        return prixVenteT;
    }

    public void setPrixVenteT(double prixVenteT) {
        this.prixVenteT = prixVenteT;
    }

    public int getStockAlert() {
        return stockAlert;
    }

    public void setStockAlert(int stockAlert) {
        this.stockAlert = stockAlert;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public SousCategorie getSousCategorie() {
        return sousCategorie;
    }

    public void setSousCategorie(SousCategorie sousCategorie) {
        this.sousCategorie = sousCategorie;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String usersession) {
        this.utilisateur = usersession;
    }

    public int getSouCatid() {
        return souCatid;
    }

    public void setSouCatid(int souCatid) {
        this.souCatid = souCatid;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

   

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
    
}
