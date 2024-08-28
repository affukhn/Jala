package Loop;

import java.util.Scanner;

public class LoopMain
{
    public LoopMain() {
        BrightItCareer();
        whileLoop1to20();
        EqualNotEqual();
        OddAndEven();
        LargestNumberAmong3();
        OddAndEven10To100();
        doWhile1TO10();
        ArmStrong();
        primeNum();
        palindrome();
        switchEvenOrOdd();
        genderMAndF();
    }

    private void switchEvenOrOdd()
    {
        int number=8;
        switch (number%2)
        {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
        }
    }
    public void genderMAndF()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the character M/F for male and female");
        char c=s.next().charAt(0);
        switch (Character.toUpperCase(c)){
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("female");
                break;
        }

    }

    public void  BrightItCareer()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("BrightItCareer");
        }
    }
    public void whileLoop1to20()
    {
        int i=0;
        while(i<=20) {
            System.out.println("value of i is "+i);
            i++;
        }
    }
    public void EqualNotEqual()
    {
        int i=10;
        while (i!=0)
        {
            System.out.println("not equal"+ i);
            i--;
        }
        while (i==10 || i<10)
        {
            i++;
            System.out.println("equal "+i);
        }
    }
    public void LargestNumberAmong3()
    {
        int num1=10;
        int num2=20;
        int num3=30;
        if(num1>num2 && num1>num3)
            System.out.println(num1+"largest than "+num2+" "+num3);
        if (num2>num1 && num2>num3)
            System.out.println(num2+"largest than "+num3+" "+num1);
        if(num3>num1 && num3>num2)
            System.out.println(num3+" largest than "+num2 +" "+num1);
    }
    public void OddAndEven()
    {
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
                System.out.println("even number"+i);
            else
                System.out.println("odd number"+i);
        }
    }
    public void OddAndEven10To100()
    {
        int i=10;
        while(i<=100)
        {
            if(i%2==0)
                System.out.println("even number"+i);
            else
                System.out.println("odd number"+i);
            i++;
        }
    }

    public  void doWhile1TO10()
    {
        int i=1;
        do {
            System.out.println("Number of i: " + i);
            i++;
        } while (i <= 10);
    }
    public void ArmStrong()
    {
        int amstrong;
        int number=amstrong=153;
        int length=String.valueOf(number).length();
       int sum=0;
        while(number>0)
        {
            int rem=number%10;
            sum+=Math.pow(rem,length);
            number=number/10;
        }
        if(amstrong==sum)
        {
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not amstrong number");
        }
    }

    public  void primeNum()
    {
        int num=5;
        boolean b= true;
        for (int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println("not prime number"+num);
                b=false;
                break;
            }
        }
        if(b)
            System.out.println("prime number "+num);
    }

    public void palindrome()
    {
        int number =121;
        StringBuilder b=new StringBuilder(String.valueOf(number)).reverse();
        int rev=Integer.parseInt(b.toString());
        if(rev==number)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}
