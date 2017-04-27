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
public class Usuario {
    private String idUsuario;
    private String nombreUsuario;
    private String contrasenia;
    private String apPat;
    private String apMat;
    private String email;
    private String fechaNacimiento;
    private String colonia;
    private String calle;
    private String numero;

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombreUsuario, String contrasenia, String apPat, String apMat, String email, String fechaNacimiento, String colonia, String calle, String numero) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.apPat = apPat;
        this.apMat = apMat;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
    }

    
    
    
    
    
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
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

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia + ", apPat=" + apPat + ", apMat=" + apMat + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", colonia=" + colonia + ", calle=" + calle + ", numero=" + numero + '}';
    }
    
    
    
    
}
