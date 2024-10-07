/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_uno;

/**
 * Clase que representa a un trabajador.
 *  La clase Trabajador hereda de la clase Persona, además incluye información adicional 
 * específica de un trabajador, como el número económico. 
 * 
 * @see Persona
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * @version 2024-07-23
 */
public class Trabajador extends Persona {
    
    private String numEconomico;

    /**
     * Constructor por defecto.
     */
    public Trabajador() {
    }

    /**
     * Constructor con parámetros para inicializar un objeto Trabajador.
     * 
     * @param nombre el valor inicial del nombre del trabajador.
     * @param apellidoPaterno el valor inicial del apellido paterno del trabajador.
     * @param apellidoMaterno el valor inicial del apellido materno del trabajador.
     * @param numEconomico el valor inicial del número económico del trabajador.
     */
    public Trabajador(String nombre, String apellidoPaterno, String apellidoMaterno, String numEconomico) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.numEconomico = numEconomico;
    }

    /**
     * Método de acceso que obtiene el número económico del trabajador.
     * 
     * @return el valor del número económico de ese trabajador.
     */
    public String getNumEconomico() {
        return numEconomico;
    }

    /**
     * Método de acceso que modifica el número económico del trabajador.
     * 
     * @param numEconomico valor que será establecido en el atributo.
     */
    public void setNumEconomico(String numEconomico) {
        this.numEconomico = numEconomico;
    }
}
