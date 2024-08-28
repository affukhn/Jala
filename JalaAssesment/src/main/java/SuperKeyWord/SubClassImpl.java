package SuperKeyWord;

public class SubClassImpl  extends  ThisKeyUse{

    private  int count=0;
    public  SubClassImpl()
    {
        super(10,"Hello");
        super.Work();
        System.out.println(super.x);
        System.out.println(super.st);


//        public void CallConstructor()
//        {
////            this(10,20.22);
//        }

    }

    public SubClassImpl(int i, double v) {
        this();
        System.out.println(i+" "+v);
    }
}
