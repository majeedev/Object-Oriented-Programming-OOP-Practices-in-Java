/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usesuper;

// Class A with an integer instance variable 'i'
class A {
    int i;
}

// Class B extends Class A and has an integer instance variable 'i'
class B extends A {
    int i;

    // Constructor for Class B that takes two integers 'a' and 'b'
    B(int a, int b) {
        // Call the constructor of the superclass (A) and set its 'i' to 'a'
        super.i = a;
        // Set the 'i' of the subclass (B) to 'b'
        i = b;
    }

    // Method to print the values of 'i' from the superclass and subclass
    void show() {
        System.out.printf("i in superclass: %d %n", super.i);
        System.out.printf("i in subclass: %d %n", i);
    }
}

// Main class to demonstrate the functionality
public class UseSuper {
    public static void main(String args[]) {
        // Create an object of Class B and pass 1 and 2 as arguments to the constructor
        B subOb = new B(1, 2);
        
        // Call the 'show()' method of the subclass (B)
        subOb.show();
    }
}