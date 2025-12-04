/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2;

/**
 *
 * @author PCadmin
 */
public class Pasajeros {
     private String nombre;
    private int pasaporte;
    private String nacionalidad;
    
    
    public Pasajeros(String nombre, int pasaporte, String nacionalidad){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
        
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
     public String toString(){
    String pasajero ="Nombre: " + nombre + "\n" +
                   "Numero de pasaporte: " + pasaporte + "\n" +
                   "Nacionalidad: " + nacionalidad + "\n";
         return pasajero;
                   
     }
}
