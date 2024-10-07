/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio;

/**
 * Esta clase se encarga de poder agregar productos a la clase Nota
 * @author Monserrath Hernández
 * @author Cristian Ceron
 * @author Ricardo Nava 
 * @see Nota
 */
public class Producto {
    private int cantidad;
    private String descripcion; 
    private double precio;

/**
 * Constructor por omision de la clase Producto
 */
    public Producto() {
    }

/**
 * Constructor paramétrizado de la clase Producto
 * @param cantidad valor inicial para la cantidad de un Producto
 * @param descripcion valor inicial para la descripción de un Producto
 * @param precio valor inicial para el precio de un Producto 
 */
    public Producto(int cantidad, String descripcion, double precio) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }

/**
 * Método de acceso que devuelve el valor de la cantidad del Producto 
 * @return el valor de la cantidad del Producto
 */

    public int getCantidad() {
        return cantidad;
    }
/**
 * Método de acceso que establece el valor de la cantidad del Producto 
 * @param cantidad valor de la cantidad que será establecido en el atributo  
 */

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
/**
 * Método de acceso que devuelve el valor de la descripción del Producto
 * @return el valor de la descripción del Producto
 */

    public String getDescripcion() {
        return descripcion;
    }
    
/**
 * Método de acceso que establece el valor de la descripción del Producto
 * @param descripcion valor de la descripción que será establecido en el atributo
 */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

/**
 * Método de acceso que devuelve el valor del precio del Producto
 * @return el valor del precio del Producto
 */
    public double getPrecio() {
        return precio;
    }
/**
 * Método de acceso que establece el valor del precio del Producto
 * @param precio valor del precio que será establecido en el atributo
 */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
/**
 * Sobrescribe el método toString de la clase Object 
 * @return una cadena con la representación del estado del Producto
 * @see <a href= "https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html">Clase Object</a>
 */

    @Override
    public String toString() {
        return "\nCantidad: " + cantidad + ", Descripción: " + descripcion + ", Precio: " + precio ;
    }
    
    
}
