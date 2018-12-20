/*
 Clase para conectar
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Isaac Torres
 */
public class cConectar {
    
    private static Connection conn;
    private static final String driver="org.postgresql.Driver";
    private static final String user="isaac7torres";
    private static final String password ="BARBARAisaac7";
    private static final String url = "jdbc:postgresql:5432/fractalesBD";    

    public cConectar() throws ClassNotFoundException {
        conn=null;
        try{
        Class.forName(driver);
        conn=DriverManager.getConnection(url, user, password);
        if (conn!=null){
        System.out.print("exito");
        }
        }catch(ClassNotFoundException | SQLException e){
        System.out.print("Error"+e);
        }
    }
    // Metodo para conectar a la base de datos 
    public Connection getConnection(){
    return conn;
    }
    
     // Metodo para desconectar a la base de datos 
    public void desconectar(){
    conn=null;
    if (conn==null){
    System.out.print("Coneccion Terminada");
    }
    }
}
