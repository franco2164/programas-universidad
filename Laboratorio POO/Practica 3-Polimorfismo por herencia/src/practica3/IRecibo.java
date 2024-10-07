/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.practicatres;

/**
 * Interface IRecibo.
 * 
 * La interface IRecibo incluye Constantes como BONO, 
 * VALE, IMSS, MASCULINO y FEMENINO. Proporciona un método para Imprimir
 * un recibo.
 * 
 * @author Ceron Cristian
 * @author Hernandez Monserrath
 * @author Nava Ricardo
 * 
 * 
 * @version 2024-08-06
 */
public interface IRecibo {
    /**
     * Valor consante BONO
     */
    int BONO=2000;
    /**
     * Valor consante VALE
     */
    int VALE=500;
    /**
     * Valor consante IMSS
     */
    double IMSS=0.11;
    /**
     * Valor consante MASCULINO
     */
    int MASCULINO=65;
    /**
     * Valor consante FEMENINO  
     */
    int FEMENINO=60;
    
    /**
     * Metodo para imprimir recibo.
     */
    void imprimirRecibo();
}
