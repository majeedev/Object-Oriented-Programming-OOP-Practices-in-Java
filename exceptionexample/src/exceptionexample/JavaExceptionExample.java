package exceptionexample;
 public class JavaExceptionExample {
     
     
     public static int getValue(int[] array, int index) throws Exception {

// Check if the array is null and throw an Exception if it is 
 if (array == null) {
     throw new Exception();
 }

// Access the value at the specified index
 int value = array[index];
 return value;
 }
 public static void main(String[] args) {




int[] array = null;

try
 {

 int value = getValue(array, 1); 
 System.out.println("value: " + value);
 }
 catch (Exception e)
 {

 System.out.println("Error: Provided array is null… so we caught the Exception");
 }
 }
 }