package importing_package;

import java.util.Scanner;

public class Importing_package {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myob = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = myob.nextInt();
        System.out.println("Enter num2:");
        int num2 = myob.nextInt();
        System.out.printf("%d + %d = %d\n" , num1,num2,(num1+num2));
        
        
        
    }
    
}
