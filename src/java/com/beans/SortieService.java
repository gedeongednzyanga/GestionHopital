
package com.beans;

import java.util.Date;

/**
 *
 * @author GEDEON
 */
public class SortieService extends Sortie{
    
    private long id;
    private Service service;
    private Produit produit;
    private String usersession;
    private int serviceid;
    private int produitId;
    private float prixtotal;
    private int compt =0;
    private String facture;
    private Date dateenreg;
    
    public SortieService() {
    }

    public SortieService(long id, Service service, String usersession) {
        this.id = id;
        this.service = service;
        this.usersession = usersession;
    }

    public SortieService(int compt, long id, Service service, String usersession, int quantite, double prixVenteU, Date dateSortie, Produit produit) {
        super(quantite, prixVenteU, dateSortie);
        this.compt = compt;
        this.id = id;
        this.service = service;
        this.usersession = usersession;
        this.produit = produit;
    }
     public SortieService(int compt,String facture, long id, Service service, String usersession, int quantite, double prixVenteU, float prixtotal, Date dateSortie, Date dateenreg,Produit produit) {
        super(quantite, prixVenteU, dateSortie);
        this.compt = compt;
        this.facture = facture;
        this.id = id;
        this.service = service;
        this.usersession = usersession;
        this.prixtotal = prixtotal;
        this.dateenreg = dateenreg;
        this.produit = produit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getUsersession() {
        return usersession;
    }

    public void setUsersession(String usersession) {
        this.usersession = usersession;
    }

    public int getServiceid() {
        return serviceid;
    }

    public void setServiceid(int serviceid) {
        this.serviceid = serviceid;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public float getPrixtotal() {
        return prixtotal;
    }

    public void setPrixtotal(float prixtotal) {
        this.prixtotal = prixtotal;
    }

    public int getCompt() {
        return compt;
    }

    public void setCompt(int compt) {
        this.compt = compt;
    }

    public String getFacture() {
        return facture;
    }

    public void setFacture(String facture) {
        this.facture = facture;
    }

    public Date getDateenreg() {
        return dateenreg;
    }

    public void setDateenreg(Date dateenreg) {
        this.dateenreg = dateenreg;
    }
    
    
}
