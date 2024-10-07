/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uam.azc;

/**
 * Clase que realiza Operaciones con Cadenas.
 * 
 * Proporciona métodos para Contar coincidencias entre dos cadenas,
 * contar el numero de letras mayusculas de una cadena, contar el numero de
 * consonantes en una cadena, validar si una cadena es un palindromo y
 * convertir una cadena.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * @version 2024-08-13
 */
public class OperacionCadena {
    
    /**
     * Método que recibe dos cadena y cuenta el número de coincidencias
     * entre estas dos, por posición y sin importar si son letras mayúsculas
     * o minúsculas y en caso de que las cadenas no sean del mismo
     * tamaño devuelve '-1'. 
     * @param a valor de la primera cadena que se va a comparar.
     * @param b valor de la segunda cadena que se va a comparar.
     * @return el valor del número de coincidencias entre las cadenas o
     * '-1' si no son del mismo tamaño.
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html"> Clase String en Java.</a>
     */
    public int contarCoincidentes(String a, String b){
        a = a.toLowerCase().replaceAll("[^a-z]", "");
        b = b.toLowerCase().replaceAll("[^a-z]", "");

        if (a.length() != b.length()) {
            return -1;
        }

        int cont = 0;

        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                cont++;
            }
        }
        return cont;
    }
    
    /**
     * Método que recibe una cadena y cuenta el número de letras mayusculas
     * que hay dentro de la cadena.
     * @param a valor de la cadena.
     * @return el valor del número de letras mayusculas que hay en la cadena.
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html"> Clase String en Java.</a>
     */
    public int contarMayusculas(String a){
        int cont = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                cont++;
            }
        }
        return cont;
    }
    
    /**
     * Método que recibe una cadena y cuenta el número de letras consonates
     * que hay dentro de la cadena.
     * @param a valor de la cadena.
     * @return el valor del número de letras consonantes que hay en la cadena.
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html"> Clase String en Java.</a>
     */
    public int contarConsonantes(String a){
        a = a.toLowerCase().replaceAll("[^a-z]", "");
        int cont = 0;
        String vocales = "AEIOU";
        for (int i = 0; i < a.length(); i++) {
            if (a.toUpperCase().charAt(i)!= vocales.charAt(0) && a.toUpperCase().charAt(i)!= vocales.charAt(1) &&
                    a.toUpperCase().charAt(i)!= vocales.charAt(2) && a.toUpperCase().charAt(i)!=vocales.charAt(3) &&
                    a.toUpperCase().charAt(i)!=vocales.charAt(4)){
                cont++;
            }
        }
        
        return cont;
    }
    
    /**
     * Método que recibe una cadena y valida si la cadena es un palindromo.
     * @param a el valor de la cadena.
     * @return true si es un palindromo y false si no es un palindromo.
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html"> Clase String en Java.</a>
     */
    public boolean validarPalindromo(String a){
        a = a.toLowerCase().replaceAll("[^a-z]", "");

        int izquierda = 0;
        int derecha = a.length() - 1;

        while (izquierda < derecha) {
            if (a.charAt(izquierda) != a.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }
    
    /**
     * Método que recibe una cadena de letras mayúsculas y reemplaza
     * a las vocales de la siguiente manera:
     * la ‘A’ por ‘4’, la ‘E’ por ‘3’, la ‘I’ por ‘1’, la ‘O’ por ‘0’.
     * @param a el valor de la cadena.
     * @return valor de la cadena convertida.
     * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html"> Clase String en Java.</a>
     */
    public String convertirCadena(String a){
        String vocales = "AEIOU";
        String b="";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)==vocales.charAt(0)){
                b+="4";
            }
            else if(a.charAt(i)==vocales.charAt(1)){
                b+="3";
            }
            else if(a.charAt(i)==vocales.charAt(2)){
                b+="1";
            }
            else if(a.charAt(i)==vocales.charAt(3)){
                b+="0";
            }
            else{
                b+=a.charAt(i);
            }
        }
        return b;
    }
    
}


