/*

 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Eliseo Canaviri
 */
public class Ejemplo_4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese en tañamo de array"); // ingresamos el tamaño de nuestro arreglo
        int tam;
        tam = entrada.nextInt();//
        int A[] = new int[tam];

        System.out.println("ingrese los datos");
        for (int i = 0; i < A.length; i++) {
            System.out.print(":" + i + ":");
            A[i] = entrada.nextInt();

        }
        for (int i = 0; i < A.length; i++) {
            System.out.print("\t" + i + ":[" + A[i] + "]");
        }
        System.out.println("");

    }
}
