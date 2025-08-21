package overloding.pkg1;

class overloadMethod {

    void test() {

        System.out.println(" NO parameters");
    }
    void test(int a) {
        System.out.println(" a : " + a);

    }
    void test(int a, int b) {

        System.out.println(" a and b" + a + b);
    }
    double test(double a) {

        System.out.println(" double a :");
        return a * a;
    }
}
public class Overloding1 {
    public static void main(String[] args) {
        // TODO code application logic here
        overloadMethod ob = new overloadMethod();
        double resulte;
        ob.test();
        ob.test(25);
        ob.test(10, 20);
        resulte = ob.test(12.5);
        System.out.println(" Result of  ob.test(12.5):" + ob.test(12.5) + resulte);
    }

}
