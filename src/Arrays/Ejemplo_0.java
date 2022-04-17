/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Eliseo Canaviri
 */
public class Ejemplo_0 {

    public static void main(String[] args) {

        double notas[] = {6.7, 7.5, 5.3, 8.75, 3.6, 6.5};
        ///                0    1   2      3   4    5
        for (int i = 0; i < 6; i++) {
            //System.out.println(i);
            System.out.println(i + "=" + "[" + notas[i] + "]");

        }

        System.out.println("En la posicion :" + "[" + notas[5] + "]");

    }
}
