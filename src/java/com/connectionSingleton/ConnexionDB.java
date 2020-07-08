
package com.connectionSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GEDEON
 */
public class ConnexionDB {
    
    private static String url = "jdbc:mysql://localhost:3306/gestion_hopital";
    private static String user = "root";
    private static String password = "";
    private static Connection connect;
    
    public static Connection getInstance(){
        if(getConnect() == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                connect = DriverManager.getConnection(getUrl(), getUser(), getPassword());
            }catch(SQLException|ClassNotFoundException e){
                e.printStackTrace();
            }
        }
        return getConnect();
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String aUrl) {
        url = aUrl;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String aUser) {
        user = aUser;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String aPassword) {
        password = aPassword;
    }

    public static Connection getConnect() {
        return connect;
    }

    public static void setConnect(Connection aConnect) {
        connect = aConnect;
    }
}
