/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicatres;

/**
 * Clase que representa a un empleado Administrativo.
 * 
 * La clase Administrativo hereda de la clase EmpleadoBase, implementa
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
 * @see EmpleadoBase
 * @see IRecibo
 * 
 * @version 2024-08-06
 */
public class Administrativo extends EmpleadoBase implements IRecibo{
    private String ubicacion;
    
    /**
     * Constructor por omisión.
     */
    public Administrativo() {
    }

    /**
     * Constructor con parámetros para inicializar un objeto Administrativo con
     * parametros de la Superclass EmpleadoBase y Empleado.
     * @param ubicacion valor inicial del atributo ubicacion
     * @param diasTrabajados valor inicial del atributo diasTrabajados
     * @param costoDia valor inicial del atributo costoDia
     * @param nombre valor inicial del atributo nombre
     * @param numeroEmpleado valor inicial del atributo numeroEmpleado
     * @param sexo valor inicial del atributo sexo
     * @param rfc valor inicial del atributo rfc
     */
    public Administrativo(String ubicacion, int diasTrabajados, double costoDia, String nombre, String numeroEmpleado, String sexo, String rfc) {
        super(diasTrabajados, costoDia, nombre, numeroEmpleado, sexo, rfc);
        this.ubicacion = ubicacion;
    }  

   /**
     * Método de acceso que devuelve el valor de la ubicacion
     * @return el valor de la ubicacion del Administrativo
     */
    public String getUbicacion() {
        return ubicacion;
    }
    /**
     * Método de acceso que modifica el valor de la ubicacion 
     * @param ubicacion valor de la ubicacion que será establecido
     * en el atributo
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
     * Sobrecribe el método imprimirRecibo de la interface IRecibo
     * Muestra el recibo de Administrativo
     * 
     * @see IRecibo
     */
    @Override
    public void imprimirRecibo() {
        double sueldo = calcularSueldo();
        double isr =calcularIsr(BONO, VALE);
        double imss = calcularIMSS(BONO, VALE);
        double totalDeducciones = isr + imss;
        double sueldoConPercepciones = sueldo + BONO + VALE;
        
        System.out.println("Administrativo [Ubicacion: " + ubicacion + ", Empleado {Nombre: "+ getNombre() + ", Numero de empleado: " + getNumeroEmpleado()  +
        ", RFC: "+ getRfc() + "}," + "sexo: " + getSexo()+"]");
        System.out.println("\tPERCEPCIONES\t\t\t\tDEDUCCIONES\n\tSalario: "+ sueldo +"\t\t\tISR: "+ isr + "\n\tBono: " + BONO 
                +"\n\tVale: " + VALE +"\t\t\t\tIMMS: " + imss +"\n\tTotal: " + (sueldo+BONO+VALE)+ "\t\t\t\tTotal: " + (isr+imss) + "\n\tSueldo a percibir: " + 
                (sueldoConPercepciones - totalDeducciones));
        obtenerJubilacion();
    }
    
    
}
