/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicatres;

import java.util.ArrayList;

/**
 * Clase principal.
 * Clase principal que ejecuta ejemplos de uso de las clases Administrativo,
 * Consultor, PersonalDeSoporte y Programador.
 * Esta clase crea instancias de las clases Administrativo,
 * Consultor, PersonalDeSoporte y Programador. y llama a métodos 
 * específicos de cada instancia para mostrar sus funcionalidades.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @see Administrativo
 * @see PersonalDeSoporte
 * @see Programador
 * @see Consultor
 * 
 * @version 2024-08-06
 */
public class PracticaTres {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * 
     * @param args los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Prueba 1 - Programador
        System.out.println("Prueba 1 - Programador");
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("C");
        lenguajes.add("Java");
        lenguajes.add("C++");
        lenguajes.add("Python");
        Programador programadorUno = new Programador(lenguajes, 24, 800, "Hugo", "2227", "Masculino", "PALH621116876");
        programadorUno.imprimirRecibo();
        System.out.println("\n");
        
        // Prueba 2 - Programador
        System.out.println("Prueba 2 - Programador");
        ArrayList<String> lenguajesDos = new ArrayList<>();        
        lenguajesDos.add("Java");
        lenguajesDos.add("C++");
        Programador programadorDos = new Programador(lenguajesDos, 20, 775, "Juan", "1548", "Masculino", "REOJ590807RFA");
        programadorDos.imprimirRecibo();
        System.out.println("\n");
        
         // Prueba 3 - Administrativo
        System.out.println("Prueba 3 - Administrativo");
        Administrativo administrativoUno = new Administrativo("Oficina 287-B", 30, 800, "Paola", "3289", "Femenino", "BAGP8405174IA");
        administrativoUno.imprimirRecibo();
        System.out.println("\n");
        
         // Prueba 4 - Consultor
        System.out.println("Prueba 4 - Consultor");
        Consultor consultor = new Consultor("Lilia", "1252", "Femenino", "VATL610113MW8","Software y Servicios",40.5, 200);
        consultor.imprimirRecibo();
        System.out.println("\n");
        
        // Prueba 5 - Soporte
        System.out.println("Prueba 5 - Soporte");
        PersonalDeSoporte soporte = new PersonalDeSoporte("Mario", "2250", "Masculino", "ROHM5612157P3","5554837000", 50.5, 300);
        soporte.imprimirRecibo();
        System.out.println("\n");
        
    }
}
