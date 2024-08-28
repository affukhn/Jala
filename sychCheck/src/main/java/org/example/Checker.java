public class Checker implements  Runnable
{
    public void runCall()
    {
        synchronized(this)
        {
            System.out.print("This is Block  A");
        }
        synchronized(this)
        {
            System.out.print("This is Block  B");
        }
    }

    @Override
    public void run() {
        runCall();
    }
}
