/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 13/02/2022
 */

package polymorphism;

public class PolymorphismUsingOverriding {
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub extends PolymorphismUsingOverriding {
    public void display() {
        System.out.println("Sub Display");
    }
}
