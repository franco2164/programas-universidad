/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uam.azc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Clase que representa a un Cliente.
 * 
 * En la clase Cliente se manda una consulta al servidor, para esto
 * la consulta de tipo String es serializada para mandar el flujo de bytes
 * al servidor, para después recibir la respuesta del servidor y
 * deserializar el flujo de bytes e imprimir la respuesta del servidor.
 *
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 *
 * @version 2024-08-28
 */
public class Cliente {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * @param args the command line arguments
     * @see Consulta
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/net/Socket.html">Clase Socket en Java</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/io/ObjectOutputStream.html">Clase ObjectOutputStream en Java</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/io/ObjectInputStream.html">Clase ObjectInputStream en Java</a>
     */
    public static void main(String[] args) {
         // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        
        Socket cliente;
        ObjectOutputStream out;
        ObjectInputStream in;
        Consulta consulta = new Consulta(texto);
        
        try {
            cliente = new Socket("host", 12345);
            out= new ObjectOutputStream(cliente.getOutputStream());
            out.writeObject(consulta);
            
            // Recibir respuesta
            in = new ObjectInputStream( cliente.getInputStream());
            String respuesta = (String) in.readObject();
            System.out.println(respuesta);
            
            out.close();
            cliente.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        } catch (IOException ex2) {
            System.out.println("Excepcion: "+ex2.getMessage());
        } catch (ClassNotFoundException ex3) {
            System.out.println("Excepcion: "+ex3.getMessage());
        }
        
    }
    
}
