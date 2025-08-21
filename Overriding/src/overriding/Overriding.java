package overriding;

class Humen {

    public void eat() {
        System.out.println("Humen eats meat!");
    }
}
class Boy extends Humen {
    @Override
    public void eat() {
        System.out.println("Boy eats cereal!");
    }
}
public class Overriding {

    public static void main(String[] args) {
        // TODO code application logic here

        Boy ob = new Boy();
        ob.eat();
    }
}
