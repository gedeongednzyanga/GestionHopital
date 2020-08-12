
package com.DAO;

import com.beans.Service;
import com.beans.SortieService;
import java.sql.Date;
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
            ps = this.connect.prepareStatement("CALL IUD_SERVICE(?,?,?,?,?)");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setString(3, obj.getDesignation());
            ps.setString(4, obj.getDescription());
            ps.setString(5, obj.getResponsable());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }
    

    @Override
    public Service find(int id) {
        Service service = new Service();
        try{
            ps = this.connect.prepareStatement("CALL GET_ONESERVICE (?)");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                service.setId(Long.parseLong(rs.getString("service_id")));
                service.setDesignation(rs.getString("service_designation"));
                service.setDescription(rs.getString("service_detail"));
                service.setResponsable(rs.getString("service_responsable"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return service;
    }
    


    @Override
    public List getAll() {
        ArrayList<Service> liste = new ArrayList<>();
        int compt =0;
        try{
            ps = this.connect.prepareStatement("CALL GET_SERVICES ()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                compt ++;
                liste.add(new Service(compt, Long.parseLong(rs.getString("service_id")),rs.getString("service_designation"),
                rs.getString("service_detail"), rs.getString("service_responsable")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }
    
}
