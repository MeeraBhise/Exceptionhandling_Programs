package Exceptionhandling;

public class OutOfMemoryError {
    public static void main(String[] args) {
        Integer[] array = new Integer[999999 * 9999999];
        String s = "Java";
        System.out.println("Hashcode of s is "+s.hashCode());
        System.out.println("Test message");

        /*for (int i = 0; i < 882423344; i++){
            String ss =  new String("Java");
        }*/
    }
}
