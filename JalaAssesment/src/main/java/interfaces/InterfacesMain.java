package interfaces;

public class InterfacesMain
{
    public static void interfaceMain()
    {
        // 1. Create an interface with only method and implement it in a class Call the method implemented.
        RestaurantImp r= new RestaurantImp();
        r.Name();
        // 2. Create an interface with methods, but implement only one in a class.Call the  method implemented.
        Taj t= new TajImp();
        t.Dish();
        t.payment();
        // 3. use Interface instances to call the implemented  method  in the implemented class.
        Restaurant rest= new RestaurantImp();
        rest.Name();
        // 4.create two  interface  with one  method each.implemented method in the implemented class
        zomato z= new zomato();
        z.serviceOffline();
        z.ServiceOnline();
        //5. Create  two interface with Same method (Same Signature) in both  the interface  in one class.
        /* ans: it is impossible to create because with same signature it give compile time  error
         */
        /*6. create   an interface with a default method and implement it in  a class .Do not provide implement to the
        * deafult method  and call the method*/
        NewBatch b= new NewBatch();
        b.student();
        /*7. create  an interface and inherit  it from  the other interface */
        System.out.println(BMW.model);
        System.out.println(BMW.piston);
//        8. create a public interface with fields and method fields should have values assigned.
//        Implement this interface to some  class and print the values of the interface field and call the interface  methods.
        Benz benz=new Benz();
        System.out.println(benz.typeOfEngine());

    }
}
