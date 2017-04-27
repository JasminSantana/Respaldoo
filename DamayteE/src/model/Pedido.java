/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 */
public class Pedido {
    private String cvePedido;
    private String fechaPedido;
    private String calle;
    private String numero;
    private String colonia;
    private Usuario IDusuario;//ID usuario de tipo clase Usuario

    public Pedido() {
    }

    public Pedido(String cvePedido, String fechaPedido, String calle, String numero, String colonia, Usuario IDusuario) {
        this.cvePedido = cvePedido;
        this.fechaPedido = fechaPedido;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.IDusuario = IDusuario;
    }

    public String getCvePedido() {
        return cvePedido;
    }

    public void setCvePedido(String cvePedido) {
        this.cvePedido = cvePedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Usuario getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(Usuario IDusuario) {
        this.IDusuario = IDusuario;
    }

    @Override
    //para saber el estado del objeto
    public String toString() {
        return "Pedido{" + "cvePedido=" + cvePedido + ", fechaPedido=" + fechaPedido + ", calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + ", IDusuario=" + IDusuario + '}';
    }
    
    
    
    
}
