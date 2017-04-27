/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Baseunidad4;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * clase que muestra el menu y submenu para una base de tados
 *
 * @author Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            String opcion = "A";
            String opcionSubmenu = "A";
            String opcionModificacion = "A";
            int clave = 0;
            String nombre = "";
            String contenido = "";
            String query = "", update = "";

            ///PARA ESTABLECER LA CONEXION DE LA BASE DE DATOS
            Connection objCon = Baseunidad4.getInstance().getConnection();
            Statement stmt = objCon.createStatement();

            do {
                try {
                    System.out.println("\t \t \t Menu Practica I");
                    System.out.println("_________________________________________________");
                    System.out.println("A).- LISTADO DE ARTICULOS");
                    System.out.println("B).- MODIFICACION DE ARTICULOS DE ARTICULOS");
                    System.out.println("C).- ELIMINACION DE ARTICULOS");
                    System.out.println("D).- INSERCION DE ARTICULOS");
                    System.out.println("E).- SALIR");
                    System.out.print("ELIGE LA OPCION");
                    opcion = teclado.nextLine().toUpperCase();

                    Scanner in = new Scanner(System.in);

                    switch (opcion) {
                        case "A":
                            do {
                                System.out.println("\t \t Submenu Listado");
                                System.out.println("__________________________________________________________");
                                System.out.println("A).- LISTADO DE ARTICULOS como fueron insertados");
                                System.out.println("B).- Listado de articulos por nombre ascendente");
                                System.out.println("C).-Listado de articulos por nombre descendente ");
                                System.out.println("D).- SALIR");
                                System.out.print("ELIGE LA OPCION");
                                opcionSubmenu = teclado.nextLine().toUpperCase(); //no importa si es mayuscula o minuscula
                            
                             switch (opcionSubmenu) {
                                 case "A":
                                    

                                        query = "SELECT * "
                                                + "FROM articulo ";
                                        ResultSet rsut = stmt.executeQuery(query);
                                        while(rsut.next()){
                                          
                                            String variable="\t "+rsut.getInt("nArticulo")
                                                    +rsut.getString("nombreArticulo")+rsut.getString("contenido");
                                             
                                            System.out.println(" " + variable);
                                        }   
                                      
                                     break;
                                 case "B":
                                     query = "SELECT * "
                                                + "FROM articulo "+"Order by  nombreArticulo";
                                        ResultSet rsult = stmt.executeQuery(query);
                                        while(rsult.next()){
                                     
                                            String variable="\t "+rsult.getInt("nArticulo")+rsult.getString("nombreArticulo")+rsult.getString("contenido");
                                         System.out.println("" + variable);
                                        }   
                                     break;
                                     
                                 case "C":
                                      query = "SELECT * "
                                                + "FROM articulo "+"Order by  nombreArticulo Desc";
                                        ResultSet result = stmt.executeQuery(query);
                                        while(result.next()){
                                            String variable="\t "+result.getInt("nArticulo")+result.getString("nombreArticulo")+result.getString("contenido");
                                         System.out.println("" + variable);
                                        }   
                                     break;
                             }
//                            
                            
                            } while (opcionSubmenu.equals("D"));
                           
                            break;//del primer case

                        case "B":
                            do {
                                System.out.println("\t \t Submenu Modificacion");
                                System.out.println("______________________");
                                System.out.println("A).- Modificar sólo nombre.");
                                System.out.println("B).- Modificar sólo contenido.");
                                System.out.println("C).-Modificar nombre y contenido. ");
                                System.out.println("D).- Regresar al menú principal.");
                                System.out.println(" \t ELIGE LA OPCION ");

                               opcionModificacion = teclado.nextLine().toUpperCase(); //no importa si es mayuscula o minuscula
                                ///si se elige la A

                                switch (opcionModificacion) {
                                    case "A":
                                        System.out.print("Introduce la clave del articulo a modificar: ");
                                        clave = Integer.valueOf(in.nextLine());

                                        query = "SELECT nArticulo "
                                                + "FROM articulo ";
                                        ResultSet rst = stmt.executeQuery(query);
                                        if (rst.next()) {
                                            System.out.print("Introduce el nuevo nombre ");
                                            nombre = in.nextLine();

                                            update = "UPDATE articulo "
                                                    + "SET "
                                                    + "nombreArticulo ='" + nombre + "' "
                                                    + "WHERE nArticulo='" + clave + "'";
                                            stmt.executeUpdate(update);
                                        }
                                        break;

                                    case "B":
                                        System.out.print("Introduce la clave del articulo a modificar: ");
                                        clave = Integer.valueOf(in.nextLine());

                                        query = "SELECT nArticulo "
                                                + "FROM articulo ";
                                        ResultSet rest = stmt.executeQuery(query);
                                        if (rest.next()) {
                                            System.out.print("Introduce el nuevo  contenido de este articulo ");
                                            contenido = in.nextLine();

                                            update = "UPDATE articulo "
                                                    + "SET "
                                                    + "contenido ='" + contenido + "' "
                                                    + "WHERE nArticulo='" + clave + "'";
                                            stmt.executeUpdate(update);
                                        }
                                        break;

                                    case "C":
                                        System.out.print("Introduce la clave del articulo a modificar: ");
                                        clave = Integer.valueOf(in.nextLine());

                                        query = "SELECT nArticulo "
                                                + "FROM articulo ";
                                        ResultSet resut = stmt.executeQuery(query);
                                        if (resut.next()) {
                                            System.out.print("Introduce el nuevo nombre ");
                                            nombre = in.nextLine();

                                            System.out.print("Introduce el nuevo  contenido de este articulo ");
                                            contenido = in.nextLine();

                                            update = "UPDATE articulo "
                                                    + "SET "
                                                    + "nombreArticulo='" + nombre + "', "
                                                    + "contenido='" + contenido + "' "
                                                    + "WHERE nArticulo=" + clave + " ";
                                            System.out.println("modificacion " + update);
                                            
                                            stmt.executeUpdate(update);
                                        }

                                        break;
                                    default :
                                        
                                     System.out.println("***No existe la opcion!!");
                                       
                                }

                            } while (!opcionModificacion.equals("D"));

                            break;

                        case "C":

                            System.out.print("Introduce la clave: ");
                            clave = Integer.valueOf(in.nextLine());
                            String delete = "DELETE FROM articulo "
                                    + " WHERE nArticulo=" + clave + " ";
//System.out.println("Borrar " + delete);
                            stmt.executeUpdate(delete);

                            break;
                        case "D":

                            System.out.print("Introduce la clave: ");
                            clave = Integer.valueOf(in.nextLine());

                            System.out.print("Introduce el nombre ");
                            nombre = in.nextLine();

                            System.out.print("introduce el contenido: ");
                            contenido = in.nextLine();

                            String insert = "INSERT INTO articulo (nArticulo,nombreArticulo,contenido ) "
                                    + " VALUES (" + clave + ",'" + nombre + "','" + contenido + "' )";
                            System.out.println("Insertar " + insert);
                            stmt.executeUpdate(insert);
                            break;
                        case "E":
                            
                            break;
                        default:
                            System.out.println("***OPCION INCORRECTA!!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                }

            } while (!opcion.equals("E"));
            System.out.println("!!Adios que tengas un buen día :) ");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
