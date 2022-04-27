
/*
Crea un array numérico con 5 elementos. Los números
de cada elemento deben ser valores pedidos por
teclado al usuario. Muestra por consola el índice
y el valor al que corresponde. Debes utiliza bucles
tanto para pedir los valores de los elementos del
array como para mostrar su contenido por pantalla.
Ejemplo: Introducimos los valores 2, 4, 5, 8 y 10 .
Lo que se tiene que mostrar por consola sería:

En el indice 0 esta el valor 2
En el indice 1 esta el valor 4
En el indice 2 esta el valor 5
En el indice 3 esta el valor 8
En el indice 4 esta el valor 10
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Eliseo Canaviri
 */
public class Ejemplo_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("en el indice" + i + "=");
            A[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("En el indice " + i + " esta el valor" + A[i]);
        }

    }
}
