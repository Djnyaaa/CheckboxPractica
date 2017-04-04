/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre,apellido,sexo, estado;
    private Dni nif;
    
    public Persona(String nombre, String apellido, Dni dni, String sexo, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = dni;
        this.sexo = sexo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dni getNif() {
        return nif;
    }

    public void setNif(Dni nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", apellido: " + apellido + ", " + nif +", sexo: " +sexo +", estado: " +estado;
    }
    
}
