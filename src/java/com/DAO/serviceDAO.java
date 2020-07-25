
package com.DAO;

import com.beans.Service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author GEDEON
 */
public class serviceDAO extends DAO<Service>{

    private PreparedStatement ps;
    @Override
    public Service operationIUD(int actionU, Service obj) {
        try{
            ps = this.connect.prepareStatement("CALL ");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setString(3, obj.getDesignation());
            ps.setString(4, obj.getDescription());
            ps.setString(5, obj.getResonsable());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }
    

    @Override
    public Service find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        ArrayList<Service> liste = new ArrayList<>();
        try{
            ps = this.connect.prepareStatement("CALL GET_SERVICES ()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                liste.add(new Service(Long.parseLong(rs.getString("service_id")),rs.getString("service_designation"),
                rs.getString("service_detail"), rs.getString("service_responsable")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }
    
}
