package lab3apstract;

abstract class Animal {
    public abstract void sound();
}
class Camel extends Animal{
public void sound(){
    System.out.println("grunt");

}

}

public class Lab3Apstract {

    public static void main(String[] args) {
        // TODO code application logic here
        Camel ob = new Camel();
        ob.sound();
    }
    
}
