package inheritance;

public class B  extends  A{
    {
        x=20;
    }
    public  void masterB(){
        System.out.println("Master B Class");
    }

    public void  whichClassB()
    {
        System.out.println("B class");
    }
    @Override
    public void currentClass()
    {
        System.out.println("I am A Class");
    }
}
