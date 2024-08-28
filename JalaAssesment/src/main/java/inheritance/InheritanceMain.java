package inheritance;

public class InheritanceMain {

    public void inheritanceMain()
    {
        A a= new A();
        a.masterA();
        a.currentClass();
        System.out.println(a.x);
        B b= new B();
        b.masterB();
        b.masterA();
        System.out.println(b.x);
        b.currentClass();
        C c= new C();
        c.masterC();
        c.masterB();
        c.masterA();
        c.currentClass();
        System.out.println(c.x);
    }
}
