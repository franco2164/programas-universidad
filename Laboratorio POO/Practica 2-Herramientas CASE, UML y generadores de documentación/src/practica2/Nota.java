/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Esta clase se encarga de realizar operaciones para crear una Nota, la cuál está compuesta por una clase Cliente y se realiza agregación por una clase Producto.
 * @author Monserrath Hernandez
 * @author Cristian Ceron
 * @author Ricardo Nava
 * @see Cliente
 * @see Producto
 * @version 2024-07-31
 */
public class Nota {
    private String folio;
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente;
    private ArrayList <Producto> productos;
    
/**
 * Constructor por omision de la clase Nota 
 * @see Cliente
 * @see Producto
 */
    public Nota() {
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        cliente = new Cliente();
        productos = new ArrayList<>();
    }
/**
 * Constructor parametrizado de la clase Nota
 * @param folio valor inicial para el número de folio de una Nota
 * @param nombre valor inicil para el nombre de un Cliente
 * @param numTelefonico valor inicial para el númTelefonico de un Cliente
 * @param direccion valor inicial para la dirección de un Cliente 
 * @see Cliente
 * @see Producto 
 * 
 * @see <a href="https://docs.oracle.com/javase%2F8%2Fdocs%2Fapi%2F%2F/java/time/LocalDate.html">Método LocalDate en Java</a>
 * @see <a href="https://docs.oracle.com/en%2Fjava%2Fjavase%2F22%2Fdocs%2Fapi%2F%2F/java.base/java/time/LocalTime.html">Método LocalTime en Java</a>
 */

    public Nota(String folio, String nombre, String numTelefonico, String direccion) {
        this.folio = folio;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        cliente = new Cliente(nombre, numTelefonico, direccion);
        productos = new ArrayList<>();
    }
    
/**
 * Método de acceso que devuelve el valor del folio de la Nota
 * @return el valor del folio de una Nota
 */

    public String getFolio() {
        return folio;
    }
/**
 * Método de acceso que establece el valor del folio de la Nota
 * @param folio valor del folio que será establecido en el atributo
 */

    public void setFolio(String folio) {
        this.folio = folio;
    }
    
/**
 * Método de acceso que devuelve el valor de la fecha actual
 * @return el valor de la fecha actual
 */

    public LocalDate getFecha() {
        return fecha;
    }
    
/**
 * Método de acceso que establece el valor de la fecha actual
 */

    public void setFecha() {
        this.fecha = LocalDate.now();
    }
/**
 * Método de acceso que devuelve el valor de la hora actual
 * @return el valor de la hora actual
 */

    public LocalTime getHora() {
        return hora;
    }
    
/**
 * Método de acceso que establece el valor de la hora actual
 */

    public void setHora() {
        this.hora = LocalTime.now();
    }
 
/**
 * Agrega unProducto en la clase Nota
 * @param unProducto valor del producto que será establecido en el atributo
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Clase Object</a>
 */
    
    public void agregarProducto(Producto unProducto){
        productos.add(unProducto);
    }
    
/**
 * Calcula la suma sin IVA del precio del producto por la cantidad de productos
 * @return valor obtenido del total sin IVA
 */
    public double calcularTotalSinIVA(){
        double total = 0;
        for(Producto producto: productos){
            total+=producto.getPrecio()*producto.getCantidad();
        }   return total;   
    }

/**
 * Calcula el IVA del precio total 
 * @return valor del IVA del precio total de los productos
 * @see #calcularTotalSinIVA() referencia a un método de la misma clase
 */
    public double calcularIVA(){
        return (double) calcularTotalSinIVA()*0.16;
    }
    
/**
 * Calcula el total del precio sin IVA más el IVA correspondiente
 * @return valor de la suma total de ambos precios
 * @see #calcularTotalSinIVA() referencia a un método de la misma clase 
 * @see #calcularIVA() referencia a un método de la misma clase 
 */
    public double calcularTotalSuma(){
        return (double) calcularTotalSinIVA()+calcularIVA();
    }

/**
 * Calcula el descuento de la suma total 
 *
 * Calcula suma total menos el descuento 
 * Comparar si la compra se realiza despues de las 12 hrs para obtener el descuento, si no, no aplica dicho descuento 
 * @return valor de descuento
 * @see #calcularTotalSuma() referencia a un método de la misma clase
 */
    
    public double calcularDescuento(){
        double descuento=calcularTotalSuma()*0.10;
        double totalDescuento;
        if (hora.isAfter(LocalTime.NOON)){
            System.out.println("***Promoción de la tienda el Total con descuento a pagar es: "); 
           totalDescuento=calcularTotalSuma()-descuento;
        }else{
            totalDescuento= 0;
        }
        
        return totalDescuento;
    }

/**
 * Sobrescribe el método toString de la clase Object
 * @return una cadena con la representación del estado de la Nota
 * @see <a href="https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html">Clase Object</a>
 */
    @Override
    public String toString() {
        return "Nota" + "\nFolio: " + folio + ", Fecha: " + fecha + ", Hora: " + hora  + cliente + productos;
    }
    
}
