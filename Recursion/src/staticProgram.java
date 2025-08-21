class StaticDemo {

static int a = 39;
static int b = 22;

static void callme (){

    System.out.println(" a => " + a);

}


}

public class staticProgram {
    
    public static void main(String[] args) {
        
       StaticDemo.callme();
        System.out.println(" b => " + StaticDemo.b);
   
}
    
}
