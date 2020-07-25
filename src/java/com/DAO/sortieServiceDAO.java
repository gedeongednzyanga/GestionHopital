
package com.DAO;

import com.beans.SortieService;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author GEDEON
 */
public class sortieServiceDAO extends DAO<SortieService>{

    private PreparedStatement ps;
    @Override
    public SortieService operationIUD(int actionU, SortieService obj) {
        try{
            ps = this.connect.prepareStatement("CALL IUD_SORTIES_SERVICE (?,?,?,?)");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setInt(3, obj.getQuantite());
            ps.setInt(4, obj.getProduitId());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }

    @Override
    public SortieService find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public SortieService createRequisition(int actionu, SortieService obj){
        try{
            ps = this.connect.prepareStatement("CALL IUD_SORTIESERVICE (?,?,?,?,?)");
            ps.setInt(1, actionu);
            ps.setLong(2, obj.getId());
            ps.setInt(3, obj.getServiceid());
            ps.setString(4, obj.getUsersession());
            ps.setDate(5, (Date) obj.getDateSortie());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
