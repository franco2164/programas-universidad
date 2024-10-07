/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package azc.uam.mx.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.math.BigDecimal;

/**
 * Clase Banco que maneja una lista de cuentas y realiza operaciones sobre ellas para obtener el balance general. 
 *
 * @author Nava Ricardo 
 * @author Ceron Cristian 
 * @author Hernandez Monserrath 
 * 
 * @version 2024/09/18
 */
public class Banco {

    private ArrayList<Cuenta> cuentas;
    /**
     * Constructor por omisión. 
     */

    public Banco() {
    }
    /**
     * Constructor con parametros que incializa la lista de cuentas. 
     * @param cuentas la lista de cuentas a inicializar. 
     */

    public Banco(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    /**
     * Método de acceso que devuelve la lista de cuentas. 
     * @return la lista de cuentas.
     */

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    /**
     * Método de acceso que modifica la lista de cuentas. 
     * @param cuentas valor de la nueva lista de cuentas.
     */

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    /**
     * Calcula y muestra el saldo promedio por sucursal. 
     */

    public void calcularSaldoPromedioPorSucursal() {
        double saldoTotalAzc = 0.0;
        double saldoTotalCua = 0.0;
        double saldoTotalXoc = 0.0;
        double saldoPromedioAzc = 0.0;
        double saldoPromedioCua = 0.0;
        double saldoPromedioXoc = 0.0;
        int numCuentas = 0;
        int contAzc = 0;
        int contCua = 0;
        int contXoc = 0;

        Iterator<Cuenta> iterator = cuentas.iterator();
        Cuenta cuenta;

        while (iterator.hasNext()) {
            cuenta = iterator.next();
            if (cuenta.getSucursalApertura().equalsIgnoreCase("AZC")) {
                saldoTotalAzc += cuenta.getSaldo();
                contAzc++;
            } else if (cuenta.getSucursalApertura().equalsIgnoreCase("CUA")) {
                saldoTotalCua += cuenta.getSaldo();
                contCua++;
            } else {
                saldoTotalXoc += cuenta.getSaldo();
                contXoc++;
            }
        }

        saldoPromedioAzc = Math.floor((saldoTotalAzc / contAzc) * 10) / 10;
        saldoPromedioCua = Math.floor((saldoTotalCua / contCua) * 10) / 10;
        saldoPromedioXoc = Math.floor((saldoTotalXoc / contXoc) * 10) / 10;

        System.out.println("AZC: " + saldoPromedioAzc);
        System.out.println("CUA: " + saldoPromedioCua);
        System.out.println("XOC: " + saldoPromedioXoc);

    }
    /**
     * Método que determina y devuelve la sucursal con más cuentas.
     * @return el nombre de la sucursal con más cuentas. 
     */

    public String sucursalConMasCuentas() {
        int cuentasAZC = 0;
        int cuentasCUA = 0;
        int cuentasXOC = 0;

        Iterator<Cuenta> iterator = cuentas.iterator();
        Cuenta cuenta;

        while (iterator.hasNext()) {
            cuenta = iterator.next();
            if (cuenta.getSucursalApertura().equalsIgnoreCase("AZC")) {
                cuentasAZC++;
            } else if (cuenta.getSucursalApertura().equalsIgnoreCase("CUA")) {
                cuentasCUA++;
            } else {
                cuentasXOC++;
            }
        }
        
        if(cuentasCUA==cuentasXOC){
            return "CUA y XOC";
        }
        else if (cuentasAZC > cuentasCUA && cuentasAZC > cuentasXOC) {
            return "AZC";
        } else if (cuentasCUA > cuentasAZC && cuentasCUA > cuentasXOC) {
            return "CUA";
        } else {
            return "XOC";
        }
    }
    /**
     * Método para determinar la sucursal con el menor saldo total.
     * @return el nombre de la sucursal con el menor saldo total.
     */

    public String sucursalConMenorSaldo() {
        double saldoAZC = 0;
        double saldoCUA = 0;
        double saldoXOC = 0;

        Iterator<Cuenta> iterator = cuentas.iterator();
        Cuenta cuenta;

        while (iterator.hasNext()) {
            cuenta = iterator.next();
            if (cuenta.getSucursalApertura().equalsIgnoreCase("AZC")) {
                saldoAZC += cuenta.getSaldo();
            } else if (cuenta.getSucursalApertura().equalsIgnoreCase("CUA")) {
                saldoCUA += cuenta.getSaldo();
            } else {
                saldoXOC += cuenta.getSaldo();
            }
        }
        
        
        if (saldoAZC < saldoCUA && saldoAZC < saldoXOC) {
            return "AZC";
        } else if (saldoCUA < saldoAZC && saldoCUA < saldoXOC) {
            return "CUA";
        } else {
            return "XOC";
        }
    }
    /**
     * Método para obtener la cuenta con el mayor saldo. 
     * @return el objeto Cuenta con el mayor saldo. 
     */

    public Cuenta obtenerCuentaConMayorSaldo() {
        Cuenta cuentaMayorSaldo = null;
        double mayorSaldo = Double.MIN_VALUE;

        Iterator<Cuenta> iterator = cuentas.iterator();
        Cuenta cuenta;

        while (iterator.hasNext()) {
            cuenta = iterator.next();
            double saldo = cuenta.getSaldo();
            if (saldo > mayorSaldo) {
                mayorSaldo = saldo;
                String numCuenta = cuenta.getNumCuenta();
                String nombre = cuenta.getNombre();
                String apellido = cuenta.getApellido();
                String sucursalApertura = cuenta.getSucursalApertura();
                cuentaMayorSaldo = new Cuenta(numCuenta, nombre, apellido, saldo, sucursalApertura);
            }

        }

        return cuentaMayorSaldo;
    }
    /**
     * Método para obtener la cuenta con el menor saldo.
     * @return el objeto Cuenta con el menor saldo. 
     */

    public Cuenta obtenerCuentaConMenorSaldo() {
        Cuenta cuentaMenorSaldo = null;
        double menorSaldo = Double.MAX_VALUE;

        Iterator<Cuenta> iterator = cuentas.iterator();
        Cuenta cuenta;

        while (iterator.hasNext()) {
            cuenta = iterator.next();
            double saldo = cuenta.getSaldo();
            if (saldo < menorSaldo) {
                menorSaldo = saldo;
                String numCuenta = cuenta.getNumCuenta();
                String nombre = cuenta.getNombre();
                String apellido = cuenta.getApellido();
                String sucursalApertura = cuenta.getSucursalApertura();
                cuentaMenorSaldo = new Cuenta(numCuenta, nombre, apellido, saldo, sucursalApertura);

            }

        }

        return cuentaMenorSaldo;
    }
    /**
     * Método para incrementar el saldo de las cuentas según ciertas condiciones. 
     * @return una lista de cuentas que tuvieron un incremento en su saldo.
     */

    public ArrayList<Cuenta> incrementarSaldo() {
        ArrayList<Cuenta> cuentasGanadoras = new ArrayList<>();
        double saldo = 0.0;
        String sucursal;
        for (Cuenta cuenta : cuentas) {
            saldo = cuenta.getSaldo();
            sucursal = cuenta.getSucursalApertura();

            if (saldo >= 1500 && sucursal.equalsIgnoreCase("AZC")) {
                saldo = saldo + (saldo * 0.2);
                cuenta.setSaldo(saldo);
                cuentasGanadoras.add(cuenta);
            } else if (saldo >= 1000 && sucursal.equalsIgnoreCase("CUA")) {
                saldo = saldo + (saldo * 0.1);
                cuenta.setSaldo(saldo);
                cuentasGanadoras.add(cuenta);
            } else if (saldo >= 2000 && sucursal.equalsIgnoreCase("XOC")) {
                saldo = saldo + (saldo * 0.05);
                cuenta.setSaldo(saldo);
                cuentasGanadoras.add(cuenta);
            }
        }

        return cuentasGanadoras;
    }
    /**
     * Método para mostrar las cuentas que tuvieron un incremento en su saldo. 
     * @param cuentasGanadoras la lista de cuentas que tuvieron un incremento en su saldo. 
     */

    public void mostrarGanadoresIncrementoSaldo(ArrayList<Cuenta> cuentasGanadoras) {
        String sucursalActual = "";

        for (Cuenta cuenta : cuentasGanadoras) {
            String sucursal = cuenta.getSucursalApertura();

            // Si la sucursal ha cambiado, imprimir el encabezado
            if (!sucursal.equals(sucursalActual)) {
                System.out.println("\nGanadores " + sucursal + "\t Saldo actualizado");
                sucursalActual = sucursal;
            }

            // Imprimir los datos de la cuenta
            StringBuilder sb = new StringBuilder();
            sb.append(cuenta.getNombre())
                    .append(" ")
                    .append(cuenta.getApellido())
                    .append("\t\t")
                    .append(cuenta.getSaldo());
            System.out.println(sb.toString());
        }
    }

}
