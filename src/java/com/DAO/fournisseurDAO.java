
package com.DAO;

import com.beans.Fournisseurs;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GEDEON
 */
public class fournisseurDAO extends DAO<Fournisseurs>{
    
    private PreparedStatement ps;
    @Override
    public Fournisseurs operationIUD(int actionU, Fournisseurs obj) {
        try{
            ps = this.connect.prepareStatement("CALL IUD_FOURNISSEUR (?,?,?,?,?,?,?,?)");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setString(3, obj.getNom());
            ps.setString(4, obj.getPrenom());
            ps.setString(5, obj.getAdresse());
            ps.setString(6, obj.getTelephone());
            ps.setString(7, obj.getMail());
            ps.setString(8, obj.getSiteWeb());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }

    @Override
    public Fournisseurs find(int id) {
        Fournisseurs fournisseur = new Fournisseurs();
        try{
            ps = this.connect.prepareStatement("CALL GET_ONEFOURNISSEUR (?)");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                fournisseur.setId(id);
                fournisseur.setNom(rs.getString("fournisseur_nom"));
                fournisseur.setPrenom(rs.getString("fournisseur_prenom"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return fournisseur;
    }

    @Override
    public List getAll() {
        ArrayList<Fournisseurs> liste = new ArrayList<>();
        int compt =0;
        try{
            ps = this.connect.prepareStatement("CALL GET_FOURNISSEURS ()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                compt++;
                liste.add(new Fournisseurs(compt,Long.parseLong(rs.getString("fournisseur_id")), 
                        rs.getString("fournisseur_nom"), rs.getString("fournisseur_prenom"), 
                        rs.getString("fournisseur_adresse"), rs.getString("fournisseur_telephone"), 
                        rs.getString("fournisseur_mail"), rs.getString("fournisseur_website")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }
    
}
