package inheritance;

public class C  extends  B{
    {
        x=30;
    }
    public  void masterC(){
        System.out.println("Master C Class");
    }

    public void  whichClassC()
    {
        System.out.println("C class");
    }
     @Override
    public void currentClass()
    {

        System.out.println("I am C Class");
    }
}
