package Exceptionhandling;

class ClassNotFoundExceptionRuntimeException {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class bb = null;
        try {
            bb = Class.forName("Exceptionhandling.ClassNots");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        ClassNotFoundExceptionRuntimeException obj = (ClassNotFoundExceptionRuntimeException) bb.newInstance();
     System.out.println("yydf");
       /* int[] ar ={1,3,4,6,8};
        System.out.println(ar[1]);*/
    }
}
