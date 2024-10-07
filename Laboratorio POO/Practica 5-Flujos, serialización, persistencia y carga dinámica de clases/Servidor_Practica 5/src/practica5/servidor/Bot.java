package mx.uam.azc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import mx.uam.azc.Consulta;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase que representa a un Bot.
 * 
 * En la clase Bot se tiene como atributo una consulta de tipo Consulta.
 * Proporciona métodos de acceso a los atributos.
 * Nos permite contar signos especificos de puntuacion de la consulta,
 * y borrarlos, conatar palabras vacias especificas y borrarlas, contar
 * palabras clave, actualizar el texto de la consulta, buscar una respuesta
 * adecuada para cada variante de una consulta y preparar la respuesta que
 * se le dara al Cliente.
 *
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">Clase String en Java</a>
 * @version 2024-08-28
 */
public class Bot {

    private Consulta consulta;
    private static final Set<String> PALABRAS_VACIAS = new HashSet<>(Arrays.asList("la", "de", "el", "del", "para", "este", "los", "a", "cuando", "son", "con", "al", "como", "cual", "que", "y"));

    /**
     * Constructor por omisión.
     */
    public Bot() {
    }

    /**
     * Constructor con parámetros.
     * @param consulta el valor inicial del atributo consulta.
     */
    public Bot(Consulta consulta) {
        this.consulta = consulta;
    }

    /**
     * Método de acceso que devuelve el valor de la consulta
     * @return el valor de la consulta
     */
    public Consulta getConsulta() {
        return consulta;
    }

    /**
     * Método de acceso que modifica el valor de la consulta
     * @param consulta el valor de la consulta que sera establecido
     * en el atributo
     */
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    /**
     * Método que verifica si un carácter dado es un signo de puntuación.
     * @param c el valor del caracter que se va a comparar.
     * @return true si es un signo de puntuacion o false si no es un
     * signo de puntuacion.
     */
    private boolean signoPuntuacion(char c) {
        return c == ',' || c == '.' || c == '¡' || c == '!' || c == '¿' || c == '?' || c == '(' || c == ')';
    }

    /**
     * Método que cuenta el numero de signos de puntuacion que hay en
     * la consulta.
     * @return el total de signos puntuacion encontrados en la consulta.
     */
    private int contarSignos() {
        String texto = consulta.getTexto();
        int totalSignos = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (signoPuntuacion(c)) {
                totalSignos++;
            }
        }
        return totalSignos;
    }

    /**
     * Método que elimina de la consulta los signos de puntuacion.
     * @return la consulta sin los signos de puntuacion
     */
    private String eliminarSignos() {
        StringBuilder textoSinSignos = new StringBuilder();
        String texto = consulta.getTexto();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!signoPuntuacion(c)) {
                textoSinSignos.append(c);
            }
        }
        return textoSinSignos.toString();
    }

    /**
     * Método que cuenta el numero de palabras vacias que hay en la consulta.
     * @return el numero de palabras vacias que hay en la consulta
     */
    private int contarPalabrasVacias() {
        String[] palabras = eliminarSignos().split("\\s+");
        int i = 0;

        for (String palabra : palabras) {
            if (PALABRAS_VACIAS.contains(palabra.toLowerCase())) {
                i++;
            }
        }

        return i;
    }

    /**
     * Método que elimina las palabras vacias de la consulta.
     * @return la consulta sin las palabras vacias
     */
    private String eliminarPalabrasVacias() {
        String[] palabras = eliminarSignos().split("\\s+");
        StringBuilder mensajeLimpio = new StringBuilder();

        for (String palabra : palabras) {
            if (!PALABRAS_VACIAS.contains(palabra.toLowerCase())) {
                mensajeLimpio.append(palabra).append(" ");
            }
        }

        return mensajeLimpio.toString().trim();
    }

    /**
     * Método que cuenta el número de palabras clave de la consulta.
     * @return el número de palabras clave que hay en la consulta
     */
    private int contarPalabrasClave() {
        String[] palabras = eliminarPalabrasVacias().split("\\s+");
        int i = 0;

        for (String palabra : palabras) {
            if (!PALABRAS_VACIAS.contains(palabra.toLowerCase())) {
                i++;
            }
        }

        return i;
    }

    /**
     * Método que actualiza el texto de la consulta por el texto ya limpio.
     */
    private void actualizarTextoConsulta() {
        String textoSinSignos = eliminarSignos();
        this.consulta.setTexto(textoSinSignos);

        String textoSinVacias = eliminarPalabrasVacias();
        this.consulta.setTexto(textoSinVacias);
    }

    /**
     * Método que busca la respuesta adecuada para la consulta hecha por el
     * Cliente.
     * @return la respuesta según la consulta
     */
    private String buscarRespuesta() {
        actualizarTextoConsulta();
        String textoConsultaLimpio = this.consulta.getTexto().toLowerCase();

        HashMap<String, String> respuestas = new HashMap<>();

        respuestas.put("uam", "Fundada en 1974 y con más de 200 mil personas egresadas," +
                                "la UAM es una institución pública que" +
                               "ofrece en sus cinco unidades académicas.\n Visita: https://www.uam.mx/.");
        
        respuestas.put("uam azcapotzalco", "La Universidad Autónoma Metropolitana Unidad Azcapotzalco actualmente cuenta con 17\n" +
                                            "licenciaturas, divididas en 3 áreas de estudio.\n" +
                                            "Visita: https://www.azc.uam.mx/.");
        
        respuestas.put("servicio medico", "Proporcionamos atención médica a los miembros de la comunidad universitaria. Contamos con 5\n" +
                                            "médicos y 4 consultorios, solo debes presentar tu credencial de la UAM.\n" +
                                            "Visita: https://csu.azc.uam.mx/medicos/.");
        
        respuestas.put("servicios escolares", "La Coordinación de Sistemas Escolares, administra los procesos, entre los que se encuentran el\n" +
                                                "registro, seguimiento y control del ingreso, permanencia y egreso de los alumnos de Licenciatura y\n" +
                                                "Posgrado.\n" + "Visita: http://cse.azc.uam.mx/.");
        
        respuestas.put("covid", "Es una nueva aplicación para conocer el estado de salud de la comunidad UAM en el regreso\n" +
                                "presencial.\n" +
                                "Visita: https://coviuam.uam.mx/.");
        
        respuestas.put("coviuam", "Es una nueva aplicación para conocer el estado de salud de la comunidad UAM en el regreso\n" +
                                "presencial.\n" +
                                "Visita: https://coviuam.uam.mx/.");
        
        respuestas.put("consulta incompleta", "No tengo información acerca de tu consulta.");

        respuestas.put("no existe", "No entiendo tu consulta :(");

            // Dividir el texto de consulta en palabras clave
        String[] palabrasEnTexto = textoConsultaLimpio.split("\\s+");
        int cantidadPalabrasClave = palabrasEnTexto.length;

        boolean seEncontroCoincidencia = false;

        // Ordenar las claves por longitud en orden descendente
        String[] clavesOrdenadas = respuestas.keySet().toArray(new String[0]);
        Arrays.sort(clavesOrdenadas, (a, b) -> Integer.compare(b.length(), a.length()));

        // Buscar la clave más larga que coincida con el texto de consulta
        for (String clave : clavesOrdenadas) {
            String[] palabrasClave = clave.toLowerCase().split("\\s+");

            boolean todasPalabrasPresentes = true;

            for (String palabra : palabrasClave) {
                if (!textoConsultaLimpio.contains(palabra)) {
                    todasPalabrasPresentes = false;
                    break;
                }
            }

            if (todasPalabrasPresentes) {
                seEncontroCoincidencia = true;
                return respuestas.get(clave);
            }
        }

        // Si el texto tiene al menos 3 palabras clave pero no coincide con ninguna clave
        if (!seEncontroCoincidencia && cantidadPalabrasClave >= 3) {
            return respuestas.get("consulta incompleta");
        }

        // Si no tiene al menos 3 palabras clave o no coincide con ninguna clave
        return respuestas.get("no existe");
    }

    /**
     * Método que prepara la respuesta que se le va a dar al Cliente 
     * @return la respuesta que se le dara al Cliente.
     */
    public String prepararRespuesta() {
        
          // Obtener la hora actual
        LocalTime horaInicio = LocalTime.now();

        int numPalabrasVacias = contarPalabrasVacias();
        int numPalabrasClave = contarPalabrasClave();
        int numSignos = contarSignos();
        String respuesta = buscarRespuesta();

        // Calcular el tiempo transcurrido
        LocalTime horaConsulta = consulta.getHoraConsulta();
        long milisegundosTranscurridos = Duration.between(horaConsulta, horaInicio).toMillis();

        return "El numero de palabras vacias es: " + numPalabrasVacias +
                "\nEl numero de palabas clave es: " + numPalabrasClave +
                "\nEl numero de signos de puntuacion es: " + numSignos + 
                "\nRespuesta: \n" + respuesta +
                "\nTiempo en responder: " + milisegundosTranscurridos;
    }
    
}
