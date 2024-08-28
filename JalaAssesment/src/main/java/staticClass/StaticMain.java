package String;

public class StaticMain {
    public static int a=10;
    public static  String s="Hello";
    public double b=20;
    public char c='A';

    public static void staticMethod1()
    {
        System.out.println("I am static method 1.");
    }
    public static void staticMethod2()
    {
        System.out.println("I am static method 2.");
    }

    public  void instanceMethod1()
    {
        System.out.println("I am instance the method 1.");
    }

    public  void instanceMethod2()
    {
        System.out.println("I am instance the method 2.");
    }

    public static void main(String[] args) {
        staticMethod1();
        staticMethod2();
        System.out.println(s);
        System.out.println(a);
       StaticMain s= new StaticMain();
        System.out.println(s.b);
        System.out.println(s.c);
        s.instanceMethod1();
        s.instanceMethod2();
    }
}
