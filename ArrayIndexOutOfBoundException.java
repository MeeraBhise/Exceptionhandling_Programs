
package Exceptionhandling;

public class ArrayIndexOutOfBoundException extends Throwable{
    public static void main(String[] args) {
        int[] array = new int[10];
       try {
           System.out.println(array[11]);
       }catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("array");
       }
    }
}
