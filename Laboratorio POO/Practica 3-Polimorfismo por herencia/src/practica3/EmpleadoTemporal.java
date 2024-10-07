/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicatres;

/**
 * Clase que representa a un Empleado Temporal.
 * 
 * La clase Empleado Temporal incluye atributos básicos como horasTrabajadas 
 * y costoPorDia. Sobrescribe el método calcularSueldo e implementa el método
 * calcularIsr.
 * Proporciona métodos de acceso a los atributos.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @see Empleado
 * 
 * @version 2024-08-06
 */
public class EmpleadoTemporal extends Empleado {
    
    private double horasTrabajadas;
    private double costoPorDia;

    /**
     * Constructor por omisión.
     */
    public EmpleadoTemporal() {
    }

    /**
     * Constructor con parámetros para inicializar un objeto EmpleadoTemporal con
     * parametros de la Superclass Empleado.
     * @param horasTrabajadas valor inicial del atributo horasTrabajadas
     * @param nombre valor inicial del atributo nombre
     * @param numeroEmpleado valor inicial del atributo numeroEmpleado
     * @param sexo valor inicial del atributo sexo
     * @param rfc valor inicial del atributo rfc
     * @param costoPorDia valor inicial del atributo costoPorDia
     */
    public EmpleadoTemporal(double horasTrabajadas, String nombre, String numeroEmpleado, String sexo, String rfc, float costoPorDia) {
        super(nombre, numeroEmpleado, sexo, rfc);
        this.horasTrabajadas = horasTrabajadas;
        this.costoPorDia=costoPorDia;
    }
    
    /**
     * Método de acceso que devuelve el valor de horas trabajadas.
     * @return el valor de horas trabajadas.
     */
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Método de acceso que modifica el valor de horas trabajadas
     * @param horasTrabajadas valor de horas trabajadas que será establecido
     * en el atributo
     */
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Método de acceso que devuelve el valor de costo por día.
     * @return el valor de costo por día.
     */
    public double getCostoPorDia() {
        return costoPorDia;
    }

    /**
     * Método de acceso que modifica el valor de costo por día
     * @param costoPorDia valor de costo por día que será establecido
     * en el atributo
     */
    public void setCostoPorDia(double costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    /**
     * Sobrescribe el método calcularSueldo de Empleado
     * Calcula el sueldo de un Empleado Base
     * 
     * @see Empleado
     */
    @Override
    public double calcularSueldo() {
        return horasTrabajadas*costoPorDia;
    }
    
    /**
     * Método que calcula el ISR para un Empleado Temporal
     * @return el valor de ISR
     */
    public double calcularIsr(){
        double sueldoTotal = horasTrabajadas*costoPorDia;
        double isr=0.0;
        if( 0 <= sueldoTotal && sueldoTotal <= 5000 ){
            isr = sueldoTotal * 0.07;
        }else if (5001 <=sueldoTotal && sueldoTotal<=10000){
            isr = sueldoTotal * 0.12;
        }else if(10001<= sueldoTotal && sueldoTotal<=20000){
            isr = sueldoTotal * 0.20;
        }else if(sueldoTotal>20001){
            isr = sueldoTotal * 0.25;
        }
        return isr;
    }
    
    
}
