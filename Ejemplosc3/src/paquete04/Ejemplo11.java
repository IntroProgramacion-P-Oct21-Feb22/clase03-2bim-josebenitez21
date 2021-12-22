/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete01.*;

/**
 *
 * @author reroes
 */
public class Ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        String[][] arreglo1 = {{"José", "Luis"}, {"Ana", "Mónica"}};
        /*
        1      2
        10     12
         */
        String[][] arreglo2 = {{"Álvarez", "Gonza"}, {"Flores", "Benítez"}};
        /*
        3      4
        20     40
         */
        String[][] sumaArreglo = new String[2][2]; //
        /*
        "José Alvarez " Luis Gonza
        Ana Florez      monica Benitez
         */

        String valor1;
        String valor2;

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor1 = arreglo1[fila][col];
                valor2 = arreglo2[fila][col];
                // sumaArreglo[fila][col] = valor1 +" "+ valor2;
                sumaArreglo[fila][col] = String.format("%s %s ", valor1, valor2);
            }
        }

        for (int fila = 0; fila < sumaArreglo.length; fila++) {
            for (int col = 0; col < sumaArreglo[fila].length; col++) {
                System.out.printf("%s\t", sumaArreglo[fila][col]);
            }
            System.out.println("");
        }
    }

}
