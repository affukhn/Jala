package org.example;

public class Checker implements  Runnable
{
    public void runCall()
    {
        synchronized(this)
        {
            System.out.println("This is Block  A" + Thread.currentThread());
        }
        synchronized(this)
        {
            System.out.println("This is Block  B"+ Thread.currentThread());
        }

    }


    @Override
    public void run() {
        System.out.println("start the  run method");
        runCall();
    }
}
