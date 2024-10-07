/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package azc.uam.mx.vista;

import azc.uam.mx.datos.ControladorBD;
import azc.uam.mx.modelo.Banco;
import azc.uam.mx.modelo.Cuenta;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorBD controlador = new ControladorBD();

        /////// PARTE I
        System.out.println("PARTE I");
        Banco banco = new Banco();
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        // lista para las cuentas que tienen un porcentaje de incremento de acuerdo a la cantidad de saldo
        ArrayList<Cuenta> cuentasGanadoras = new ArrayList<>();
        controlador.conectar();

        cuentas = controlador.consultarCuentas();

        // actualiza el atributo de cuentas del banco
        banco.setCuentas(cuentas);

        //Balance
        System.out.println("Tipo de información para el balance");

        // muestra el promedio de todas las cuentas por sucursal
        System.out.println("Saldo promedio de todas las cuentas por cada sucursal: AZC, CUA, XOC.");
        banco.calcularSaldoPromedioPorSucursal();

        //Muestra la sucursal con mayor numero de cuentas abiertas
        System.out.println("¿Cual es la sucursal con mayor numero de cuentas abiertas?");
        System.out.println(banco.sucursalConMasCuentas());

        //Muestra la sucursal con menor saldo total de sus cuentas
        System.out.println("¿Cual es la sucursal con menor saldo total de sus cuentas?");
        System.out.println(banco.sucursalConMenorSaldo());

        //Muestra nombre y apellido del cuentahabiente y la sucursal de apertura de la cuenta con mayor y menor saldo considerando cualquier sucursal
        System.out.println("¿Cual es el nombre y apellido del cuentahabiente y la sucursal de apertura de la cuenta con mayor y menor saldo considerando cualquier sucursal?");
        Cuenta cuentaMayorSaldo = banco.obtenerCuentaConMayorSaldo();
        System.out.println("Mayor saldo: " + cuentaMayorSaldo.getNombre() + " " + cuentaMayorSaldo.getApellido() + "(" + cuentaMayorSaldo.getSucursalApertura() + ")");

        //
        Cuenta cuentaMenorSaldo = banco.obtenerCuentaConMenorSaldo();
        System.out.println("Menor saldo: " + cuentaMenorSaldo.getNombre() + " " + cuentaMenorSaldo.getApellido() + "(" + cuentaMenorSaldo.getSucursalApertura() + ")");

        //Muestra las cuentas ganadoras
        cuentasGanadoras = banco.incrementarSaldo();

        // actualiza la DB con los nuevos saldos
        for (Cuenta cuentaGanadora : cuentasGanadoras) {
            controlador.actualizarSaldo(cuentaGanadora.getNumCuenta(), cuentaGanadora.getSaldo());
        }
        // muestra las cuentas ganadoras
        banco.mostrarGanadoresIncrementoSaldo(cuentasGanadoras);//////
        
        //Imprimir cuentas
        /*for(Cuenta cu:cuentas){
            System.out.println(cu);
        }*/
        
        /////PARTE II
        System.out.println("\nPARTE II");
        //Se agrega una nueva cuenta
        Cuenta nuevaCuenta = new Cuenta("1228", "Arturo", "Cuevas", 5000, "XOC");
        controlador.agregarCuenta(nuevaCuenta);
        
        cuentas = controlador.consultarCuentas();

        // actualiza el atributo de cuentas del banco
        banco.setCuentas(cuentas);
        
        //Balance
        System.out.println("Tipo de información para el balance");

        // muestra el promedio de todas las cuentas por sucursal
        System.out.println("Saldo promedio de todas las cuentas por cada sucursal: AZC, CUA, XOC.");
        banco.calcularSaldoPromedioPorSucursal();

        //Muestra la sucursal con mayor numero de cuentas abiertas
        System.out.println("¿Cual es la sucursal con mayor numero de cuentas abiertas?");
        System.out.println(banco.sucursalConMasCuentas());

        //Muestra la sucursal con menor saldo total de sus cuentas
        System.out.println("¿Cual es la sucursal con menor saldo total de sus cuentas?");
        System.out.println(banco.sucursalConMenorSaldo());

        //Muestra nombre y apellido del cuentahabiente y la sucursal de apertura de la cuenta con mayor y menor saldo considerando cualquier sucursal
        System.out.println("¿Cual es el nombre y apellido del cuentahabiente y la sucursal de apertura de la cuenta con mayor y menor saldo considerando cualquier sucursal?");
        Cuenta cuentaMayorSaldo2 = banco.obtenerCuentaConMayorSaldo();
        System.out.println("Mayor saldo: " + cuentaMayorSaldo2.getNombre() + " " + cuentaMayorSaldo2.getApellido() + "(" + cuentaMayorSaldo2.getSucursalApertura() + ")");

        //
        Cuenta cuentaMenorSaldo2 = banco.obtenerCuentaConMenorSaldo();
        System.out.println("Menor saldo: " + cuentaMenorSaldo2.getNombre() + " " + cuentaMenorSaldo2.getApellido() + "(" + cuentaMenorSaldo2.getSucursalApertura() + ")");
        
        //Imprimir cuentas
        /*for(Cuenta cu:cuentas){
            System.out.println(cu);
        }*/
        
        /////PARTE III
        System.out.println("\nPARTE III");
        //Se elimina una cuenta
        controlador.eliminarCuenta("1220");
        //Se actualiza una cuenta
        controlador.actualizarSucursal("1228", "AZC");
        
        cuentas = controlador.consultarCuentas();

        // actualiza el atributo de cuentas del banco
        banco.setCuentas(cuentas);
        //Balance
        System.out.println("Tipo de información para el balance");

        // muestra el promedio de todas las cuentas por sucursal
        System.out.println("Saldo promedio de todas las cuentas por cada sucursal: AZC, CUA, XOC.");
        banco.calcularSaldoPromedioPorSucursal();

        //Muestra la sucursal con mayor numero de cuentas abiertas
        System.out.println("¿Cual es la sucursal con mayor numero de cuentas abiertas?");
        System.out.println(banco.sucursalConMasCuentas());

        //Muestra la sucursal con menor saldo total de sus cuentas
        System.out.println("¿Cual es la sucursal con menor saldo total de sus cuentas?");
        System.out.println(banco.sucursalConMenorSaldo());

        //Muestra nombre y apellido del cuentahabiente y la sucursal de apertura de la cuenta con mayor y menor saldo considerando cualquier sucursal
        System.out.println("¿Cual es el nombre y apellido del cuentahabiente y la sucursal de apertura de la cuenta con mayor y menor saldo considerando cualquier sucursal?");
        Cuenta cuentaMayorSaldo3 = banco.obtenerCuentaConMayorSaldo();
        System.out.println("Mayor saldo: " + cuentaMayorSaldo3.getNombre() + " " + cuentaMayorSaldo3.getApellido() + "(" + cuentaMayorSaldo3.getSucursalApertura() + ")");

        //
        Cuenta cuentaMenorSaldo3 = banco.obtenerCuentaConMenorSaldo();
        System.out.println("Menor saldo: " + cuentaMenorSaldo3.getNombre() + " " + cuentaMenorSaldo3.getApellido() + "(" + cuentaMenorSaldo3.getSucursalApertura() + ")");
        
        //Imprimir cuentas
        /*for(Cuenta cu:cuentas){
            System.out.println(cu);
        }*/
        
        controlador.desconectar();
    }

}
