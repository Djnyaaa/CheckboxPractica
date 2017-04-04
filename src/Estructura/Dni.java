/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import javax.swing.JOptionPane;

/**
 *
 * @author Djnyaaa
 */
public class Dni {

    private final MiLibreria mi = new MiLibreria();
    public int numDNI;
    public String nif, letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    private char letra, letraNIF;

    public Dni() {
    }

    public Dni(String nif) {
        this.nif = nif;

    }

    public String getNif() {
        return nif;
    }

    public void establecerNIF(String nif) {
        this.nif = nif;

    }

    /*
    * Método que calcula la letra del NIF dado por el usuario.
     */
    public char calcularLetraNIF(int dni) {
        if (dni > 10000000 && dni < 99999999) {
            int resto;
            resto = dni % 23;
            letra = letras.charAt(resto);
            return letra;

        } else {
            mi.imprimirMensaje("El valor dado no es correcto.\n");
        }
        return 0;
    }

    /*
    * Método que valida el NIF dado por el usuario.
     */
    public boolean validarNIF(String dni) {
        try {
            int nifValido;

            char letraN;
            nifValido = Integer.parseInt(dni.substring(0, 8));
            letraN = calcularLetraNIF(nifValido);
            if (dni.charAt(dni.length() - 1) == letraN) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    /*
    * Método que extrae la letra del NIF.
     */
    public char extraerLetraNIF(String nif) {
        letraNIF = nif.charAt(8);
        return letraNIF;
    }

    /*
    * Método que extrae los numeros del NIF.
     */
    public int extraerNumeroNIF(String nif) {
        String soloNum;
        int numeroNIF;
        soloNum = nif.replaceAll("[^0-9]", "");
        numeroNIF = Integer.parseInt(soloNum);
        return numeroNIF;
    }

    @Override
    public String toString() {
        return "DNI: "+ nif;
    }

}
