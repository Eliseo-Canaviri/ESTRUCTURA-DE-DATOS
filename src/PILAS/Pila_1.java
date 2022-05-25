/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PILAS;

import java.util.*;

/**
 *
 * @author Eliseo Canaviri
 */
public class Pila_1 {

    public static void main(String[] args) {
        Stack p = new Stack();
        p.push(8);
        p.push(9);
        p.push(5);
        p.push(6);
        p.push(3);

        System.out.println(" elementos de la pila :" + p);
        int x = (int) p.pop();

        System.out.println(" elemeto eliminado de la : " + x);
        x = (int) p.pop();
        System.out.println(" elemeto eliminado de la : " + x);

        System.out.println(" elementos de la pila :" + p);

        p.push(79);

        System.out.println(" el ultimo elemento es:" + p.peek());

    }
}
