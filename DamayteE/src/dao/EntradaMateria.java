/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MateriaEntrada;

/**
 *
 * @author Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 */
public class EntradaMateria {

    private Connection con;
    private Statement stmt;
    private ResultSet rst;

    public EntradaMateria() {
        try {
            con = AccessMySQL.getInstance().getConnection();
            stmt = con.createStatement();

        } catch (SQLException ex) {
            Logger.getLogger(EntradaMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<MateriaEntrada> getListaMateria(){
        List<MateriaEntrada>lstMateria=new ArrayList<>();
        
        try {
            
            String query="SELECT * FROM materiaprima order by fechaAlta asc";
            rst=stmt.executeQuery(query);
            while(rst.next()){
               MateriaEntrada user=new MateriaEntrada();
               
                user.setCveMP(rst.getString("cveMP"));
                user.setNombreMP(rst.getString("nombreMP"));
                user.setCantidad(rst.getString("cantidad"));
                user.setDescripcion(rst.getString("descripcion"));
                user.setFechaAda(rst.getString("fechaAlta"));
                user.setFechaCaducidad(rst.getString("fechaCaducidad"));
                user.setUnidadMedidad(rst.getString("unidadMedidad"));
                user.setNivelReorden(rst.getString("NivelReorden"));
                
                lstMateria.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EntradaMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lstMateria;
    }
}
