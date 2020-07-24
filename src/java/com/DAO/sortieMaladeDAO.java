
package com.DAO;

import com.beans.SortieMalade;
import java.sql.Date;
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
        try{
            ps = this.connect.prepareStatement("CALL IUD_SORTIES_MALADE(?,?,?,?)");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setInt(3, obj.getQuantite());
            ps.setInt(4, obj.getIdproduit());
           
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }
    
    public SortieMalade createFacture(int actonU, SortieMalade obj){
        try{
            ps = this.connect.prepareStatement("CALL IUD_SORTIEMALADE(?,?,?,?,?)");
            ps.setInt(1, actonU);
            ps.setLong(2, obj.getId());
            ps.setInt(3, obj.getMaladeid());
            ps.setString(4, obj.getUsersession());
            ps.setDate(5, (Date) obj.getDateSortie());
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
