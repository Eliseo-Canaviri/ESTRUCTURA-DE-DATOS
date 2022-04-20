/*

 */
package Arrays;

/**
 *
 * @author Eliseo Canaviri
 */
public class Ejemplo_5 {

    public static void main(String[] args) {
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.println(" " + a[i]);
        }

    }
}
