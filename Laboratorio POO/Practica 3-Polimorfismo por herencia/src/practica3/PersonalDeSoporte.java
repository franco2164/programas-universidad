/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicatres;

/**
 * Clase que representa a un empleado Personal de Soporte.
 * 
 * La clase PersonalDeSoporte hereda de la clase EmpleadoTemporal, implementa
 * a la Interface IRecibo e incluye información adicional 
 * específica de los empleados de soporte, como su telefono. 
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
public class PersonalDeSoporte extends EmpleadoTemporal implements IRecibo{
    private String telefono;

    /**
     * Constructor por omisión.
     */
    public PersonalDeSoporte() {
    }

    /**
     * Constructor con parámetros para inicializar un objeto PersonalDeSoporte
     * con parametros de la Superclass EmpleadoTemporal y Empleado.
     * @param nombre valor inicial del atributo nombre
     * @param numeroEmpleado valor inicial del atributo numeroEmpleado
     * @param sexo valor inicial del atributo sexo
     * @param rfc valor inicial del atributo rfc
     * @param telefono valor inicial del atributo telefono
     * @param horasTrabajadas valor inicial del atributo horasTrabajadas
     * @param costoPorDia valor inicial del atributo costoPorDia
     */
    public PersonalDeSoporte(String nombre, String numeroEmpleado, String sexo, String rfc, String telefono, double horasTrabajadas, float costoPorDia) {
        super(horasTrabajadas, nombre, numeroEmpleado, sexo, rfc, costoPorDia);
        this.telefono = telefono;
    }

    /**
     * Método de acceso que devuelve el valor del telefono
     * @return el valor del telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método de acceso que modifica el valor del telefono
     * @param telefono valor del telefono que será establecido
     * en el atributo
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Sobrecribe el método imprimirRecibo de la interface IRecibo
     * Muestra el recibo de PersonalDeSoporte
     * 
     * @see IRecibo
     */
    @Override
    public void imprimirRecibo() {
        double sueldo = calcularSueldo();
        double isr = calcularIsr();
        System.out.println("Soporte [Numero de telefono:" + telefono + ", Empleado {Nombre: "+ getNombre() + ", Numero de empleado: " + getNumeroEmpleado()  +
        ", RFC: "+ getRfc() + "}," + "sexo: " + getSexo()+"]");
        System.out.println("\tPERCEPCIONES\t\t\t\tDEDUCCIONES\n\tSalario: "+ sueldo +"\t\t\tISR: "+ isr + "\n\tSueldo a percibir: " + (sueldo - isr) );
        obtenerJubilacion();
    }
    
}
