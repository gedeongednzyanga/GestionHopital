
package com.Factory;

import com.DAO.DAO;

/**
 *
 * @author GEDEON
 */
public abstract class AbstractDAOFactory {
    
    public abstract DAO getCategorieDAO();
    public abstract DAO getSouscategorieDAO();
    public abstract DAO getFournisseurDAO();
    public abstract DAO getServiceDAO();
    public abstract DAO getProduitDAO();
    public abstract DAO getApprovisionnementDAO();
    public abstract DAO getSortieMaladeDAO();
    public abstract DAO getSortieServiceDAO();
    public abstract DAO getDetailapprovisionnementDAO();
    public abstract DAO getUtilisateurDAO();
    public abstract DAO getMaladeDAO();
    
    
    public static AbstractDAOFactory getFactory(FactoryType type){
        if(type.equals(type.MySQL)){
            return new MySQLDAOFactory();
        }
        return null;
    }
       
}
