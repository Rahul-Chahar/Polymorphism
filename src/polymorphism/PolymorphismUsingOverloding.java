/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 13/02/2022
 */

package polymorphism;

public class PolymorphismUsingOverloding {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > c) return b;
        return c;
    }
}