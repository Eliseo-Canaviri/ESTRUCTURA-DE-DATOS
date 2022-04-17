/*
 Ejemplo 1
  Crear un array que contenga los numeros de 1 al 10. Mostrar por la  pantalla
 */
package Arrays;

/**
 *
 * @author Eliseo Canaviri
 */
public class Ejemplo_1 {

    public static void main(String[] args) {
        int num[] = new int[10];
        //////System.out.println(" " + num[1]);
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            System.out.print("[ " + num[i] + " ]");
        }
        System.out.println("\n");///salto de linea
    }
}
