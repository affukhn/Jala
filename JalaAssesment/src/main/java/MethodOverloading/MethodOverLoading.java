package MethodOverloading;

public class MethodOverLoading {

    public void M1(int x)
    {
        System.out.println("argument Method "+x);
    }
    public void M1(int x,int y)
    {
        System.out.println("argument Method "+ x +" "+ y);
    }

    public  void M2(int x)
    {
        System.out.println("argument Method 2 "+x);
    }

    public void M2(int x, double y)
    {
        System.out.println("argument Method 2 "+y);
    }
    public  void M3(int x)
    {
        System.out.println("argument Method 3 "+x);
    }
    public void M3(double y)
    {
        System.out.println("argument Method 3 "+y);
    }


    public static void main(String[] args) {
        MethodOverLoading m= new MethodOverLoading();
        m.M1(10);
        m.M1(10,20);
        m.M2(10);
        m.M2(10,34.3);
        /* we can't assign same data type same length parameter and same Name in method overloading*/
        m.M3(10);
        m.M3(20.33);
      /*we can't assign same data type same length parameter and same Name in method overloading*/
    }

}
