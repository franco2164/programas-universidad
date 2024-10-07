/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_uno;

import java.util.HashMap;

/**
 * Clase que representa a un profesor.
 * La clase Profesor hereda de la clase Trabajador e incluye información adicional 
 * específica de un profesor, como el CURP. 
 * Además, proporciona un método para validar el CURP de un profesor.
 * 
 * @see Persona
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * @version 2024-07-23
 */
public class Profesor extends Trabajador {

    private String curp;

    /**
     * Constructor por defecto.
     */
    public Profesor() {
    }

    /**
     * Constructor con parámetros para inicializar un objeto Profesor.
     * 
     * @param nombre el valor inicial del nombre del profesor.
     * @param apellidoPaterno el valor inicial del apellido paterno del profesor.
     * @param apellidoMaterno el valor inicial del apellido materno del profesor.
     * @param numEconomico el valor inicial del número económico del profesor.
     * @param curp el valor inicial de la CURP del profesor.
     */
    public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, String numEconomico, String curp) {
        super(nombre, apellidoPaterno, apellidoMaterno, numEconomico);
        this.curp = curp;
    }

    /**
     * Obtiene el sexo del profesor basado en la CURP, es decir, se obtiene la letra que corresponde al sexo
     * de la persona y se valida qué tipo de letra es.
     * 
     * @return "Masculino" si el carácter correspondiente es 'H', "Femenino" si es 'M', de lo contrario "No binario".
     */
    public String obtenerSexo() {
        char sexo = curp.charAt(curp.length() - 8 );
        if (sexo == 'H') {
            return "Masculino";
        } else if (sexo == 'M') {
            return "Femenino";
        } else {
            return "No binario";
        }
    }

    /**
     * Obtiene el estado de nacimiento del profesor basado en la CURP y basado en las entidades de nacimiento
     * de la Republica Mexicana
     * 
     * @return el estado de nacimiento como una cadena de texto.
     * 
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">Métodos para cadenas en Java</a>
     */
    public String obtenerEdoNacimiento() {
        String clave = curp.substring(11, 13);
        String edoNacimiento = EntidadesNacimiento(clave);
        return edoNacimiento;
    }

    /**
     * Valida la CURP del profesor, el CURP debe estar formado por la primera consonante del apellido paterno
     * y la primera vocal del apellido paterno, si esto no se cumple, no es valido el CURP
     * 
     * @return "El curp es valido" si la CURP es válida, de lo contrario "El curp es invalido".
     */
    public String validarCurp() {
        char consonante = curp.charAt(0);
        char vocal = curp.charAt(1);
        
        if (esVocal(vocal) && esConsonante(consonante)) {
            return "El curp es valido";
        } else {
            return "El curp es invalido";
        }
    }

    /**
     * Obtiene el nombre de la entidad de nacimiento del profesor basada en la clave proporcionada.
     * se guarda en un HashMap la clave y el valor para facilitar la busqueda de dicha entidad
     * 
     * @param clave la clave de la entidad de nacimiento del profesor.
     * @return el nombre de la entidad de nacimiento como una cadena de texto.
     * 
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html">Todo sobre HashMap en Java</a>
     * @see <a href="http://www.dgis.salud.gob.mx/contenidos/intercambio/entidades_gobmx.html">Entidades en la Republica Mexicana</a>
     */
    public String EntidadesNacimiento(String clave) {
        HashMap<String, String> entidadNacimiento = new HashMap<>();
        entidadNacimiento.put("AS", "AGUASCALIENTES");
        entidadNacimiento.put("BC", "BAJA CALIFORNIA");
        entidadNacimiento.put("BS", "BAJA CALIFORNIA SUR");
        entidadNacimiento.put("CC", "CAMPECHE");
        entidadNacimiento.put("CL", "COAHUILA DE ZARAGOZA");
        entidadNacimiento.put("CM", "COLIMA");
        entidadNacimiento.put("CS", "CHIAPAS");
        entidadNacimiento.put("CH", "CHIHUAHUA");
        entidadNacimiento.put("DF", "CIUDAD DE MEXICO");
        entidadNacimiento.put("DG", "DURANGO");
        entidadNacimiento.put("GT", "GUANAJUATO");
        entidadNacimiento.put("GR", "GUERRERO");
        entidadNacimiento.put("HG", "HIDALGO");
        entidadNacimiento.put("JC", "JALISCO");
        entidadNacimiento.put("MC", "MEXICO");
        entidadNacimiento.put("MN", "MICHOACAN");
        entidadNacimiento.put("MS", "MORELOS");
        entidadNacimiento.put("NT", "NAYARIT");
        entidadNacimiento.put("NL", "NUEVO LEON");
        entidadNacimiento.put("OC", "OAXACA");
        entidadNacimiento.put("PL", "PUEBLA");
        entidadNacimiento.put("QT", "QUERETARO");
        entidadNacimiento.put("QR", "QUINTANA ROO");
        entidadNacimiento.put("SP", "SAN LUIS POTOSI");
        entidadNacimiento.put("SL", "SINALOA");
        entidadNacimiento.put("SR", "SONORA");
        entidadNacimiento.put("TC", "TABASCO");
        entidadNacimiento.put("TS", "TAMAULIPAS");
        entidadNacimiento.put("TL", "TLAXCALA");
        entidadNacimiento.put("VZ", "VERACRUZ");
        entidadNacimiento.put("YN", "YUCATAN");
        entidadNacimiento.put("ZS", "ZACATECAS");
        entidadNacimiento.put("NE", "EXTRANJERO");
        
        return entidadNacimiento.get(clave);
    }

    /**
     * Verifica si un carácter es una vocal.
     * 
     * @param c el carácter a verificar.
     * @return true si el carácter es una vocal, de lo contrario false.
     */
    private boolean esVocal(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    /**
     * Verifica si un carácter es una consonante.
     * 
     * @param c el carácter a verificar.
     * @return true si el carácter es una consonante, de lo contrario false.
     */
    private boolean esConsonante(char c) {
        return "BCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1;
    }
}
