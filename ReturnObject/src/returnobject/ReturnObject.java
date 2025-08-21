/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnobject;

/**
 *
 * @author almaj
 */
class Dog {
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Dog getOlderDog(Dog other) {
    if(this.age > other.age) {
        return this;
    }
    else {
        return other;
    }
}

    
}

public class ReturnObject {
    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy", 5);
        Dog d2 = new Dog("Whiskers", 3);
        Dog olderDog = d1.getOlderDog(d2);
        System.out.println("The older dog is " + olderDog);
    }
}