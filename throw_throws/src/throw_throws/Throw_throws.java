package throw_throws;

public class Throw_throws {
    
    public static int getValue(int[] array , int index) throws Exception {
        if(array == null){
        throw new Exception();
        }
        int value = array[index];
        return value;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1,2,3,7};
        
        try {
            int value = getValue(array, 2);
            System.out.println("value" + value);
        } catch (Exception e) {
            System.out.println("provide array is null... so we caught the exception... ");
        }
        
    }
    
}
