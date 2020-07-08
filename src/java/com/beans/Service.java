
package com.beans;

/**
 *
 * @author GEDEON
 */
public class Service {
    
    private long id;
    private String designation;
    private String description;
    private String resonsable;

    public Service() {
    }

    public Service(long id, String designation, String description, String resonsable) {
        this.id = id;
        this.designation = designation;
        this.description = description;
        this.resonsable = resonsable;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResonsable() {
        return resonsable;
    }

    public void setResonsable(String resonsable) {
        this.resonsable = resonsable;
    }
}
