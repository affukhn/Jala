package interfaces;

public class zomato implements  Online,Offline{

    @Override
    public void serviceOffline() {
        System.out.println("offline Service is available");
    }

    @Override
    public void ServiceOnline() {
      System.out.println("Online service is available");
    }
}
