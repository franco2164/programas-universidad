/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicatres;

import java.util.ArrayList;

/**
 * Clase que representa a un empleado Programador.
 * 
 * La clase Programador hereda de la clase EmpleadoBase, implementa
 * a la Interface IRecibo e incluye información adicional 
 * específica de los empleados programadores, como sus lenguajes. 
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
public class Programador extends EmpleadoBase implements IRecibo{
    private ArrayList<String> lenguajes;

    /**
     * Constructor por omisión.
     */
    public Programador() {
    }

    /**
     * Constructor con parámetros para inicializar un objeto Programador con
     * parametros de la Superclass EmpleadoBase y Empleado.
     * @param lenguajes valor inicial del atributo lenguajes
     * @param diasTrabajados valor inicial del atributo diasTrabajados
     * @param costoDia valor inicial del atributo costoDia
     * @param nombre valor inicial del atributo nombre
     * @param numeroEmpleado valor inicial del atributo numeroEmpleado
     * @param sexo valor inicial del atributo sexo
     * @param rfc valor inicial del atributo rfc
     */
    public Programador(ArrayList<String> lenguajes, int diasTrabajados, double costoDia, String nombre, String numeroEmpleado, String sexo, String rfc) {
        super(diasTrabajados, costoDia, nombre, numeroEmpleado, sexo, rfc);
        this.lenguajes = lenguajes;
    }

    /**
     * Método de acceso que devuelve el valor de lenguajes
     * @return el valor de lenguajes
     */
    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    /**
     * Método de acceso que modifica el valor de lenguajesn 
     * @param lenguajes valor de lenguajes que será establecido
     * en el atributo
     */
    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }

   /**
     * Sobrecribe el método imprimirRecibo de la interface IRecibo
     * Muestra el recibo de Programador
     * 
     * @see IRecibo
     */
    @Override
    public void imprimirRecibo() {
        double sueldo = calcularSueldo();
        double isr =calcularIsr(BONO,VALE);
        double imss = calcularIMSS(BONO, VALE);
        double totalDeducciones = isr + imss;
        double sueldoConPercepciones = sueldo + BONO + VALE;
        
        System.out.println("Programador [Lenguajes: " + lenguajes + ", Empleado {Nombre: "+ getNombre() + ", Numero de empleado: " + getNumeroEmpleado()  +
        ", RFC: "+ getRfc() + "}," + "sexo: " + getSexo()+"]");
        System.out.println("\tPERCEPCIONES\t\t\t\tDEDUCCIONES\n\tSalario: "+ sueldo +"\t\t\tISR: "+ isr + "\n\tBono: " + BONO 
                +"\n\tVale: " + VALE +"\t\t\t\tIMMS: " + imss +"\n\tTotal: " + (sueldo+BONO+VALE)+ "\t\t\t\tTotal: " + (isr+imss) + "\n\tSueldo a percibir: " + 
                (sueldoConPercepciones - totalDeducciones));
        obtenerJubilacion();
    }
   
    
}
