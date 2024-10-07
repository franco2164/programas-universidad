/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_uno;

/**
 *
 * Clase principal que ejecuta ejemplos de uso de las clases Alumno, Profesor y Administrativo.
 * Esta clase crea instancias de las clases Alumno, Profesor y Administrativo y llama a métodos 
 * específicos de cada instancia para mostrar sus funcionalidades.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @version 2024-07-23
 * 
 * @see Alumno
 * @see Profesor
 * @see Administrativo
 */


public class Principal {
    
    /**
     * Constructor por defecto para la clase Principal.
     * <p>
     * Este constructor no realiza ninguna acción especial.
     * </p>
     */
    public Principal() {
    }
    
    /**
     * Método principal que se ejecuta al iniciar el programa.
     * 
     * @param args los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Mauricio", "Sanchez", "Lopez", "17-I", "Azcapotzalco");
        System.out.println(alumno.generarMatricula());
        
        Profesor profesor = new Profesor("Jorge", "Fuentes", "Rocha", "235689", "FURJ860423HBCNCR08");
        System.out.println(profesor.obtenerSexo());
        System.out.println(profesor.validarCurp());
        System.out.println(profesor.obtenerEdoNacimiento());
        
        //Administrativo administra = new Administrativo("Sofia", "Martinez", "Rodriguez", "123489", "15/05/1989");
        Administrativo administrativo = new Administrativo("Sofia", "Martinez", "Rodriguez", "2232000209", "15/05/1989" );
        System.out.println(administrativo.generarRFC());
        
        
        
        
        //////////////////// ejemplo 2

        Alumno alumnoDos = new Alumno("Carla", "Trujillo", "Sandoval", "23-P", "lerma");
        System.out.println(alumnoDos.generarMatricula());
        
        Profesor profesorDos = new Profesor("Julio", "Trujillo", "Flores", "889658", "TRFJ910819HMSRLL07");
        System.out.println(profesorDos.obtenerSexo());
        System.out.println(profesorDos.validarCurp());
        System.out.println(profesorDos.obtenerEdoNacimiento());
        
        Administrativo administrativoDos = new Administrativo("Regina", "Diaz", "Medina", "30301", "29/02/1995" );
        System.out.println(administrativoDos.generarRFC());
        
        
        
        
        
        ////// Ejemplo 3

        Administrativo administrativoTres = new Administrativo("Maricela", "Romero", "Huerto", "54321", "01/08/1962" );
        System.out.println(administrativoTres.generarRFC());
        
        
        Profesor profesorTres = new Profesor("Cecilia", "Cruz", "Colorado", "758965", "CRCC850623MNERLE04");
        System.out.println(profesorTres.obtenerSexo());
        System.out.println(profesorTres.validarCurp());
        System.out.println(profesorTres.obtenerEdoNacimiento());
        
        Alumno alumnoTres = new Alumno("Diego", "Martinez", "Negrete", "21-O", "Iztapalapa");
        System.out.println(alumnoTres.generarMatricula());
        
    }
}
