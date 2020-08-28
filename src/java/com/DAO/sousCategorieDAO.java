
package com.DAO;

import com.beans.SousCategorie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GEDEON
 */
public class sousCategorieDAO extends DAO<SousCategorie> {
    
    PreparedStatement ps;
    @Override
    public SousCategorie operationIUD(int actionU, SousCategorie obj) {
       try{
           PreparedStatement ps = this.connect.prepareStatement("CALL IUD_SOUSCATEGORIE (?,?,?)");
           ps.setInt(1, actionU);
           ps.setLong(2, obj.getId());
           ps.setString(3, obj.getDesignation());
          
           ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       return obj;
    }

    @Override
    public SousCategorie find(int id) {
        SousCategorie sousCategorie = new SousCategorie();
        try{
             ps = this.connect.prepareStatement("call GET_ONESOUSCATEGORIE (?) ");
             ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                sousCategorie.setId(id);
                sousCategorie.setDesignation(rs.getString("sousCat_designation"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return  sousCategorie;
    }

    @Override
    public List getAll() {
        int compteur = 0;
        List<SousCategorie> liste = new ArrayList<>();
        try{
            ps = this.connect.prepareStatement("CALL GET_SOUSCATEGORIE()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                compteur++;
                liste.add(new SousCategorie(compteur, Long.parseLong(rs.getString("sousCat_id")), rs.getString("sousCat_designation")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }
    
}
