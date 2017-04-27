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
 * @author Gabriel Barrón Rodríguez barg90@hotmail.com
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
            
      /*   String insert="INSERT INTO USUARIO (IDUSUARIO,NOMBREUSUARIO,CONTRASEÑA, "+
                    "APPAT,APMAT,EMAIL,FECHANACIMIENTO,COLONIA,NUMERO,CALLE) "+
                    
                    " VALUES (3,'Maria','12345','Juarez','Godinez','mariaj@hotmail.com', "+
                   "'1997-04-25','Dolores Hidalgo','10','morelos')";*/
//            String query="SELECT * FROM USUARIO";
//            Paso 4 enviar la consulta
//            ResultSet tuplas= stmt.executeQuery(query);
            
           // stmt.executeUpdate(insert);
//       String update="UPDATE USUARIO "+
//               "SET "+
//               "EMAIL ='jassantana@hotmail.com' "+
//               "WHERE IDUSUARIO=1 ";

         /*   String delete="DELETE FROM USUARIO "+
                    " WHERE IDUSUARIO=1 ";

            stmt.executeUpdate(delete);*/
         
        /* String query="SELECT IDUSUARIO, NOMBREUSUARIO,EMAIL,FECHANACIMIENTO "+
                 "FROM USUARIO ";
         ResultSet rst= stmt.executeQuery(query);
         
          while(rst.next()){
              System.out.println("********************************************");
                System.out.println("ID: "+rst.getInt("IDUSUARIO"));
                System.out.println("Nombre "+rst.getString("NOMBREUSUARIO"));
                System.out.println("Email: "+rst.getString("EMAIL"));
                System.out.println("Fecha de Nacimiento: " +rst.getString("FECHANACIMIENTO"));
                        
            }*/
      /* String email;
        String pwd;
        Scanner in =new Scanner (System.in);
         System.out.println("Introduce el email: ");
         email=in.nextLine();
         System.out.println("Introduce el password: ");
         pwd=in.nextLine();
         
         String query="SELECT * FROM USUARIO "+
                 " WHERE email='" +email+"' and  "+
                 " contraseña ='"+ pwd+"' ";
         
         ResultSet rst= stmt.executeQuery(query);
         if (rst.next()){
             System.out.println("Bienvenido "+ email);
         }else {
             System.out.println("No exite el usuario con "+ email);
         }*/
         

//            Paso 5 Procesar las tuplas esto para las consultas
//            while(tuplas.next()){
//                System.out.println("Id "+tuplas.getInt("idusuario"));
//                System.out.println("Nombre "+tuplas.getString("nombreusuario"));
//            }
            
            System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(AccessMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
