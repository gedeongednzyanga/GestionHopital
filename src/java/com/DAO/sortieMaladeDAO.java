
package com.DAO;

import com.beans.SortieMalade;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author GEDEON
 */
public class sortieMaladeDAO extends DAO<SortieMalade> {

    private PreparedStatement ps;
    @Override
    public SortieMalade operationIUD(int actionU, SortieMalade obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public SortieMalade createFacture(int actonU, SortieMalade obj){
        try{
            ps = this.connect.prepareStatement("CALL IUD_SORTIEMALADE(?,?,?,?)");
            ps.setInt(1, actonU);
            ps.setLong(2, obj.getId());
            ps.setInt(3, obj.getMaladeid());
            ps.setString(4, obj.getUsersession());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }

    @Override
    public SortieMalade find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
