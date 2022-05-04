/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo_De_Ordenamiento;

import java.util.Scanner;

/**
 *
 * @author Eliseo Canaviri
 */
public class Burbuja_ {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nElementos, aux;
        System.out.println("Digite la cantidad de elemetos");
        nElementos = entrada.nextInt();
        int arreglo[] = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + " Digite un numero:");
            arreglo[i] = entrada.nextInt();
        }
        // metodo burbuja
        // tiene dos for anidados
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        //mostrar el arreglo ordenado
        System.out.print("arreglo ordenado es: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");

        }
        System.out.println(" ");

    }
}
