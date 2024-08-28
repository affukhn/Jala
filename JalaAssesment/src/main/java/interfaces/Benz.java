package interfaces;

public class Benz implements Engine{

    @Override
    public String typeOfEngine() {
        System.out.println("The Engine piston are"+piston);
        return "Benz new Model";
    }
}
