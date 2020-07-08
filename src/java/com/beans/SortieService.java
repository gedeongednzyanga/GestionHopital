
package com.beans;

import java.util.Date;

/**
 *
 * @author GEDEON
 */
public class SortieService extends Sortie{
    
    private long id;
    private Service service;
    private String usersession;

    public SortieService() {
    }

    public SortieService(long id, Service service, String usersession) {
        this.id = id;
        this.service = service;
        this.usersession = usersession;
    }

    public SortieService(long id, Service service, String usersession, int quantite, double prixVenteU, Date dateSortie) {
        super(quantite, prixVenteU, dateSortie);
        this.id = id;
        this.service = service;
        this.usersession = usersession;
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
    
    
}
