package stringClass;

import java.nio.Buffer;
import java.util.Locale;
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
         String email = "myEMail@exa.com";
         String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
         boolean isValid = email.matches(regex);
         System.out.println("Is the email valid? " + isValid);
         System.out.println("Hello".equals("Hello"));
         System.out.println("Hello".equals("World"));
         System.out.println("Hello".equalsIgnoreCase("hello"));
         System.out.println("Hello".startsWith("He"));
         System.out.println("World".endsWith("ld"));
         System.out.println("Hello".compareTo("hello"));
         String TimStr=" WOrk done ";
         System.out.println(TimStr.trim());
         System.out.println(TimStr.replace('O','o'));
         System.out.println(String.valueOf("232"));
         System.out.println(10+"");
         System.out.println(s.toUpperCase());
         System.out.println(s.toLowerCase());



     }
}
