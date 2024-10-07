/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicatres;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Clase que representa a un Empleado.
 * 
 * La clase abstracta Empleado incluye atributos básicos como nombre, 
 * nummero de empleado, sexo y rfc. Proporciona un método abstracto para
 * Calcular el saldo neto e implementa un método para Obtener jubilacion.
 * Proporciona métodos de acceso a los atributos.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * 
 * @version 2024-08-06
 */
public abstract class  Empleado {
    private String nombre;
    private String numeroEmpleado;
    private String sexo;
    private String rfc;

    /**
     * Constructor por omisión.
     */
    public Empleado() {
    }

    /**
     * Constructor con parámetros
     * @param nombre valor inicial del atributo nombre
     * @param numeroEmpleado valor inicial del atributo numeroEmpleado
     * @param sexo valor inicial del atributo sexo
     * @param rfc valor inicial del atributo rfc
     */
    public Empleado(String nombre, String numeroEmpleado, String sexo, String rfc) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.sexo = sexo;
        this.rfc = rfc;
    }

    /**
     * Método de acceso que devuelve el valor del nombre
     * @return el valor del nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método de acceso que modifica el valor del nombre
     * @param nombre valor del nombre que será establecido en el atributo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método de acceso que devuelve el valor del Numero de Empleado
     * @return el valor del Numero de Empleado
     */
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }
    
    /**
     * Método de acceso que modifica el valor del Numero de Empleado
     * @param numeroEmpleado valor del numero de empleado que será 
     * establecido en el atributo
     */
    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    /**
     * Método de acceso que devuelve el valor del sexo
     * @return el valor del sexo
     */
    public String getSexo() {
        return sexo;
    }
    
    /**
     * Método de acceso que modifica el valor del sexo
     * @param sexo valor del sexo que será establecido en el atributo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Método de acceso que devuelve el valor del rfc
     * @return el valor del rfc
     */
    public String getRfc() {
        return rfc;
    }
    
    /**
     * Método de acceso que modifica el valor del rfc
     * @param rfc valor del rfc que será establecido en el atributo
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    /**
     * Firma de un método abstracto que calcula el sueldo neto y devuelve el
     * valor
     * @return el valor de calcularSueldoNeto
     */
    public abstract double calcularSueldo();
    
    /**
     * Obtiene si un empleado es candidato para Jubilarse o si no es candidato
     * para Jubilarse
     * 
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalDate.html">Clase LocalDate en Java</a>
     * 
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html"> Clase String en Java </a>
     * 
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/temporal/ChronoUnit.html"> Clase ChronoUnit en Java </a>
     */
    public void obtenerJubilacion(){
        String anio = getRfc().substring(4, 6);
        String mes = getRfc().substring(6, 8);
        String dia = getRfc().substring(8, 10);
        String nacimientoFecha="19"+anio+"-"+mes+"-"+dia;
        
        LocalDate inicio = LocalDate.parse(nacimientoFecha);
        LocalDate actual = LocalDate.now();
        
        long anios=ChronoUnit.YEARS.between(inicio, actual);
        
        if(getSexo().equalsIgnoreCase("MASCULINO")){
            if (anios>=65) {
                System.out.println("\t\tEl empleado es candidato para Jubilarse");
            }
            else{
                System.out.println("\t\tEl empleado no es candidato para Jubilarse");
            }
        }
        else{
            if (anios>=60) {
                System.out.println("\t\tEl empleado es candidata para Jubilarse");
            }
            else{
                System.out.println("\t\tEl empleado no es candidata para Jubilarse");
            }
        }
    }
}
