package AccessModifier;

public class SubClass {
    public static void main(String[] args) {
      PrivateAccessModifier p = new PrivateAccessModifier();
      //we can't able to access  method  and variable in the sub class;
        DefaultAccessModifier d= new DefaultAccessModifier();
        System.out.println(d.x);
           d.method();
           ProtectedAccessModifier m= new ProtectedAccessModifier();
        System.out.println(m.x);
        m.method();
        publicAccessModifier pub= new publicAccessModifier();
    }
}
