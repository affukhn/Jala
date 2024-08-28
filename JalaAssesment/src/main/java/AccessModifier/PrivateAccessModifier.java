package AccessModifier;

public class PrivateAccessModifier {
    private int x=10;
    private void Method()
    {
        System.out.println("I am private Method");
    }

    public static void main(String[] args) {
        PrivateAccessModifier p=new PrivateAccessModifier();
        System.out.println(p.x);
        p.Method();
    }
}
