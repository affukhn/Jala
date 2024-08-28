package Abstract;

public class SubAbstractClass extends  AbstractClass {


    @Override
    public void abstractMethod1() {
        System.out.println(" I am abstract Method implemented in sub class");
    }

    public static void main(String[] args) {
        SubAbstractClass sub= new SubAbstractClass();
        sub.notAbstractMethod2();
        sub.abstractMethod1();
    }
}
