package personconstructor;


 class Person {
    // Declare private instance variables 'name' and 'age'
    private String name;
    private int age;

    // Parameterized constructor that takes 'name' and 'age' as parameters
    Person()
    {
        System.out.println("HI my name is Constructor ");
    }
    public Person(String name, int age) {
        
    
        // Print the values of the instance variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
   void Box(){
             System.out.println("Box() method");
    }
}

public class PersonConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new Person object using the parameterized constructor
        Person p = new Person("John", 30);
        Person p1 = new Person();
       // p1.Box();
       
        
    }
}