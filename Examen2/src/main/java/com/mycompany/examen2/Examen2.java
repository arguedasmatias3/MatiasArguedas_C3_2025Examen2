/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author PCadmin
 */
public class Examen2 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Pasajeros[] pasajeros = new Pasajeros[4];
      int opcion = 0; // Variable para controlar el menú

        // Menú como un solo String
        String menu = """
                 MENÚ 
                1) Ver Mapa del Avion 
                2) Reservar Asiento
                3) Reservar con Descuento (clientes frecuentes)
                4) Consultar Pasajero por Asiento
                5) Ver Resumen del Avion 
                6) Salir
                """;

        
        while (opcion != 6) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1 -> { metodos.verMapa(pasajeros);  //Llama al metodo para ver el mapa del avion y los asientos
                }
                case 2 -> { metodos.reservarAsientos(pasajeros);  //Llama al metodo para reservar asientos dando la informacion del cliente (pasajero)
                }
                case 3 -> {metodos.reservarconDescuento(pasajeros); //Llama al metodo para reservar con Descuento a los clientes frecuentes
                }
                case 4 -> {metodos.consultarPasajero(pasajeros); //Llama al metodo para consultar Pasajeros segun el asiento
                    
                }
                case 5 -> {metodos.resumenVuelo(pasajeros); //Llama al metodo que revisa el resumen del vuelo y la recaudacion
                    
                }
                case 6 -> {
                    JOptionPane.showMessageDialog(null, "Salida del sistema");
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                }
            }
        }
    }     

    
}
