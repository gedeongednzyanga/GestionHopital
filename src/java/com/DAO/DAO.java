
package com.DAO;

import com.connectionSingleton.ConnexionDB;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author GEDEON
 */
public abstract class DAO<T> {
    
    protected Connection connect = ConnexionDB.getInstance();
    
    public abstract T operationIUD(int actionU, T obj);
    public abstract T find(int id);
    public abstract List getAll();
}
