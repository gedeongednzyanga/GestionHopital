
package com.beans;

import java.sql.Date;

/**
 *
 * @author GEDEON
 */
public class Approvisionnement {
    
    private long id;
    private long idFournisseur;
    private long idProduit;
    private int quantite;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    private double prixAchatU;
    private String date;
    private Date dateApprov;
    private Date dateFabrication;
    private Date dateExpiration;
    private Date dateEnreg;
    private Produit produit;
    private Fournisseurs fournisseur;
    private String userSession;
    private int compteur;

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
    public Approvisionnement() {
    }

    public Approvisionnement(int compteur, long id, int quantite, double prixAchatU, Date dateApprov, Date dateFabrication, 
            Date dateExpiration, Produit produit, Fournisseurs fournisseur, String userSession, Date dateEnreg) {
        this.compteur = compteur;
        this.id = id;
        this.quantite = quantite;
        this.prixAchatU = prixAchatU;
        this.dateApprov = dateApprov;
        this.dateFabrication = dateFabrication;
        this.dateExpiration = dateExpiration;
        this.produit = produit;
        this.fournisseur = fournisseur;
        this.userSession = userSession;
        this.dateEnreg = dateEnreg;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixAchatU() {
        return prixAchatU;
    }

    public void setPrixAchatU(double prixAchatU) {
        this.prixAchatU = prixAchatU;
    }

    public Date getDateApprov() {
        return dateApprov;
    }

    public void setDateApprov(Date dateApprov) {
        this.dateApprov = dateApprov;
    }

    public Date getDateFabrication() {
        return dateFabrication;
    }

    public void setDateFabrication(Date dateFabrication) {
        this.dateFabrication = dateFabrication;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Fournisseurs getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseurs fournisseur) {
        this.fournisseur = fournisseur;
    }

    public String getUserSession() {
        return userSession;
    }

    public void setUserSession(String userSession) {
        this.userSession = userSession;
    }

    public long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(long idProduit) {
        this.idProduit = idProduit;
    }

    public Date getDateEnreg() {
        return dateEnreg;
    }

    public void setDateEnreg(Date dateEnreg) {
        this.dateEnreg = dateEnreg;
    }
    
}
