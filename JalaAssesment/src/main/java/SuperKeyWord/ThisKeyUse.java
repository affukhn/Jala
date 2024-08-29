package SuperKeyWord;

public class ThisKeyUse
{
    public   int x=10;
    public String st="Hello World";

    public ThisKeyUse(int x,String st) {
        this.x = x;
        this.st = st;
    }

    public ThisKeyUse() {
        this(10, "Hello");
    }

    public  void Work()
    {
        System.out.println(this.x);
        System.out.println(this.st);
    }

}
