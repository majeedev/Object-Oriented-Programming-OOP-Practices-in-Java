/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticbyname;

/**
 *
 * @author almaj
 */
class StaticDemo {
    // Static variable a
    static int a = 39;
    // Static variable b
    static int b = 22;
    
     int x = 40;
    // Static variable b
     int y = 50;
    // Static method callme()
    static void callme() {
        // Print the value of static variable a
        System.out.println("a => " + a);
    }
}

public class StaticByName {
    public static void main(String args[]) {
        StaticDemo ob = new StaticDemo();
  
        // Call the static method callme() of StaticDemo class
//        StaticDemo.callme();
//        // Access the static variable b of StaticDemo class
//        
//        System.out.println("b => " + StaticDemo.b);

 int AGE = 38;

        // Attempt to change the value of the final variable
        // This will cause a compilation error
        AGE = 40;

        // Print the value of the final variable
        System.out.println("Age: " + AGE);
    }
}
