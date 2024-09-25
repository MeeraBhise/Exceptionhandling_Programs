package Exceptionhanling;
public class ExceptionHandling {
    void show()
    {
        System.out.println("show method");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        ExceptionHandling obj=new ExceptionHandling();
        obj=null;
       try{obj.show();}
       catch(NullPointerException e){
           System.out.println("show all methods");
        }
        System.out.println("main ends");
    }
}

/* basic array practise
public class exceptionhandlingtest2 {
  String returnstringvalue()
  {
      System.out.println("return string");
      return "javaprogramming";
  }
   public static void main(String[] args) {
            System.out.println("main method");
            exceptionhandlingtest2 e=new exceptionhandlingtest2();
           String s =e.returnstringvalue();
           s=s+"programming";
            System.out.println("values:"+s);
        }
    }
    */
