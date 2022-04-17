/*
 Ejemplo 22
Crear un array de tamaño 10 permita ingresar  la poscion y el valor por teclado,
y ademas muestre un mesaje posicion no valida si sobrepasa la longitud del array.
 */
package Arrays;

import java.util.Scanner;

/*
 * @author Eliseo Canaviri
 */
public class Ejemplo_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int p, valor;
        int[] num = new int[10];
        System.out.print("Posición: ");
        p = entrada.nextInt(); //pedimos una posición del array
        if (p >= 0 && p < num.length) {  //si la posición introducida está dentro de los límites del array
            System.out.print("Valor: ");
            valor = entrada.nextInt();  //pedimos el valor
            num[p] = valor;
            System.out.println("En la posición: " + "[" + p + "]" + " = " + num[p]);
        } else {
            System.out.println("Posición no válida");
        }
    }
}
