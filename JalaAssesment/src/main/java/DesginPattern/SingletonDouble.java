package test;

public class SingletonDouble {

    private int value;
    private static SingletonDouble obj;
    private SingletonDouble(int value)
    {
        this.value=value;

    }

    public static  SingletonDouble initBlock()
    {
        if(obj==null)
        {
            synchronized (SingletonDouble.class)
            {
                if(obj==null)
                    obj=new SingletonDouble(96);
            }
            return obj;
        }
        return obj;
    }
}
