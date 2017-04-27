
package modelo;

import java.io.Serializable;

/**
 *
 * @author Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 */
public class Producto implements Serializable{
    private Short id;
    private String nombre;
    private Float costo;
    private Short cantidad;


//constructor 
    public Producto() {
    }

    public Producto(Short id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", costo=" + costo + ", cantidad=" + cantidad + '}';
    }

    
    
    
    public Short getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getCosto() {
        return costo;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }
    
}
