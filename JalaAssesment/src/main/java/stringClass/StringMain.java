package stringClass;

import java.nio.Buffer;
import java.util.regex.Pattern;

public class StringMain {

     public StringMain()
     {
         Str();

     }
     public void Str()
     {
         String s="coding";
         String s1= new String("Work");
         String builder= new StringBuilder().append("Hello").toString();
         System.out.println("concat the string");
         System.out.println("Hello"+" "+"World");
         System.out.println(s.length()+" length of the string");
         System.out.println(s.substring(0,4));
         System.out.println(s.indexOf('d'));
         System.out.println("Hello".equals("Hello"));
         System.out.println("Hello".equals("World"));
         System.out.println("Hello".equalsIgnoreCase("hello"));



     }
}
