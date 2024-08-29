package constructor;

public class OverloadedContructor {
    public OverloadedContructor() {
        System.out.println("No argument constructor");
    }
    public OverloadedContructor(int x,int y)
    {
        System.out.println("argument constructor"+x+" "+y);
    }
    public OverloadedContructor(int x)
    {
        System.out.println("argument constructor"+x);
    }

    public static void main(String[] args) {
        OverloadedContructor overloadedContructor=new OverloadedContructor();
        OverloadedContructor overloadedContructor1 = new OverloadedContructor(10);
        new OverloadedContructor(10,20);
    }
}
