
package com.DAO;

import com.beans.Categorie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GEDEON
 */
public class categorieDAO  extends DAO<Categorie> {
    
    private PreparedStatement ps;
    @Override
    public Categorie operationIUD(int actionU, Categorie obj) {
        try{
            ps = this.connect.prepareStatement("CALL IUD_CATEGORIE (?,?,?,?)");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setString(3, obj.getDesignation());
            ps.setString(4, obj.getUtilisateur());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }

    @Override
    public Categorie find(int id) {
        Categorie categorie = new Categorie();
        try{
            ps = this.connect.prepareStatement("CALL GET_ONECATEGORIE (?)");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                categorie.setId(id);
                categorie.setDesignation(rs.getString("cat_designation"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return categorie;
    }

    @Override
    public List getAll() {
        int compteur =0;
       ArrayList<Categorie> categorieList = new ArrayList<>();
       try{
           ps = this.connect.prepareStatement("CALL GET_CATEGORIE()");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               compteur++;
               categorieList.add(new Categorie(compteur,Long.parseLong(rs.getString("cat_id")), rs.getString("cat_designation")));
           }
       }catch(NumberFormatException | SQLException e){
           System.out.println(e.getMessage());
       }
      return categorieList;
    }
}
