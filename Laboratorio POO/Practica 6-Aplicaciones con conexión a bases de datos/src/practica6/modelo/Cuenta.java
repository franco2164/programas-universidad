/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azc.uam.mx.modelo;

import java.math.BigDecimal;

/**
 * Clase que representa una Cuenta.
 * La clase Cuenta se encarga de la manipulación de la información de las cuentas (encapsulamiento de los datos)
 * en la cual se tiene como atributo un número de cuenta de tipo String, un nombre, un apellido, una sucursal de apertura
 * y un saldo de tipo double.
 * 
 * @author Nava Ricardo 
 * @author Ceron Cristian 
 * @author Hernandez Monserrath
 * 
 * @version 2024/09/18
 */
public class Cuenta {
    private String numCuenta;
    private String nombre;
    private String apellido;
    private double saldo;
    private String sucursalApertura;
    
    /**
     * Constructor por omisión.
     */

    public Cuenta() {
    }
    
    /**
     * Constructor con parámetros. 
     * @param numCuenta el valor inicial del atributo numCuenta. 
     * @param nombre el valor inicial del atributo nombre. 
     * @param apellido el valor inicial del atributo apellido. 
     * @param saldo el valor inicial del atributo saldo.
     * @param sucursalApertura el valor incial del atributo sucursalApertura. 
     */

    public Cuenta(String numCuenta, String nombre, String apellido, double saldo, String sucursalApertura) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
        this.sucursalApertura = sucursalApertura;
    }
    
    /**
     * Método de acceso que devuelve el valor del número de cuenta. 
     * @return el valor del número de cuenta.
     */

    public String getNumCuenta() {
        return numCuenta;
    }
    
    /**
     * Método de acceso que modifica el valor del número de cuenta. 
     * @param numCuenta valor que será establecido en el atributo. 
     */

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    /**
     * Método de acceso que devuelve el valor del nombre. 
     * @return el valor del nombre.
     */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método de acceso que modifica el valor del nombre. 
     * @param nombre valor que será establecido en el atributo. 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método de acceso que devuelve el valor del apellido. 
     * @return el valor del apellido.
     */

    public String getApellido() {
        return apellido;
    }
    
    /**
     * Método de acceso que modifica el valor del apellido. 
     * @param apellido valor que será establecido en el atributo. 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * Método de acceso que devuelve el valor del saldo. 
     * @return el valor del saldo.
     */

    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Método de acceso que modifica el valor del saldo. 
     * @param saldo valor que será establecido en el atributo.
     */

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Método de acceso que devuelve el valor de la sucursalApertura. 
     * @return el valor de la sucursalApertura.
     */

    public String getSucursalApertura() {
        return sucursalApertura;
    }
    
    /**
     * Método de acceso que modifica el valor de la sucursalApertura. 
     * @param sucursalApertura valor que será establecido en el atributo.
     */

    public void setSucursalApertura(String sucursalApertura) {
        this.sucursalApertura = sucursalApertura;
    }
    
    /**
     * Muestra el estado de un objeto
     * @return una cadena con la representacion de un circulo
     */

    @Override
    public String toString() {
        return "Cuenta " + "Numero de Cuenta: " + numCuenta + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Saldo: " + saldo + ", Sucursal de Apertura: " + sucursalApertura;
    }
    
    
    
}
