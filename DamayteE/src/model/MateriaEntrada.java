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
public class MateriaEntrada {
    private String cveMP;
    private String nombreMP;
    private String cantidad;
    private String descripcion;
    private String fechaAda;
    private String fechaCaducidad;
    private String unidadMedidad;
    private String NivelReorden;

    public MateriaEntrada() {
    }

    public MateriaEntrada(String cveMP, String nombreMP, String cantidad, String descripcion, String fechaAda, String fechaCaducidad, String unidadMedidad, String NivelReorden) {
        this.cveMP = cveMP;
        this.nombreMP = nombreMP;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.fechaAda = fechaAda;
        this.fechaCaducidad = fechaCaducidad;
        this.unidadMedidad = unidadMedidad;
        this.NivelReorden = NivelReorden;
    }

    public String getCveMP() {
        return cveMP;
    }

    public void setCveMP(String cveMP) {
        this.cveMP = cveMP;
    }

    public String getNombreMP() {
        return nombreMP;
    }

    public void setNombreMP(String nombreMP) {
        this.nombreMP = nombreMP;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaAda() {
        return fechaAda;
    }

    public void setFechaAda(String fechaAda) {
        this.fechaAda = fechaAda;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getUnidadMedidad() {
        return unidadMedidad;
    }

    public void setUnidadMedidad(String unidadMedidad) {
        this.unidadMedidad = unidadMedidad;
    }

    public String getNivelReorden() {
        return NivelReorden;
    }

    public void setNivelReorden(String NivelReorden) {
        this.NivelReorden = NivelReorden;
    }

    @Override
    public String toString() {
        return "MateriaEntrada{" + "cveMP=" + cveMP + ", nombreMP=" + nombreMP + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", fechaAda=" + fechaAda + ", fechaCaducidad=" + fechaCaducidad + ", unidadMedidad=" + unidadMedidad + ", NivelReorden=" + NivelReorden + '}';
    }

   
   

  
    
    
    
    
    
}
