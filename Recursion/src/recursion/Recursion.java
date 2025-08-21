package recursion;

class Factorial {

    int fact(int n) {

        int res;

        if (n == 1) {
            return 1;
        }
        res = fact(n - 1) * n;
        return res;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(" Factorial of 5 is " + f.fact(5));
        System.out.println("Factorial of 6 is " + f.fact(6));
        System.out.println(" Factorial of 7 is " + f.fact(7));
    }

}
