/*
 
 */
package Metodo_De_Ordenamiento;

import java.util.Scanner;

/**
 *
 * @author Eliseo Canaviri
 */
public class Insercion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Digite numero de elementos");
        int nElementos = entrada.nextInt();

        int arreglo[] = new int[nElementos];
        int pos, aux;

        for (int i = 0; i < nElementos; i++) {
            System.out.println("en indice" + (i + 1) + "= Digite un numero");
            arreglo[i] = entrada.nextInt();
        }
        //ordenamiento por insecion
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = arreglo[i];

            while ((pos > 0) && (arreglo[pos - 1] > aux)) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        System.out.println("orden ascendente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(" - " + arreglo[i]);
        }
        System.out.println("");
    }
}
