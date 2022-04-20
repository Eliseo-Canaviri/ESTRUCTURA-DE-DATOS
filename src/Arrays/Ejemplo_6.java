/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Eliseo Canaviri
 */
public class Ejemplo_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam;
        System.out.println("Ingrese el tamaño del array");
        tam = entrada.nextInt();
        int A[] = new int[tam];

        //llenado de datos a un array por teclado
        ///System.out.println("ingrese datos");
        for (int i = 0; i < A.length; i++) {
            // System.out.print(i + "=");
            ///
            A[i] = (int) (Math.random() * 20);// para numeros aleatorios
            //  A[i] = entrada.nextInt();///

        }
        /// mostrar datos por pantalla
        for (int i = 0; i < A.length; i++) {
            System.out.print("\t" + i + "=" + "[" + A[i] + "]");
        }
    }
}
