package Metodo_De_Ordenamiento;

import java.util.*;

/**
 * 
 * @author Eliseo Canaviri
 */
class Shell {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ");
        System.out.print(" Ingrese el tamaño elemento: ");
        int nElemento=entrada.nextInt();
        int[] ar = new int[nElemento];
        System.out.println();
        System.out.println(" Ingrese los elementos a array");

        for (int i = 0; i < ar.length; i++) {
            System.out.print("En el indice "+(i +1)+ " : ");// estamos imprimiendo las iteraciones
            // ar[i] = (int) (Math.random() * 10); //ingresando datos aleatorio
            ar[i] = entrada.nextInt();
        }
        shell(ar);
        System.out.println("Numeros ordenados son:");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" ");
            System.out.print("[" + ar[i] + "]");
          
        }
          System.out.println(" ");
    }
 // Metodo de ordenacion Shell
    public static void shell(int A[]) {

        int salto, aux;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) { // Mientras se intercambie algún elemento
                cambios = false;
                for (int i = salto; i < A.length; i++) // se da una pasada
                {
                    if (A[i - salto] > A[i]) { // y si están desordenados
                        aux = A[i]; // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true; // y se marca como cambio.
                    }
                }
            }
        }
    }
}
