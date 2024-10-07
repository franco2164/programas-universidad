/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_uno;

import java.util.Random;

/**
 * Clase que representa a un alumno.
 *
 * La clase Alumno hereda de la clase Persona e incluye información adicional 
 * específica de los alumnos, como el trimestre de ingreso y la unidad. 
 * Además, proporciona métodos para generar una matrícula de alumno.
 * 
 * @see Persona
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @version 2024-07-23
 */
public class Alumno extends Persona {
    private String trimestreIngreso;
    private String unidad;

    /**
     * Constructor por defecto.
     */
    public Alumno() {
       
    }

    /**
     * Constructor con parámetros para inicializar un objeto Alumno.
     * 
     * @param nombre el valor inicial del nombre del alumno.
     * @param apellidoPaterno el valor inicial del apellido paterno del alumno.
     * @param apellidoMaterno el valor inicial del apellido materno del alumno.
     * @param trimestreIngreso el valor inicial del trimestre de ingreso del alumno.
     * @param unidad el valor inicial de la unidad a la que pertenece el alumno.
     */
    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno,String trimestreIngreso, String unidad) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.trimestreIngreso = trimestreIngreso;
        this.unidad = unidad;
       
    }

    /**
     * Método de acceso que obtiene el trimestre de ingreso del alumno.
     * 
     * @return El trimestre de ingreso.
     */
    public String getTrimestreIngreso() {
        return trimestreIngreso;
    }

     /**
     * Método de acceso que modifica el trimestre de ingreso del alumno.
     * 
     * @param trimestreIngreso valor que será establecido en el atributo.
     */
    public void setTrimestreIngreso(String trimestreIngreso) {
        this.trimestreIngreso = trimestreIngreso;
    }

     /**
     * Método de acceso que obtiene la unidad en la que estudia el alumno.
     * 
     * @return la unidad de estudio.
     */
    public String getUnidad() {
        return unidad;
    }

     /**
     * Método de acceso que modifica la unidad en la que estudia el alumno.
     * 
     * @param unidad valor que será establecido en el atributo.
     */
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
   
    /**
     * Valida la unidad a la que pertenece el alumno y devuelve el código correspondiente a dicha unidad.
     * 
     * @return El valor del código de la unidad.
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">Métodos para cadenas en Java</a>
     */
    private String validarUnidad(){
        String tmp;
       
        if(unidad.equalsIgnoreCase("Xochimilco"))
            tmp="1";
        else if(unidad.equalsIgnoreCase("Azcapotzalco"))
            tmp="2";
        else if(unidad.equalsIgnoreCase("Iztapalapa"))
            tmp="3";
        else if(unidad.equalsIgnoreCase("Cuajimalpa"))
            tmp="4";
        else
            tmp="5";
        return tmp;
    }

    /**
     * Obtiene el año de ingreso a partir del trimestre de ingreso del alumno.
     * 
     * @return el valor en dos digitos del año de ingreso del alumno.
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">Métodos para cadenas en Java</a>
     */
    private String obtenerAnioIngreso(){
       return trimestreIngreso.substring(0, 2);
    }
    
     /**
     * Obtiene el trimestre en formato de estación I para invierno, P para primavera y O para otoño.
     * 
     * @return la estación del trimestre en el que ingreso el alumno.
     */
    private String obtenerTrimestre(){
        String estacion;
        String trimestre = trimestreIngreso.substring(3, 4);
       
        if(trimestre.equalsIgnoreCase("I"))
            estacion="1";
        else if(trimestre.equalsIgnoreCase("P"))
            estacion="2";
        else
           estacion="3";
        
        return estacion;
    }
    
    
    /**
     * Genera un número aleatorio entre 0 y 2.
     * 
     * @return Un número aleatorio generado.
     * 
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html">Clase Random en Java</a>
     */
    private String obtenerAleatorioUno(){
        Random rnd = new Random();
        String random= String.valueOf(rnd.nextInt(3));
        return random;
    }
    
    /**
     * Genera un número aleatorio entre 0 y 4.
     * 
     * @return el número aleatorio generado.
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html">Clase Random en Java</a>
     */
    private String obtenerAleatorioDos(){
        Random rnd = new Random();
        String random= String.valueOf(rnd.nextInt(5));
        return random;
    }
    
    /**
     * Genera un número aleatorio entre 5 y 9.
     * 
     * @return Un número aleatorio generado.
     * 
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html">Clase Random en Java</a>
     */
    private String obtenerAleatorioTres(){
        Random rnd = new Random();
        String random= String.valueOf(rnd.nextInt(5)+5);
        return random;
    }
    
    
    /**
     * Genera un número aleatorio entre 0 y 8.
     * 
     * @return Un número aleatorio generado.
     *
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html">Clase Random en Java</a>
     */
    private String obtenerAleatorioCuatro(){
        Random rnd = new Random();
        String random= String.valueOf(rnd.nextInt(9));
        return random;
    }
    
    /**
     * Genera la matrícula del alumno combinando la unidad, año de ingreso, trimestre de ingreso y números aleatorios.
     * 
     * @return La matrícula generada.
     */
    public String generarMatricula(){
        String unidadIngreso = validarUnidad();
        String anioIngreso = obtenerAnioIngreso();
        String trimistre = obtenerTrimestre();
        String aleatorioUno = obtenerAleatorioUno();
        String aleatorioDos = obtenerAleatorioDos();
        String aleatorioTres = obtenerAleatorioTres();
        String aleatorioCuatro = obtenerAleatorioCuatro() + obtenerAleatorioCuatro() + obtenerAleatorioCuatro();
        
        return unidadIngreso+anioIngreso+trimistre+aleatorioUno+aleatorioDos+aleatorioTres+aleatorioCuatro;
    }
}
