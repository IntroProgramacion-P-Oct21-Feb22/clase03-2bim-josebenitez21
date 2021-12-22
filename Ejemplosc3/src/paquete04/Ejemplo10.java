/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete01.*;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
     Scanner entrada = new Scanner(System.in); 
       int[][] arreglo1 = new int[3][3]; //{{-10, 41, 40}, {1, -2, -3}, {6, 8, -9}};
        /*
        -10      41      40
        1       -2       -3
        6       8       -9
        */
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int valor;
        int valorIngresado;
        
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor = arreglo1[fila][col];
                System.out.printf("Ingrese valor para la posición [%d][%d]\t:",
                        fila, col);
                valorIngresado = entrada.nextInt();
                arreglo1[fila][col] = valorIngresado;
                if(valor>0){
                    sumaPositivos = sumaPositivos + valor;
                }else{
                    if(valor<0){
                        sumaNegativos = sumaNegativos + valor;
                    }
                }
                
            }
        }
        System.out.printf("Suma de valores de positivos: %d\n", sumaPositivos);
        System.out.printf("Suma de valores de negativos: %d\n", sumaNegativos);
    }
    
}
