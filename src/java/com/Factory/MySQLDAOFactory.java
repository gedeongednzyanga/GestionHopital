
package com.Factory;

import com.DAO.DAO;
import com.DAO.approvisionnementDAO;
import com.DAO.categorieDAO;
import com.DAO.detailApprovisionnementDAO;
import com.DAO.fournisseurDAO;
import com.DAO.maladeDAO;
import com.DAO.produitDAO;
import com.DAO.serviceDAO;
import com.DAO.sortieMaladeDAO;
import com.DAO.sortieServiceDAO;
import com.DAO.sousCategorieDAO;
import com.DAO.utilisateurDAO;
import com.beans.Approvisionnement;
import com.beans.Categorie;
import com.beans.Fournisseurs;
import com.beans.Produit;
import com.beans.Service;
import com.beans.SortieMalade;
import com.beans.SortieService;
import com.beans.SousCategorie;
/**
 *
 * @author GEDEON
 */
public class MySQLDAOFactory  extends AbstractDAOFactory {

    @Override
    public DAO<Categorie> getCategorieDAO() {
        return new categorieDAO();
    }
    @Override
    public DAO<SousCategorie> getSouscategorieDAO() {
        return new sousCategorieDAO();
    }
    @Override
    public DAO<Fournisseurs> getFournisseurDAO(){
        return new fournisseurDAO();
    }
    @Override
    public DAO<Service> getServiceDAO(){
        return new serviceDAO();
    }
    @Override
    public DAO<Produit> getProduitDAO(){
        return new produitDAO();
    }
    @Override
    public DAO<Approvisionnement> getApprovisionnementDAO(){
        return new approvisionnementDAO();
    }   
    @Override
    public DAO<SortieMalade> getSortieMaladeDAO(){
        return new sortieMaladeDAO();
    }
    @Override
    public DAO<SortieService> getSortieServiceDAO(){
        return new sortieServiceDAO();
    }

    @Override
    public DAO getDetailapprovisionnementDAO() {
        return new detailApprovisionnementDAO();
    }
    @Override
    public DAO getUtilisateurDAO(){
        return new utilisateurDAO();
    }

    @Override
    public DAO getMaladeDAO() {
        return new maladeDAO();
    }
   
}
