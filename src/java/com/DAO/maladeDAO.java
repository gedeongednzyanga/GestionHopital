
package com.DAO;

import com.beans.Malade;
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
public class maladeDAO  extends DAO<Malade> {

    private PreparedStatement ps;
    @Override
    public Malade operationIUD(int actionU, Malade obj) {
       try{
           ps = this.connect.prepareStatement("CALL IUD_MALADE (?,?,?,?,?,?,?,?,?,?,?)");
           ps.setInt(1, actionU);
           ps.setLong(2, obj.getId());
           ps.setString(3, obj.getNom());
           ps.setString(4, obj.getPrenom());
           ps.setString(5, obj.getSexe());
           ps.setDate(6, obj.getNaissance());
           ps.setString(7, obj.getLieu());
           ps.setString(8, obj.getResidance());
           ps.setString(9, obj.getPere());
           ps.setString(10, obj.getMere());
           ps.setString(11, obj.getMotif());
           ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       return obj;
    }

    @Override
    public Malade find(int id) {
        Malade malade = new Malade();
        try{
            ps = this.connect.prepareStatement("CALL ");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                malade.setId(id); malade.setNom(rs.getString("")); 
                malade.setPrenom(rs.getString("")); malade.setSexe(rs.getString("")); 
                malade.setNaissance(Date.valueOf(rs.getString("")));
                malade.setLieu(rs.getString("")); malade.setResidance(rs.getString(""));
                malade.setPere(rs.getString("")); malade.setMere(rs.getString(""));
                malade.setMotif(rs.getString("")); 
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return malade;
    }

    @Override
    public List getAll() {
        ArrayList liste = new ArrayList<>();
        try{
            ps = this.connect.prepareStatement("CALL ");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                liste.add(new Malade(Long.parseLong(rs.getString("")),rs.getString(""), rs.getString(""),
                rs.getString(""),Date.valueOf(rs.getString("")), rs.getString(""), rs.getString(""), 
                rs.getString(""), rs.getString(""), rs.getString("")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }
    
}
