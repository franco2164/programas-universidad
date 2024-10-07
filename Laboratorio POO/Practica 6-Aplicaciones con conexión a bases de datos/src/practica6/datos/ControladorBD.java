/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azc.uam.mx.datos;

import azc.uam.mx.modelo.Cuenta;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase ControladorBD maneja la conexión a la base de datos, nos permite conectarnos,desconectarnos, consultar cuentas, agregar cuentas
 * eliminar cuentas, actualizar saldos y actualizar la sucursal de la cuenta. 
 * 
 * @author Nava Ricardo
 * @author Ceron Cristian
 * @author Hernández Monserrath
 * 
 * @version 2024/09/18
 */
public class ControladorBD {
    private static final String USUARIO="root";
    private static final String PASWD="root";
    private static final String URL="jdbc:mysql://localhost:3306/";
    private static final String BD="banco";
    private Connection conexion;
    
    /**
     * Método para conectar a la base de datos
     * @return true si la conexión fue exitosa, false en caso contrario. 
     */
    
    public boolean conectar(){
        boolean estado=false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conexion = DriverManager.getConnection(URL+BD, USUARIO, PASWD);
             
             if(conexion!=null){
                 estado=true;
                 System.out.println("conectado");
             }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
        } catch (SQLException ex1) {
                System.out.println("Excepcion: " + ex1.getMessage());
        }
        
        return estado;
    }
    /**
     * Método para desconectar la base de datos.
     * @return true si la desconección fue éxitosa, false en caso contrario. 
     */
    
    public boolean desconectar(){
        boolean estado=false;
        try {
            conexion.close();
            estado=true;
            System.out.println("desconectado");
        } catch (SQLException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
        }
        return estado;
        
    }
    /**
     * Método para consultar las cuentas en la base de datos.
     * @return una lista de objetos Cuenta con la información de cada cuenta.
     */
    
    public ArrayList<Cuenta> consultarCuentas(){
        ArrayList<Cuenta> cuentas=new ArrayList<>();
        Statement st;
        ResultSet rs;
        String query = "SELECT * FROM cuenta";
        
        try {
            st=conexion.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                Cuenta ct = new Cuenta();
                ct.setNumCuenta(rs.getString(1));
                ct.setNombre(rs.getString(2));
                ct.setApellido(rs.getString(3));
                ct.setSaldo(rs.getDouble(4));
                ct.setSucursalApertura(rs.getString(5));

                cuentas.add(ct);
            }
        } catch (SQLException ex) {
            System.out.println("Exception " + ex.getMessage());
        }
        return cuentas;
    }
    /**
     * Método para agregar una nueva cuenta a la base de datos. 
     * @param cuenta el objeto cuenta que se desea agregar. 
     * @return true si la cuenta fue agregada exitosamente, falso en caso contrario.
     */
    
    public boolean agregarCuenta(Cuenta cuenta){
        boolean estado = false;
        PreparedStatement st;
        String query = "INSERT INTO cuenta VALUES(?,?,?,?,?)";
        try {
            st= conexion.prepareStatement(query);
            st.setString(1, cuenta.getNumCuenta());
            st.setString(2, cuenta.getNombre());
            st.setString(3, cuenta.getApellido());
            st.setDouble(4, cuenta.getSaldo());
            st.setString(5, cuenta.getSucursalApertura());
            st.execute();
            estado=true;
        } catch (SQLException ex) {
            System.out.println("Exception "+ex.getMessage());
        }
        return estado;
    }
    /**
     * Método para eliminar una cuenta de la base de datos. 
     * @param numCuenta el npumero de la cuenta que se desea eliminar. 
     * @return true si la cuenta fue eliminada exitosamente, false en caso contrario. 
     */
    
    public boolean eliminarCuenta(String numCuenta){
        boolean estado = false;
        Statement st;
        String query = "DELETE FROM cuenta WHERE numCuenta="+"'"+numCuenta+"'";
        try {
            st = conexion.createStatement();
            st.executeUpdate(query);
  
            estado=true;
        } catch (SQLException ex) {
            System.out.println("Exception "+ex.getMessage());
        }
        return estado;
    }
    /**
     * Método para actualizar el saldo de una cuenta en la base de datos. 
     * @param numCuenta el número de la cuenta que se desea actualizar. 
     * @param nuevoSaldo el nuevo saldo que se desea establecer. 
     * @return true si el saldo fue actualizado correctamente, false en caso contrario.
     */
    
    public boolean actualizarSaldo(String numCuenta, double nuevoSaldo){
        boolean estado = false;
        PreparedStatement st;
        String query = "UPDATE cuenta SET saldo=? WHERE numCuenta=?";
        
        try {
            st= conexion.prepareStatement(query);
            st.setDouble(1, nuevoSaldo);
            st.setString(2, numCuenta);
            st.executeUpdate();
            estado=true;
        } catch (SQLException ex) {
            System.out.println("Exception "+ex.getMessage());
        }
        return estado;
    }
    /**
     * Método para actualizar la sucursal de apertura de una cuenta en la base de datos. 
     * @param numCuenta el número de cuenta de la cuenta que se desea actualizar. 
     * @param sucursalActializada la nueva sucursal de apertura que se desea establecer. 
     * @return true si la sucursal fue actualizada exitosamente, false en caso contrario. 
     */
    
     public boolean actualizarSucursal(String numCuenta,String sucursalActializada){
        boolean estado = false;
        PreparedStatement st;
        String query = "UPDATE cuenta SET sucursalApertura=? WHERE numCuenta=?";
        try {
            st= conexion.prepareStatement(query);
            st.setString(1, sucursalActializada);
            st.setString(2, numCuenta);
            st.executeUpdate();
            estado=true;
        } catch (SQLException ex) {
            System.out.println("Exception "+ex.getMessage());
        }
        return estado;
    }
    
    
}
