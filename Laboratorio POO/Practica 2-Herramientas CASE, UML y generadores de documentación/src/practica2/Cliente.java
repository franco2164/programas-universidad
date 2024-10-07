/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio;

/**
 * Esta clase se encarga de realizar la plantilla de la clase Cliente, para poder realizar la composición en la clase Nota
 * @author Monserrath Hernandez
 * @author Cristian Ceron
 * @author Ricardo Nava 
 * @see Nota
 */
public class Cliente {
    private String nombre;
    private String numTelefonico;
    private String direccion;
/**
 * Constructor por omision de la clase Cliente
 */
    public Cliente() {
    }
/**
 * Constructor paramétrizado de la clase Cliente
 * @param nombre valor inicial para el nombre del Cliente
 * @param numTelefonico valor inicial para el telefono del Cliente
 * @param direccion valor inicial para la dirección del Cliente 
 */

    public Cliente(String nombre, String numTelefonico, String direccion) {
        this.nombre = nombre;
        this.numTelefonico = numTelefonico;
        this.direccion = direccion;
    }
    /**
     * Método de acceso que devuelve un valor del nombre del Cliente
     * @return el valor del nombre del Cliente
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * Método de acceso que establece el valor del nombre del Cliente
     * @param nombre valor del nombre que será establecido en el atributo 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método de acceso que devuelve un valor del número telefónico del Cliente
     * @return valor del número telefónico del Cliente
     */

    public String getNumTelefonico() {
        return numTelefonico;
    }
    
    /**
     * Método de acceso que establece el valor del número telefónico del Cliente
     * @param numTelefonico valor del número telefónico que será establecido en el atributo 
     */

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }
    
    /**
     * Método de acceso que devuelve un valor de la dirección del Cliente  
     * @return valor de la dirección del Cliente 
     */

    public String getDireccion() {
        return direccion;
    }
    
    /**
     * Método de acceso que establece el valor de la dirección del Cliente
     * @param direccion valor de la dirección que será establecido en el atributo 
     */

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
     * Sobreescribe el método toString de la clase Object
     * @return una cadena con la representación del estado de un Cliente
     * @see <a href="https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html">Clase Object</a>
     */

    @Override
    public String toString() {
        return "\nCliente\n" + "Nombre: " + nombre + ", Telefono: " + numTelefonico + ", Direccion: " + direccion + "\nProductos" + "\n" ;
    }
   
    
}
