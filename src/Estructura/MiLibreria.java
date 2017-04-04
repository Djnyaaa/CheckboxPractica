package Estructura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Djnyaaa
 */
public class MiLibreria {
    public MiLibreria() {
    
    }
    /**
     * Método que se encarga de leer un valor numerico y devolverlo al que lo ha llamado.
     * @return devolvera un valor de tipo Int.
     */
    public int leerEntero(){
        Scanner sc = new Scanner (System.in);
        int valor;
        valor = sc.nextInt();
        return valor;
    }
    /**
     * Método que se encarga de leer un valor String y devolverlo al que lo ha llamado.
     * @return devolverá un valor de tipo String.
     */
    public String leerString(){
        Scanner sc = new Scanner (System.in);
        String valor;
        valor = sc.next();
        return valor;
    }
    /**
     * Método que se encarga de imprimir por pantalla el mensaje que ha sido indicado.
     * @param sms será la variable a usar en este método.
     */
    public void imprimirMensaje(String sms) {
        System.out.println(sms);
        
    }
   /**
    * Método que se encarga de imprimir un mensaje sin salto de linea.
    * @param sms será la variable a usar en este método.
    */
    public void imprimirMensajeSinSalto(String sms) {
        System.out.print(sms);
    } 
    /**
     * Método que se encarga de imprimir un número por pantalla.
     * @param sms será la variable a usar en este método.
     */
    public void imprimirMensajeNumero(int sms) {
        System.out.print(sms);
    } 
    public void imprimirMensaje(Object sms) {
        System.out.println(sms);
        
    }

    double leerDouble() {
        Scanner sc = new Scanner (System.in);
        double valor;
        valor = sc.nextDouble();
        return valor;
    }
}
