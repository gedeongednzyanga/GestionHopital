
package com.DAO;

import com.beans.Utilisateur;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GEDEON
 */
public class utilisateurDAO extends DAO<Utilisateur> {
    
    private PreparedStatement ps;

    @Override
    public Utilisateur operationIUD(int actionU, Utilisateur obj) {
       try{
           ps =this.connect.prepareStatement("CALL IUD_USER (?,?,?,?,?,?,?,?,?,?)");
           ps.setInt(1, actionU);
           ps.setLong(2, obj.getId());
           ps.setString(3, obj.getNom());
           ps.setString(4, obj.getPrenom());
           ps.setString(5, obj.getNomUtilisateur());
           ps.setString(6, obj.getMotdePasse());
           ps.setString(7, obj.getCompte());
           ps.setInt(8, obj.getdSave());
           ps.setInt(9, obj.getdUpdate());
           ps.setInt(10, obj.getdDelete());
           ps.executeUpdate();
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       return obj;
    }

    @Override
    public Utilisateur find(int id) {
        Utilisateur utilisateur = new Utilisateur();
        try{
            ps = this.connect.prepareStatement("CALL GET_ONEUTILISATEUR (?)");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                utilisateur.setId(id);
                utilisateur.setNom(rs.getString(""));
                utilisateur.setPrenom(rs.getString(""));
                utilisateur.setNomUtilisateur(rs.getString(""));
                utilisateur.setMotdePasse(rs.getString(""));
                utilisateur.setCompte(rs.getString(""));
                utilisateur.setdSave(Integer.parseInt(rs.getString("")));
                utilisateur.setdUpdate(Integer.parseInt(rs.getString("")));
                utilisateur.setdDelete(Integer.parseInt(rs.getString("")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return utilisateur;
    }

    @Override
    public List getAll() {
       ArrayList<Utilisateur> liste = new ArrayList<>();
       try{
           ps = this.connect.prepareStatement("CALL GET_UTILISATEUR()");
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               liste.add(new Utilisateur(Long.parseLong(rs.getString("")), 
                       rs.getString(""), rs.getString(""), rs.getString(""), 
                       rs.getString(""), rs.getString(""), Integer.getInteger(rs.getString("")),
                       Integer.parseInt(rs.getString("")), Integer.parseInt(rs.getString(""))));
           }
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       return liste;
    }
    
    public Utilisateur  testConnexion(String nomuser, String passe){
         Utilisateur utilisateur = null;
        try{
            ps = this.connect.prepareStatement("CALL TEST_CONNEXION (?,?)");
            ps.setString(1, nomuser);
            ps.setString(2, passe);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                utilisateur = new Utilisateur(Integer.parseInt(rs.getString("utilisateur_id")), 
                        rs.getString("utilisateur_nom"), rs.getString("utilisateur_prenom"), 
                        rs.getString("utilisateur_username"), rs.getString("utilisateur_passe"), 
                        rs.getString("utilisateur_compte"), Integer.parseInt(rs.getString("dSave")), 
                        Integer.parseInt(rs.getString("dUpdate")), 
                        Integer.parseInt(rs.getString("dDelete")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return utilisateur;
    }
}
