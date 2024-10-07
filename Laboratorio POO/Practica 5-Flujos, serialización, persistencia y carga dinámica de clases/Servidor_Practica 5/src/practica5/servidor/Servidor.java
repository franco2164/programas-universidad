package mx.uam.azc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Clase que representa a un Servidor.
 * 
 * En la clase Servidor se recibe una consulta del cliente, para esto
 * la consulta es deserializada para construir el Objeto de nuevo,
 * para después preparar la respuesta por un mini bot y serializar la respuesta,
 * para mandar la respuesta al cliente.
 *
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 *
 * @version 2024-08-28
 */
public class Servidor {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * @param args the command line arguments
     * @see Consulta
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/net/Socket.html">Clase Socket en Java</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/net/ServerSocket.html">Clase ServerSocket en Java</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/io/ObjectOutputStream.html">Clase ObjectOutputStream en Java</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/io/ObjectInputStream.html">Clase ObjectInputStream en Java</a>
     */
    public static void main(String[] args) {

        Consulta consulta;
        Bot miniBot;
        ServerSocket servidor;
        Socket s1;
        ObjectInputStream in;
        ObjectOutputStream out;

        try {
            servidor = new ServerSocket(12345);
            while(true){
                System.out.println("Servidor en espera...");
                s1 = servidor.accept();
                System.out.println("Conexion establecida");

                in = new ObjectInputStream(s1.getInputStream());
                consulta= (Consulta) in.readObject();

                System.out.println("Objeto deserializado...");
                miniBot = new Bot(consulta);

                //respuesta
                System.out.println("Enviando respuesta...");
                //
                out = new ObjectOutputStream(s1.getOutputStream());
                out.writeObject(miniBot.prepararRespuesta());
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Excepcion " + ex.getMessage());
        } catch (IOException ex2) {
            System.out.println("Excepcion " + ex2.getMessage());
        } catch (ClassNotFoundException ex3) {
            System.out.println("Excepcion " + ex3.getMessage());
        }

    }

}
