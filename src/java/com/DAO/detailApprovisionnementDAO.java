
package com.DAO;

import com.beans.Approvisionnement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author GEDEON
 */
public class detailApprovisionnementDAO extends DAO<Approvisionnement> {
    private PreparedStatement ps;
    @Override
    public Approvisionnement operationIUD(int actionU, Approvisionnement obj) {
       try{
           ps = this.connect.prepareStatement("CALL IUD_DETAILAPPROV (?,?,?,?,?,?,?)");
           ps.setInt(1, actionU);
           ps.setLong(2, obj.getId());
           ps.setInt(3, obj.getQuantite());
           ps.setDouble(4, obj.getPrixAchatU());
           ps.setDate(5, obj.getDateFabrication());
           ps.setDate(6, obj.getDateExpiration());
           ps.setLong(7, obj.getIdProduit());
           ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
        return obj;
    }

    @Override
    public Approvisionnement find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
