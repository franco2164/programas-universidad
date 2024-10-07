/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_uno;

import java.util.Random;

/**
 *Clase que representa a un trabajador administrativo.
 * La clase Administrativo hereda de la clase Trabajador e incluye información adicional 
 * específica de los trabajadores administrativos, como la fecha de nacimiento. 
 * Además, proporciona un método para generar el RFC del trabajador administrativo.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @see Trabajador
 * 
 * @version 2024-07-23
 */
public class Administrativo extends Trabajador{
    private String fechaNacimiento;

     /**
     * Constructor por defecto.
     */
    public Administrativo() {
    }

    /**
     * Constructor con parámetros para inicializar un objeto Administrativo.
     * 
     * @param nombre el valor inicial del nombre del trabajador administrativo.
     * @param apellidoPaterno el valor inicial del apellido paterno del trabajador administrativo.
     * @param apellidoMaterno el valor inicial del apellido materno del trabajador administrativo.
     * @param numEconomico el valor inicial del número económico del trabajador administrativo.
     * @param fechaNacimiento el valor inicial de la fecha de nacimiento del trabajador administrativo.
     */
    public Administrativo(String nombre, String apellidoPaterno, String apellidoMaterno, String numEconomico, String fechaNacimiento) {
        super(nombre, apellidoPaterno, apellidoMaterno, numEconomico);
        this.fechaNacimiento = fechaNacimiento;
    }
    
     /**
     * Genera el RFC (Registro Federal de Contribuyentes) del trabajador administrativo.
     * 
     * El RFC se genera usando las primeras letras del apellido paterno, apellido materno y nombre,
     * seguido de los últimos dos dígitos del año de nacimiento, el mes y el día de nacimiento, 
     * y tres caracteres adicionales aleatorios (dos letras y un dígito).
     * 
     * @return El RFC generado.
     * 
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html">Clase Random en Java</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">Métodos para cadenas en Java</a>
     */
    public String generarRFC(){
        Random rnd = new Random();
        String fecha[]=fechaNacimiento.split("/");
        String rfc="";
       
        rfc += getApellidoPaterno().substring(0,2).toUpperCase();
        rfc += getApellidoMaterno().substring(0,1).toUpperCase();
        rfc += getNombre().substring(0,1).toUpperCase();
        rfc += fecha[2].substring(2,4) ;
        
        rfc += fecha[1];
        rfc += fecha[0];
        rfc+= String.valueOf((char)(rnd.nextInt(26) + 'A')).toUpperCase();
        rfc+= String.valueOf((char)(rnd.nextInt(26) + 'A')).toUpperCase();
        rfc+=String.valueOf(rnd.nextInt(10));
        return rfc;
        
    }
}
