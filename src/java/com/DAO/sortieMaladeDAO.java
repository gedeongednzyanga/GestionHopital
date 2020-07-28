
package com.DAO;

import com.beans.Malade;
import com.beans.SortieMalade;
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
public class sortieMaladeDAO extends DAO<SortieMalade> {

    private PreparedStatement ps;
    @Override
    public SortieMalade operationIUD(int actionU, SortieMalade obj) {
        try{
            ps = this.connect.prepareStatement("CALL IUD_SORTIES_MALADE(?,?,?,?)");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setInt(3, obj.getQuantite());
            ps.setInt(4, obj.getIdproduit());
           
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }
    
    public SortieMalade createFacture(int actonU, SortieMalade obj){
        try{
            ps = this.connect.prepareStatement("CALL IUD_SORTIEMALADE(?,?,?,?,?)");
            ps.setInt(1, actonU);
            ps.setLong(2, obj.getId());
            ps.setInt(3, obj.getMaladeid());
            ps.setString(4, obj.getUsersession());
            ps.setDate(5, (Date) obj.getDateSortie());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }
    
    @Override
    public SortieMalade find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List getPanier(int id){
        ArrayList<SortieMalade> liste = new ArrayList<>();
        try{
            ps = this.connect.prepareStatement("CALL GET_ONESORTIEMALADE (?)");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                liste.add(new SortieMalade (Long.parseLong(rs.getString("sortiem_id")), new maladeDAO().find(Integer.parseInt(rs.getString("malade_id"))),
                rs.getString("user_session"), Integer.parseInt(rs.getString("quantite")), Double.parseDouble(rs.getString("sortie_pvu")),
                Date.valueOf(rs.getString("date_sortie")), new produitDAO().find(Integer.parseInt(rs.getString("ref_produit")))));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
