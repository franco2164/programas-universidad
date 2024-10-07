/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_uno;

/**
 *Clase que representa a una persona.
 * La clase Persona incluye atributos básicos como nombre, apellido paterno y 
 * apellido materno, y proporciona métodos para acceder y modificar estos atributos.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @version 2024-07-23
 */
public class Persona {
     private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;    

    /**
     * Constructor por defecto.
     */
    public Persona() {
    }
    
     /**
     * Constructor con parámetros para inicializar un objeto Alumno.
     * 
     * @param nombre el valor inicial del nombre del alumno.
     * @param apellidoPaterno el valor inicial del apellido paterno del alumno.
     * @param apellidoMaterno el valor inicial del apellido materno del alumno.
     */

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Método de acceso que obtiene el nombre de la persona.
     * 
     * @return el valor del nombre de esa persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método de acceso que modifica el nombre de la persona
     * 
     * @param nombre valor que será establecido en el atributo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método de acceso que obtiene el apellido paterno de la persona.
     * 
     * @return el valor del apellido paterno de esa persona.
     */

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Método de acceso que modifica el apellido paterno de la persona.
     * 
     * @param apellidoPaterno valor que será establecido en el atributo.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    
    /**
     * Método de acceso que obtiene el apellido materno de la persona.
     * 
     * @return el valor del apellido materno de esa persona.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    
    /**
     * Método de acceso que modifica el apellido materno de la persona.
     * 
     * @param apellidoMaterno valor que será establecido en el atributo.
     */

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
}
