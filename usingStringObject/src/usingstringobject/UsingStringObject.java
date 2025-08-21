package usingstringobject;

class StringClass {

    String name1;
    String name2;

        void usingObject(StringClass obj) {
        if (obj.name1 == obj.name2) {
            System.out.println("Is muches");
        } else {
            System.out.println("Not muching");
        }
    }

}

public class UsingStringObject {

    public static void main(String[] args) {
        
       StringClass stringOb = new StringClass();
        String newstring = new String("Majeed");
        String newstring1 = new String("Majeed");
        
        stringOb.name1 = newstring;
        stringOb.name2 = newstring1;
        stringOb.usingObject(stringOb);

    }

}
