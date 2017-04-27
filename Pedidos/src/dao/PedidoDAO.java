/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.AccessMySQL;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pedido;
import model.Usuario;

/**
 *
 * @author Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 */
public class PedidoDAO {
    private Connection con;
    private Statement stmt;
    private ResultSet rst;

    public PedidoDAO() {
        try {
            con= AccessMySQL.getInstance().getConnection();
            stmt=con.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public List<Usuario> getListaUsuario(){
        List<Usuario>lstUsuario=new ArrayList<>();
        
        try {
            
            String query="SELECT * FROM Usuario order by email asc";
            rst=stmt.executeQuery(query);
            while(rst.next()){
                Usuario user=new Usuario();
               
                user.setIdUsuario(rst.getString("idusuario"));
                user.setNombreUsuario(rst.getString("nombreusuario"));
                user.setApPat(rst.getString("apPat"));
                user.setApMat(rst.getString("apMat"));
                user.setContrasenia(rst.getString("contrasenia"));
                user.setCalle(rst.getString("calle"));
                user.setColonia(rst.getString("colonia"));
                user.setNumero(rst.getString("numero"));
                
                lstUsuario.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lstUsuario;
    }
    
    /**********************************/
    public List<Pedido> getListaPedido(){
        List<Pedido>lstPedido=new ArrayList<>();
        
        try {
            
            String query="SELECT * FROM Usuario order by email asc";
            rst=stmt.executeQuery(query);
            while(rst.next()){
               Pedido pedid=new Pedido();
               
                pedid.setCvePedido(rst.getString("cvePedido"));
                pedid.setFechaPedido(rst.getString("fechaPedido"));
                pedid.setCalle(rst.getString("Calle"));
                pedid.setNumero(rst.getString("Numero"));
                pedid.setColonia(rst.getString("Colonia"));
               // pedid.setIDusuario(rst.get("IDusuario"));
               
                lstPedido.add(pedid);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lstPedido;
    }
    
    
    
}//fin de clase
