
package com.beans;

import java.sql.Date;

/**
 *
 * @author GEDEON
 */
public class Malade {
    private long id;
    private String nom;
    private String prenom;
    private String sexe;
    private Date naissance;
    private String lieu;
    private String residance;
    private String pere;
    private String mere;
    private String motif;

    public Malade() {
    }

    public Malade(long id, String nom, String prenom, String sexe, Date naissance, String lieu, String residance, String pere, String mere, String motif) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.naissance = naissance;
        this.lieu = lieu;
        this.residance = residance;
        this.pere = pere;
        this.mere = mere;
        this.motif = motif;
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getResidance() {
        return residance;
    }

    public void setResidance(String residance) {
        this.residance = residance;
    }

    public String getPere() {
        return pere;
    }

    public void setPere(String pere) {
        this.pere = pere;
    }

    public String getMere() {
        return mere;
    }

    public void setMere(String mere) {
        this.mere = mere;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
    
}
