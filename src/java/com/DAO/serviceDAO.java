
package com.DAO;

import com.beans.Service;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author GEDEON
 */
public class serviceDAO extends DAO<Service>{

    @Override
    public Service operationIUD(int actionU, Service obj) {
        try{
            PreparedStatement ps = this.connect.prepareStatement("CALL ");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setString(3, obj.getDesignation());
            ps.setString(4, obj.getDescription());
            ps.setString(5, obj.getResonsable());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Service find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
