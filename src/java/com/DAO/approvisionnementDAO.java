
package com.DAO;

import com.beans.Approvisionnement;
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
public class approvisionnementDAO extends DAO<Approvisionnement> {
    
    private PreparedStatement ps;
    @Override
    public Approvisionnement operationIUD(int actionU, Approvisionnement obj) {
        try{
            ps = this.connect.prepareStatement("CALL IUD_APPROVISIONNEMENT(?,?,?,?,?)");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setDate(3, obj.getDateApprov());
            ps.setString(4, obj.getUserSession());
            ps.setLong(5, obj.getIdFournisseur());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }

    @Override
    public Approvisionnement find(int id) {
       Approvisionnement approvisionnement = new Approvisionnement();
       
       return approvisionnement;
    }

    @Override
    public List getAll() {
        ArrayList<Approvisionnement> liste = new ArrayList<>();
        try{
            ps = this.connect.prepareStatement("CALL GET_APPROVISIONNEMENT()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                liste.add(new Approvisionnement(Long.parseLong(rs.getString("detail_id")), 
                        Integer.parseInt(rs.getString("detail_quantite")), Double.parseDouble(rs.getString("detail_pua")), 
                        Date.valueOf(rs.getString("approv_date")), Date.valueOf(rs.getString("detail_dFabrication")),
                        Date.valueOf(rs.getString("detail_dExpiration")), 
                        new produitDAO().find(Integer.parseInt(rs.getString("produit_id"))), 
                        new fournisseurDAO().find(Integer.parseInt(rs.getString("fournisseur_id"))), 
                        rs.getString("user_session")  ));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }

  
    
}