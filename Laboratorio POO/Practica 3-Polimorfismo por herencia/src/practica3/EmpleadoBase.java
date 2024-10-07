/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicatres;

import static com.mycompany.practicatres.IRecibo.IMSS;

/**
 * Clase que representa a un Empleado Base.
 * 
 * La clase Empleado Base incluye atributos básicos como diasTrabajados 
 * y costoDia. Sobrescribe el método calcularSueldo e implementa los métodos
 * calcularIsr y calcularIMSS.
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
public class EmpleadoBase extends Empleado {
    
    private int diasTrabajados;
    private double costoDia;
            
    /**
     * Constructor por omisión.
     */
    public EmpleadoBase() {
    }
    
    /**
     * Constructor con parámetros para inicializar un objeto EmpleadoBase con
     * parametros de la Superclass Empleado.
     * @param diasTrabajados valor inicial del atributo diasTrabajados
     * @param costoDia valor inicial del atributo costoDia
     * @param nombre valor inicial del atributo nombre
     * @param numeroEmpleado valor inicial del atributo numeroEmpleado
     * @param sexo valor inicial del atributo sexo
     * @param rfc valor inicial del atributo rfc
     */
    public EmpleadoBase(int diasTrabajados, double costoDia, String nombre, String numeroEmpleado, String sexo, String rfc) {
        super(nombre, numeroEmpleado, sexo, rfc);
        this.diasTrabajados = diasTrabajados;
        this.costoDia = costoDia;
    }
    
    /**
     * Método de acceso que devuelve el valor de dias trabajados
     * @return el valor de dias trabajados
     */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    /**
     * Método de acceso que modifica el valor de dias trabajados
     * @param diasTrabajados valor de dias trabajados que será establecido
     * en el atributo
     */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    /**
     * Método de acceso que devuelve el valor de Costo día
     * @return el valor de Costo Día
     */
    public double getCostoDia() {
        return costoDia;
    }

    /**
     * Método de acceso que modifica el valor de costo dia
     * @param costoDia valor de costo dia que será establecido en el
     * atributo
     */
    public void setCostoDia(double costoDia) {
        this.costoDia = costoDia;
    }

    /**
     * Sobrescribe el método calcularSueldo de Empleado
     * Calcula el sueldo de un Empleado Base
     * 
     * @see Empleado
     */
    @Override
    public double calcularSueldo() {
        return diasTrabajados*costoDia;
    }

    /**
     * Método que calcula el ISR para un Empleado Base.   
     * @param bono valor de bono
     * @param vale valor de vale
     * @return el valor de ISR
     */
    public double calcularIsr(int bono, int vale){
        double sueldo=diasTrabajados*costoDia+bono+vale;
        double ISR;
        if(0<=sueldo && sueldo<=4200){
            ISR=(sueldo*0.064);            
        } else if (sueldo>=4201 && sueldo<=8600){
            ISR=(sueldo*0.13);
        } else if (sueldo>=8601 && sueldo<=15000){
            ISR=(sueldo*0.18);    
        }else if (sueldo>=15001 && sueldo<=30000){
            ISR=(sueldo*0.24);
        }else {
            ISR=(sueldo*0.30);
    }
        return ISR;
    }
    
    /**
     * Método que calcula el IMSS
     * @param bono valor de bono
     * @param vale valor de vale
     * @return el valor de IMSS
     */
    public double calcularIMSS(int bono, int vale){
        double sueldo=diasTrabajados*costoDia+bono+vale;
        return sueldo * IMSS;
    }
    
}
