/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

/**
 *
 * @author almaj
 */
// Foo class with a public integer 'i' and a private integer 'j'
class Foo {
    int i;
    private int j;

    // Method to set the values of 'i' and 'j'
    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// B class extends the Foo class and has an additional integer 'total'
class B extends Foo {
    int total;

    // Method to calculate the sum of 'i' and 'j' and store it in 'total'
    void sum() {
       // total = i + j;
    }
}

public class Access {
    public static void main(String args[]) {
        // Create an object of the B class
        B subOb = new B();
         B subOb1 = new B();

        // Set the values of 'i' and 'j' using the setij() method
        subOb.setij(11, 12);
subOb1.setij(11, 12);
        // Call the sum() method to calculate the sum and store it in 'total'
        subOb.sum();

        // Print the value of 'total'
        System.out.println("Total is " + subOb.total);
    }
}
