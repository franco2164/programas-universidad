/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio;

import java.time.LocalTime;

/**
 * Clase principal que ejecuta ejemplo de uso de las clases Nota y Producto
 * @author Monserrath Hernandez
 * @author Cristian Ceron
 * @author Ricardo Nava
 * 
 * @see Nota
 * @see Producto
 */
public class Principal {

    /**
     * Método principal que se ejecuta al iniciar el programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nota unaNota;
        unaNota = new Nota ("001","Pedro Rocha","5553189000", "San Pablo Xalpa 180");
        Producto producto1 = new Producto(3, "Carpeta anillada metalica",200);
        Producto producto2 = new Producto(2, "Tinta china de color negro",150);
        Producto producto3 = new Producto(5, "Cinta adhesiva transparente",100);
        Producto producto4 = new Producto(1, "Engrapadora clásica Manual de Escritorio",400);
        Producto producto5 = new Producto(1, "Lápices de madera para oficina",200);
        
        unaNota.agregarProducto(producto1);
        unaNota.agregarProducto(producto2);
        unaNota.agregarProducto(producto3);
        unaNota.agregarProducto(producto4);
        unaNota.agregarProducto(producto5);
        
        System.out.println(unaNota);
        System.out.println("\nEl importe a pagar sin IVA: "+unaNota.calcularTotalSinIVA());
        System.out.println("El IVA es: "+unaNota.calcularIVA());
        System.out.println("El total a pagar es: "+unaNota.calcularTotalSuma());
        System.out.println(unaNota.calcularDescuento());
    }
    
}
