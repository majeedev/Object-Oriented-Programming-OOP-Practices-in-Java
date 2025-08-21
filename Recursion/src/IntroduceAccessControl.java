
class Test {

int a ; //DEFAULT Access
public int b ;
private int c;

void setc (int i ){
    c = i;

}
int getc (){
    return c ; 
}

}




public class IntroduceAccessControl {
    public static void main(String[] args) {
        
        Test ob = new Test();
        ob.a = 12;
        ob.b = 34;
        
       // ob.c = 100;
        ob.setc(100);
        System.out.println("a , b , and c:" + ob.a + " " + ob.b + " " + ob.getc());
   
}
    
}
