package objectparameter;

class Test {

    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equlaTo(Test o) {
        if(o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }

    }

}

public class ObjectParameter {

    public static void main(String[] args) {
        // TODO code application logic here

        Test ob1 = new Test(11, 5);
        Test ob2 = new Test(11, 5);
        Test ob3 = new Test(11, 2);
        System.out.println(" ob1 == ob2: " + ob1.equlaTo(ob2));
        System.out.println(" ob1 == ob3: " + ob1.equlaTo(ob3));

    }

}
