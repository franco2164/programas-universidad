/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uam.azc;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * Clase que representa una Consulta.
 * 
 * En la clase Consulta se implementa la interface Serializable e incluye
 * información adicional, como su texto (consulta) y du hora de consulta.
 * Proporciona métodos de acceso a los atributos.
 *
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html">Interface Serializable en Java</a>
 * 
 * @version 2024-08-28
 */
public class Consulta implements Serializable {
    private String texto;
    private LocalTime horaConsulta;

    /**
     * Constructor por omisión.
     */
    public Consulta() {
    }

    /**
     * Constructor con parámetros.
     * @param texto el valor inicial del atributo texto.
     */
    public Consulta(String texto) {
        this.texto = texto;
        this.horaConsulta = LocalTime.now();
    }

    /**
     * Método de acceso que devuelve el valor del texto
     * @return el valor del texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Método de acceso que modifica el valor del texto
     * @param texto el valor del texto que será establecido en el atributo
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Método de acceso que devuelve el valor de la hora de consulta
     * @return el valor de horaConsulta
     */
    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }

    /**
     * Método de acceso que modifica el valor de la hota de consulta
     * @param horaConsulta el valor de la horaConsulta que seá establecido
     * en el atributo
     */
    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
}
