package try_catch;


public class Try_catch {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        try {
            int a = 0;
           int data = 46 / 23;
        }
        catch (ArithmeticException e) 
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
        
    }
    
}
