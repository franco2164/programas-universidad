/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uam.azc;

/**
 * Esta clase proporciona métodos para realizar varias 
 * operaciones matemáticas avanzadas, incluyendo el cálculo del factorial, 
 * el cálculo de la potencia de un número, la serie de Fibonacci, la obtención 
 * de raíces cuadráticas y la validación de números de Armstrong.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @version 2024-08-13
 */
public class OperacionAvanzada {

    /**
     * Calcula el factorial de un número entero dado.
     * 
     * @param numero valor para calcular su factorial. Debe ser un número no negativo.
     * @return el factorial del número dado. Si el número es 0 o 1, retorna 1.
     */
    public int calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) return 1;
        else {
            return numero * calcularFactorial(numero - 1);
        }
    }

    /**
     * Calcula la potencia de un número dado elevado a un exponente.
     * 
     * @param a valor de la base de la potencia.
     * @param b valor del exponente al que se elevará la base.
     * @return resultado de elevar la base a al exponente b (a^b)
     */
    public long elevarPotencia(int a, int b) {
        long potencia = 1;
        for (int i = b; i > 0; i--) {
            potencia *= a;
        }
        return potencia;
    }

    /**
     * Calcula el n-ésimo número en la secuencia de Fibonacci.
     * 
     * @param a es el valor de la posición en la secuencia de Fibonacci (debe ser un entero positivo).
     * @return el n-ésimo número en la secuencia de Fibonacci.
     */
    public int devolverFibonacci(int a) {
        int suma = 0, actual = 0, siguiente = 1;
        for (int i = 1; i < a; i++) {
            suma = actual + siguiente;
            actual = siguiente;
            siguiente = suma;
        }
        return suma;
    }

    /**
     * Calcula las raíces de una ecuación cuadrática de la forma ax^2 + bx + c = 0.
     * 
     * @param a es el valor del coeficiente del término cuadrático.
     * @param b es el valor del coeficiente del término lineal.
     * @param c es el valor del término independiente.
     * @return una cadena que representa las raíces de la ecuación cuadrática. 
     *  Si el discriminante es positivo, devuelve las dos raíces reales. 
     *  Si el discriminante es 0, devuelve una única raíz real. 
     *  Si el discriminante es negativo, indica que las raíces son complejas.
     * 
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html"> Clase Math en java</a>
     */
    public String obtenerRaices(int a, int b, int c) {
        double dentroRaiz = (b * b) - (4 * a * c);
        if (dentroRaiz > 0) {
            double solucionUno = (-b + Math.sqrt(dentroRaiz)) / (2 * a);
            double solucionDos = (-b - Math.sqrt(dentroRaiz)) / (2 * a);
            return "x1= " + solucionUno + ", x2= " + solucionDos;
        } else if (dentroRaiz == 0) {
            double solucionUno = (-b) / (2 * a);
            return "x1= " + solucionUno;
        } else {
            return "Las raices son complejas";
        }
    }

    /**
     * Valida si un número dado es un número de Armstrong.
     * 
     * Un número de Armstrong es un número que es igual a la suma de sus 
     * propios dígitos cada uno elevado a la potencia del número total de 
     * dígitos.
     * 
     * @param numero es el número a validar.
     * @return una cadena que indica si el número es un número de Armstrong o No
     */
    public String validarNumeroAmstrong(int numero) {
        String numeros = String.valueOf(numero);
        char[] digitos = numeros.toCharArray();
        int suma = 0;
        for (int i = 0; i < digitos.length; i++) {
            int digito = digitos[i] - '0';
            suma += elevarPotencia(digito, numeros.length());
        }
        
        if (suma == numero) {
            return "Es numero Amstrong";
        } else {
            return "NO es numero Amstrong";
        }
    }
}
