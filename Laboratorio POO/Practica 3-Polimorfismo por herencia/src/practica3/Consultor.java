/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicatres;

/**
 * Clase que representa a un empleado Consultor.
 * 
 * La clase Consultor hereda de la clase EmpleadoTemporal, implementa
 * a la Interface IRecibo e incluye información adicional 
 * específica de los empleados administrativos, como su ubicaión. 
 * Además, sobrescribe el método imprimir de la interface IRecibo para generar
 * un recibo. Proporciona métodos de acceso a los atributos.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @see Empleado
 * @see EmpleadoTemporal
 * @see IRecibo
 * 
 * @version 2024-08-06
 */
public class Consultor extends EmpleadoTemporal implements IRecibo{
    private String nombreProyecto;
    
    /**
     * Constructor por omisión.
     */
    public Consultor() {
    }

    /**
     * Constructor con parámetros para inicializar un objeto Consultor con
     * parametros de la Superclass EmpleadoTemporal y Empleado.
     * @param nombreProyecto valor inicial del atributo nombreProyecto
     * @param horasTrabajadas valor inicial del atributo horasTrabajadas
     * @param nombre valor inicial del atributo nombre
     * @param numeroEmpleado valor inicial del atributo numeroEmpleado
     * @param sexo valor inicial del atributo sexo
     * @param rfc valor inicial del atributo rfc
     * @param costoPorDia valor inicial del atributo costoPorDia
     */
    public Consultor(String nombre, String numeroEmpleado, String sexo, String rfc, String nombreProyecto, double horasTrabajadas, float costoPorDia) {
        super(horasTrabajadas, nombre, numeroEmpleado, sexo, rfc, costoPorDia);
        this.nombreProyecto = nombreProyecto;
    }

   /**
     * Método de acceso que devuelve el valor del Nombre del Proyecto
     * @return el valor del Nombre del Proyecto
     */
    public String getNombreProyecto() {
        return nombreProyecto;
    }
    /**
     * Método de acceso que modifica el valor del Nombre del Proyecto
     * @param nombreProyecto valor del Nombre del Proyecto que será establecido
     * en el atributo
     */
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }
    
    /**
     * Sobrecribe el método imprimirRecibo de la interface IRecibo
     * Muestra el recibo de Consultor
     * 
     * @see IRecibo
     */
    @Override
    public void imprimirRecibo() {
        double sueldo = calcularSueldo();
        double isr = calcularIsr();
        System.out.println("Consultor [Nombre del Proyecto:" + nombreProyecto + ", Empleado {Nombre: "+ getNombre() + ", Numero de empleado: " + getNumeroEmpleado()  +
        ", RFC: "+ getRfc() + "}," + "sexo: " + getSexo()+"]");
        System.out.println("\tPERCEPCIONES\t\t\t\tDEDUCCIONES\n\tSalario: "+ sueldo +"\t\t\t\tISR: "+ isr + "\n\tSueldo a percibir: " + (sueldo - isr) );
        obtenerJubilacion();
    }
    
}
