package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase singleton que regresa una unica instancia de la conexión a MySQL.
 * @author  Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 */
public class AccessMySQL {
    
    private static AccessMySQL instance; //Instancia de la conexión
    private Connection con; //Objeto conexión
    
    /**
     * Constructor privado default.
     */
    private AccessMySQL() {
        try {
            /*
                //localhost:3306 es la ruta del servidor
                // damayte es el nombre de la base de datos
                //root es el usuario de la BD
                //root es el password
            */
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/damayte",
//                    "root", "root");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unidadiv",
                    "damayte", "12345");
            System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(AccessMySQL.class.getName()).log(Level.SEVERE, null, 
                    ex);
        }
    }
    
    /**
     * Obtiene la instancia de la clase.
     * @return La única instancia de la clase.
     */
    public static AccessMySQL getInstance() {
        if (instance == null)
            instance = new AccessMySQL();
        return instance;
    }
    
    /**
     * regresa el objeto connection a la base de datos de MySQL
     * @return Conexión
     */
    public Connection getConnection() {
        return con;
    }
   
    public static void main(String[] args) {
        try {
            AccessMySQL objCon = AccessMySQL.getInstance();
            //Paso 1 obtener la conexion
            Connection con=objCon.getConnection();
            //Paso 2 Crear un enunciado--envio de instrucciones
            Statement stmt= con.createStatement();
            //Paso3 Generar la consulta
    
            System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(AccessMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
