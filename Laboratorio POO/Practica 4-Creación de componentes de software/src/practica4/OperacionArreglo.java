/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uam.azc;

/**
 * Esta clase proporciona métodos para realizar varias 
 * operaciones con arreglos, incluyendo el cálculo del promedio de los elementos de un arreglo, 
 * obtener el número mayor, insertar un valor en una posición dada,
 * suma de los elementos de posiciones pares a partir de una posición dada, y el ordenamiento
 * de un arreglo de menor a mayor (sin utilizar el método sort, y no implementando bubble sort).
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @version 2024-08-13
 */
public class OperacionArreglo {
    
     /**
     * Calcula el promedio de los elementos de un arreglo de enteros.
     *
     * @param arreglo es el arreglo de números enteros.
     * @return el valor del promedio de los elementos del arreglo.
     */
    public double calcularPromedio(int[] arreglo) {
        int suma = 0;
        double promedio=0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        promedio = (double) suma / arreglo.length;
        return promedio;
    }

    /**
     * Encuentra el número mayor en un arreglo de enteros.
     *
     * @param arreglo es el arreglo de números enteros.
     * @return el valor del número mayor en el arreglo.
     */
    public int obtenerMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    /**
     * Inserta un número en una posición específica de un arreglo.
     *
     * @param arreglo es el arreglo original de números enteros.
     * @param numero  es el número a insertar en una posición.
     * @param posicion es la posición en la que se debe insertar el número.
     * @return un nuevo arreglo con el número insertado en la posición indicada.
     */
    public int[] insertar(int[] arreglo, int numero, int posicion) {
        int[] nuevoArreglo = new int[arreglo.length + 1];
        for (int i = 0, j = 0; i < nuevoArreglo.length; i++) {
            if (i == posicion) {
                nuevoArreglo[i] = numero;
            } else {
                nuevoArreglo[i] = arreglo[j++];
            }
        }
        return nuevoArreglo;
    }

    /**
     * Suma los elementos de las posiciones pares a partir de una posición dada.
     *
     * @param arreglo  es el arreglo de números enteros.
     * @param posicion es el valor de la posición desde la cual comenzar a sumar.
     * @return el valor de la suma de los elementos en las posiciones pares.
     */
    public int sumarPosicionesPares(int[] arreglo, int posicion) {
        int suma = 0;
       if(posicion %2 !=0){
           posicion +=1;
       }
        for (int i = posicion; i < arreglo.length; i += 2) {
            suma += arreglo[i];
        }
        return suma;
    }

    /**
     * Ordena un arreglo de enteros de menor a mayor
     *
     * @param arreglo es el arreglo de números enteros a ordenar.
     * @return un nuevo arreglo ordenado de menor a mayor.
     */
    public int[] ordenar(int[] arreglo) {
        int[] nuevoArreglo = arreglo.clone();
        for (int i = 1; i < nuevoArreglo.length; i++) {
            int key = nuevoArreglo[i];
            int j = i - 1;
            while (j >= 0 && nuevoArreglo[j] > key) {
                nuevoArreglo[j + 1] = nuevoArreglo[j];
                j = j - 1;
            }
            nuevoArreglo[j + 1] = key;
        }
        return nuevoArreglo;
    }
}