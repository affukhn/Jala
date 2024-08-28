package interfaces;

public class TajImp implements  Taj{
    @Override
    public void Dish() {
        System.out.println("Special Dish of Taj");
    }

    @Override
    public void payment() {
       System.out.println("All type of payment accepted.");
    }
}
