package SuperKeyWord;

public class SubClassImpl  extends  ThisKeyUse{

    private  int count=0;
    public  SubClassImpl()
    {

        super(10,"Hello");
        super.Work();

        System.out.println(super.x);
        System.out.println(super.st);

    }

    public SubClassImpl(int x)
    {
          this();
    }


    public SubClassImpl(double v, int i) {
        System.out.println(i+" "+v);
    }

    public SubClassImpl(int x, String st) {
        super(x, st);
    }

    public void m1()
    {
//        this();
        /*we can't use this() and  super() inside the method*/
    }

    public static void main(String[] args) {
        SubClassImpl impl=new SubClassImpl();

    }
}
