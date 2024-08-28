package inheritance;

public class A
{
    int x;

    {
        x = 10;
    }

    public  void masterA(){
        System.out.println("Master A Class");
    }

    public void  whichClassA()
    {
        System.out.println("A class");
    }
    public void currentClass()
    {
        System.out.println("I am A Class");
    }
}
