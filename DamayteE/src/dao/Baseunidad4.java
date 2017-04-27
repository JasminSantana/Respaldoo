/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 */
public class Baseunidad4 {

    private static Baseunidad4 instance; //Instancia de la conexión
    private Connection con; //Objeto conexión
    
    /**
     * Constructor privado default.
     */
    private Baseunidad4() {
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
            Logger.getLogger(Baseunidad4.class.getName()).log(Level.SEVERE, null, 
                    ex);
        }
    }
    
    /**
     * Obtiene la instancia de la clase.
     * @return La única instancia de la clase.
     */
    public static Baseunidad4 getInstance() {
        if (instance == null)
            instance = new Baseunidad4();
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
            Baseunidad4 objCon = Baseunidad4.getInstance();
            //Paso 1 obtener la conexion
            Connection con=objCon.getConnection();
            //Paso 2 Crear un enunciado--envio de instrucciones
            Statement stmt= con.createStatement();
            //Paso3 Generar la consulta
            
    
            System.out.println("Conexión insert exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Baseunidad4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
