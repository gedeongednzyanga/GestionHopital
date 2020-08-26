
package com.DAO;

import com.beans.FicheStock;
import com.beans.Produit;
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
public class produitDAO  extends DAO<Produit> {

    PreparedStatement ps ;

    @Override
    public Produit operationIUD(int actionU, Produit obj) {
        try{
            ps = this.connect.prepareStatement("CALL IUD_PRODUIT (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setString(3, obj.getDesignation());
            ps.setDouble(4, obj.getPrixVenteU());
            ps.setInt(5, obj.getStockAlert());
            ps.setInt(6, obj.getStock());
            ps.setString(7, obj.getUtilisateur());
            ps.setLong(8, obj.getSouCatid());
            ps.setString(9, obj.getDosage());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
 //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Produit find(int id) {
        Produit produit = new Produit();
        try{
            ps = this.connect.prepareStatement("CALL GET_ONEPRODUIT (?)");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                produit.setId(id);
                produit.setDesignation(rs.getString("produit_designation"));
                produit.setDosage(rs.getString("dosage"));
                produit.setPrixVenteU(Integer.parseInt(rs.getString("produit_pvu")));
                produit.setStockAlert(Integer.parseInt(rs.getString("produit_sts")));
                
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return produit;
    }

    @Override
    public List getAll() {
        int compteur =0;
        ArrayList<Produit> listeProduit = new ArrayList<>();
        try{
            ps = this.connect.prepareStatement("CALL GET_PRODUITS()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                compteur++;
                listeProduit.add(new Produit(compteur, Long.parseLong(rs.getString("produit_id")), rs.getString("produit_designation"),
                    rs.getString("dosage"), Float.parseFloat(rs.getString("produit_pvu")), Double.parseDouble(rs.getString("pvt")),
                    Integer.parseInt(rs.getString("produit_sts")), Integer.parseInt(rs.getString("produit_stock")), 
                    new sousCategorieDAO().find(Integer.parseInt(rs.getString("refSous_cat"))), rs.getString("user_session"),
                new categorieDAO().find(Integer.parseInt(rs.getString("cat_id")))));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return listeProduit;
    }
    
    public List getFiche(){
        int compteur = 0;
        ArrayList<FicheStock> fiche = new ArrayList<>();
        try{
            ps = this.connect.prepareStatement("CALL  GET_FICHESTOCK ()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                compteur++;
                fiche.add(new FicheStock(Integer.parseInt(rs.getString("quantitee")),Integer.parseInt(rs.getString("quantites")),
                Integer.parseInt(rs.getString("quantiter")), Date.valueOf(rs.getString("dateperemption")), 
                Long.parseLong(rs.getString("ref_prod")), rs.getString("produit_designation"), Float.parseFloat(rs.getString("prixu")), 
                Float.parseFloat(rs.getString("prixtot")), compteur ));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return fiche;
    }
}
