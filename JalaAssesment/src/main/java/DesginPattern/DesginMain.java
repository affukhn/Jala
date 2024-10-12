package test;

import java.util.ArrayList;
import java.util.List;

public class MainAB extends B{

    public static void main(String[] args) {

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                SingletonDouble s = SingletonDouble.initBlock();
                System.out.println(s);

            }
        };
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        t1.start();
        t2.start();
    }



    @Override
    public void method1() {
        System.out.println("Hello");
    }
}
