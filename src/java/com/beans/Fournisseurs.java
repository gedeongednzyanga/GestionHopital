
package com.beans;

/**
 *
 * @author GEDEON
 */
public class Fournisseurs {
    
    private long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String mail;
    private String siteWeb;
    private int compt;

    public Fournisseurs() {
    }

    public Fournisseurs(int compt, long id, String nom, String prenom, String adresse, String telephone, String mail, String siteWeb) {
        this.compt = compt;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.mail = mail;
        this.siteWeb = siteWeb;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public int getCompt() {
        return compt;
    }

    public void setCompt(int compt) {
        this.compt = compt;
    }
    
}
