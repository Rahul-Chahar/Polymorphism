/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 13/02/2022
 */

package main;

import polymorphism.PolymorphismUsingOverloding;

public class Overloading {
    public static void main(String[] args) {
        PolymorphismUsingOverloding p = new PolymorphismUsingOverloding();
        int result = p.max(10, 20);
        int result1 = p.max(10, 20, 30);

        System.out.println(result);
        System.out.println(result1);
    }

}