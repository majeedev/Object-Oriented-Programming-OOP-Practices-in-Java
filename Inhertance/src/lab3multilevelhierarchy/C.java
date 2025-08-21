package lab3multilevelhierarchy;
class A {
    void geeting(){
    
        System.out.println("Good Morning");
    }
}
class B  extends A {
    void sayWelcom(){
        System.out.println("Welcome");
    }
}



public class C extends B {


    public static void main(String[] args) {
        // TODO code application logic here
        C ob = new C();
        ob.geeting();
        ob.sayWelcom();
        
        
    }
    
}
