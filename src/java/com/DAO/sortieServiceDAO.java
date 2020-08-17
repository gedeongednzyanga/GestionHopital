
package com.DAO;

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
public class sortieServiceDAO extends DAO<SortieService>{

    private PreparedStatement ps;
    @Override
    public SortieService operationIUD(int actionU, SortieService obj) {
        try{
            ps = this.connect.prepareStatement("CALL IUD_SORTIES_SERVICE (?,?,?,?)");
            ps.setInt(1, actionU);
            ps.setLong(2, obj.getId());
            ps.setInt(3, obj.getQuantite());
            ps.setInt(4, obj.getProduitId());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }

    @Override
    public SortieService find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public SortieService createRequisition(int actionu, SortieService obj){
        try{
            ps = this.connect.prepareStatement("CALL IUD_SORTIESERVICE (?,?,?,?,?)");
            ps.setInt(1, actionu);
            ps.setLong(2, obj.getId());
            ps.setInt(3, obj.getServiceid());
            ps.setString(4, obj.getUsersession());
            ps.setDate(5, (Date) obj.getDateSortie());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return obj;
    }

    @Override
    public List getAll() {
        ArrayList<SortieService> liste = new ArrayList<>();
        int compt = 0;
        try{
            ps = this.connect.prepareStatement("CALL GET_FACTURATION()");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                compt++;
                liste.add(new SortieService(compt, rs.getString("numfacture"), Long.parseLong(rs.getString("detail_id")), 
                new serviceDAO().find(Integer.parseInt(rs.getString("ref_service"))),
                rs.getString("user_session"), Integer.parseInt(rs.getString("sortie_quantite")), 
                Double.parseDouble(rs.getString("sortie_pvu")), Float.parseFloat(rs.getString("pvt")),
                Date.valueOf(rs.getString("date_sortie_s")),  Date.valueOf(rs.getString("date_enregist_s")),
                new produitDAO().find(Integer.parseInt(rs.getString("ref_produit")))));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }
    
    public List facture(String facture) {
        ArrayList<SortieService> liste = new ArrayList<>();
        int compt = 0;
        try{
            ps = this.connect.prepareStatement("CALL GET_ONEFACTURATION (?)");
            ps.setString(1, facture);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                compt++;
                liste.add(new SortieService(compt, rs.getString("numfacture"), Long.parseLong(rs.getString("detail_id")), 
                new serviceDAO().find(Integer.parseInt(rs.getString("ref_service"))),
                rs.getString("user_session"), Integer.parseInt(rs.getString("sortie_quantite")), 
                Double.parseDouble(rs.getString("sortie_pvu")), Float.parseFloat(rs.getString("pvt")),
                Date.valueOf(rs.getString("date_sortie_s")),  Date.valueOf(rs.getString("date_enregist_s")),
                new produitDAO().find(Integer.parseInt(rs.getString("ref_produit")))));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }
    
    public float sumValeur(String facture){
        float somme =0;
        try{
            ps = this.connect.prepareStatement("SELECT SUM(pvt) as total FROM get_facturation WHERE numfacture = ?");
            ps.setString(1, facture);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                somme = Float.parseFloat(rs.getString("total"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }   
        return somme;
    }
    
    
    public List getPanier(int id){
        ArrayList<SortieService> liste = new ArrayList<>();
        try{
            ps = this.connect.prepareStatement("CALL GET_ONESORTIESERVICE (?)");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                liste.add(new SortieService(Long.parseLong(rs.getString("sortie_id")), new serviceDAO().find(Integer.parseInt(rs.getString("ref_service"))),
                rs.getString("user_session"), Integer.parseInt(rs.getString("sortie_quantite")), Double.parseDouble(rs.getString("sortie_pvu")),
                Date.valueOf(rs.getString("date_sortie_s")), new produitDAO().find(Integer.parseInt(rs.getString("ref_produit")))));       
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return liste;
    }
    
}
