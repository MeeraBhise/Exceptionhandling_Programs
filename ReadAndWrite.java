package Exceptionhandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class ReadAndWrite {
    void  readfile() throws FileNotFoundException
    {
      FileInputStream fis= new FileInputStream("d:/abc.text");
    }
    void savefile() throws FileNotFoundException
    {
        String text="this is demo";
        FileOutputStream fos=new FileOutputStream("d:/xyz.text");
    }
}
class test extends ReadAndWrite{
    public static void main(String[] args) throws FileNotFoundException {
        ReadAndWrite rw =new ReadAndWrite();
         try {
             rw.readfile();
         }catch(FileNotFoundException fe)
         {
             fe.printStackTrace();
         }
        System.out.println("main method");
        rw.savefile();
    }
}