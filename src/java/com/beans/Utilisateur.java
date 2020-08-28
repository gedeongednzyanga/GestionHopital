
package com.beans;

/**
 *
 * @author GEDEON
 */
public class Utilisateur {
    
    private long id;
    private String nom;
    private String prenom;
    private String nomUtilisateur, compte;
    private String motdePasse;
    private int dSave, dUpdate, dDelete;
    private String page;
    private String profil;
    private int compt;
    public Utilisateur() {
    }

    public Utilisateur(int compt, long id, String nom, String prenom, String nomUtilisateur, String compte, String motdePasse, int dSave, int dUpdate, int dDelete,String page, String profil) {
        this.compt = compt;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomUtilisateur = nomUtilisateur;
        this.compte = compte;
        this.motdePasse = motdePasse;
        this.dSave = dSave;
        this.dUpdate = dUpdate;
        this.dDelete = dDelete;
        this.page = page;
        this.profil = profil;
    }
    public Utilisateur(long id, String nom, String prenom, String nomUtilisateur, String compte, String motdePasse, int dSave, int dUpdate, int dDelete,String page, String profil) {
        
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomUtilisateur = nomUtilisateur;
        this.compte = compte;
        this.motdePasse = motdePasse;
        this.dSave = dSave;
        this.dUpdate = dUpdate;
        this.dDelete = dDelete;
        this.page = page;
        this.profil = profil;
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

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getMotdePasse() {
        return motdePasse;
    }

    public void setMotdePasse(String motdePasse) {
        this.motdePasse = motdePasse;
    }

    public int getdSave() {
        return dSave;
    }

    public void setdSave(int dSave) {
        this.dSave = dSave;
    }

    public int getdUpdate() {
        return dUpdate;
    }

    public void setdUpdate(int dUpdate) {
        this.dUpdate = dUpdate;
    }

    public int getdDelete() {
        return dDelete;
    }

    public void setdDelete(int dDelete) {
        this.dDelete = dDelete;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public int getCompt() {
        return compt;
    }

    public void setCompt(int compt) {
        this.compt = compt;
    }
    
}
