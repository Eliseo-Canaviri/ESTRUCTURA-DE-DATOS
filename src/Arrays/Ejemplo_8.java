/*
Programa que lea por teclado 10 números enteros
y los guarde en un array.
A continuación calcula y muestra la media de los
valores positivos y la  de los valores negativos.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Eliseo Canaviri
 */
public class Ejemplo_8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pos = 0, neg = 0;
        int numeros[] = new int[5];
        double sumaPos = 0, sumaNeg = 0;

        // lectura de datos y llenar el array
        System.out.println("lectura de los elementos del aray");
        for (int i = 0; i < 5; i++) {
            System.out.println(" numeros[" + i + "]=");
            numeros[i] = entrada.nextInt();
        }
        // recorrer el array para sumar por separado los numeros
        //positivos
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0) {
                sumaNeg += numeros[i];
                neg++;
            }
        }
        System.out.println("la suma es: " + sumaPos + "Hay " + pos + " numeros");

        //calcular y mostrar las medias
        if (pos != 0) {
            System.out.println("media de los valores positivos " + sumaPos / pos);
        } else {
            System.out.println("no ha introducido numeros positovos");
        }
        if (neg != 0) {
            System.out.println("media de los valores positivos " + sumaNeg / neg);
        } else {
            System.out.println("no ha introducido numeros negativos");
        }

    }
}
