/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author PCadmin
 */
public class Metodos {
    static Pasajeros[] pasajeros = new Pasajeros[15];
    static int cantidadPasajeros = 0;
    static String [][] ocupado = new String [5][4];
    static int fila =  0;
    static int columna =  0;
    

    public void verMapa(Pasajeros[] pasajeros){ //Metodo para ver el mapa de la matriz del vuelo y sus asientos
        
        
        String mensaje = " VUELO CR-909   "+"Asiento A    "+"Asiento B    "+"Asiento C    "+"Asiento D    \n";
           
             for (int i = 0; i < 5; i++) {
                 
                 mensaje = mensaje + "Fila" +(i + 1)+" ";
                    for (int j = 0; j < 4; j++) {
                          mensaje = mensaje + ocupado[i][j] + " ";
                    }
                     mensaje += "\n------------------------------------------------------\n";
             }
             
//            
//
//        for (int i = 0; i < ocupado[0].length; i++) {
//            vuelo = vuelo + (i + 1);
//        }
//        vuelo = vuelo + "\n";
//
//        for (int j = 0; j < ocupado[4].length; j++) {
//            vuelo = vuelo + (char) ('A' + j) + " | ";
//
//            for (int k = 0; k < ocupado[5].length; k++) {
//                if (ocupado[j][k]) {
//                    vuelo = vuelo + " Libre ";
//                } else {
//                    vuelo = vuelo + " Ocupado ";
//                }
//
//            }
//
//            vuelo = vuelo + "\n";
//        }
//        }
//        return vuelo;
     
    JOptionPane.showMessageDialog(null,mensaje);
    
    }
//    public boolean reservar(int pasaporte, int fila, int columna) { 
//
//        if (ocupado[fila][columna]) {
//            return false;
//        } else {
//        }
//        ocupado[fila][columna] = true;
//        this.pasaporte[fila][columna] = pasaporte;
//
//        return true;
//
//    }
    public void reservarAsientos(Pasajeros[] pasajeros) {

        for (int i = 0; i < pasajeros.length; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente que va reservar " + (i + 1) + ":");
            int pasaporte = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pasaporte de " + nombre + ":"));
            String nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad de" + nombre + ":");
            pasajeros[cantidadPasajeros++] = new Pasajeros(nombre, pasaporte, nacionalidad);

        JOptionPane.showMessageDialog(null, "Cliente agregado");
            
            Clases[] opciones = Clases.values();
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione la clase del asiento para " + nombre + ":",
                    "Clases Disponibles",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

        String tipo = opciones[seleccion].toString();

        String seat = JOptionPane.showInputDialog("Digite el asiento deseado por el pasajero: ej:1A ").toUpperCase();
       
        int fila = seat.charAt(0) - 'A';
        int col = Integer.parseInt(seat.substring(1)) - 1;

//        boolean reservado = Pasajeros[].reservar(pasaporte, fila, col);  // usa el public boolean de arriba pero no supe como acomodarlo y lo quite

         JOptionPane.showMessageDialog(null,"Asiento reservado."+ "Ocupado.");
//        }

        
    } 
    }
    public void reservarconDescuento(Pasajeros[] pasajeros) {
        JOptionPane.showMessageDialog(null, "Reservas para Clientes Frecuentes");
        
    }
    public void consultarPasajero(Pasajeros[] pasajeros) {
    String resultado = "";

    for (int i = 0; i < pasajeros.length; i++) {
        
        if (pasajeros[i] != null) {
            
            
//            resultado += "*************** Pasajero #" + (i + 1) + " ***************\n";
//            resultado += pasajeros[i].toString() + "\n";
        }
         JOptionPane.showMessageDialog(null, "No supe como buscar a los pasajeros ya que la matriz estaa mal hecha");
    }
        

    
    }
     public void resumenVuelo(Pasajeros[] pasajeros) {
        if (pasajeros == null || pasajeros[0] == null) {
            JOptionPane.showMessageDialog(null, "No dio tiempo para analizar el vuelo.");
            return;
        }

        String resultado = "";
        
    
            
        
        JOptionPane.showMessageDialog(null, resultado);
    } 

}

