package operations;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class OperatorsTask {
    Scanner s= new Scanner(System.in);


    public void arthematicOperation(int num1,int num2)
    {

        System.out.println("Enter the Case of the arthematic");
        System.out.println("1.Add\n2.sub\n3.mul\n4.div");
         int chioce=s.nextInt();
         switch (chioce)
        {
            case 1:
                int sum=num1+num2;
                System.out.println("the sum is "+sum);
                break;
            case 2:
                float sub=num1-num2;
                System.out.println("the sub is"+sub);
                break;
            case 3:
                int mul=num1*num2;
                System.out.println("the mul is"+mul);
                break;
            case 4:
                float div=num1-num2;
                System.out.println("the div is"+div);
                break;
            default:
                System.out.println("Invalide choice");
        }
    }
    public  void incrementAndDecrement(int num)
    {
        System.out.println("type Increment or Decrement for 20");
        String str=s.nextLine();

        if(str.equalsIgnoreCase("Increment"))
        {
            num++;
        }
        else if(str.equalsIgnoreCase("decrement")){
            num--;
        }
        System.out.println("The number is "+num );
    }

    public void equalOrNotEqual(String str,int number)
    {
        if(number==10)
        {
            System.out.println("equal "+ number);
        } else if (number!=10) {
            System.out.println("not equal "+number);
        }

        if(str.equalsIgnoreCase("coding"))
        {
            System.out.println(" equal "+str);
        } else if (!str.equalsIgnoreCase("coding")) {
            System.out.println("not equal "+str);
        }

    }

    public void equalOrNot(int num1,int num2)
    {
        if(num1==num2)
        {
            System.out.println(num1+"are equal to "+num2);
        } else if (num1!=num2) {
            System.out.println(num1+"not equal to "+ num2);

        }
    }
    public void logicalAndOrNot(int num1,int num2)
    {
        if(num1 ==num2 && num1<num2)
        {
            System.out.println("And operator ");
        } else if (num1==num2 ||num1>num2) {
            System.out.println("or Operator ");

        } else if (! (num1>num2 &&num1==num2)) {
            System.out.println("Not Operator ");
        }
    }
    public void relationalOperator(int num1,int num2)
    {
        if(num1==num2)
        {
            System.out.println(num1+" equal to number "+num2);
        }
        if(num1>num2)
        {
            System.out.println(num1+"greater to number "+num2);
        }
        if(num1>=num2)
        {
            System.out.println(num1+"greater than and equal to "+num2);
        }
        if(num1<num2)
        {
            System.out.println(num1+"less to number "+num2);
        }
        if(num1<=num2)
        {
            System.out.println(num1+"less than and equal to "+num2);
        }


    }

    public void smallestAndLargest()
    {
        int []a={10,20,50,67,70,90,55,5};
        System.out.println(Arrays.toString(a));
        int smaller=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int l:a)
        {
            if(l<smaller)
                smaller=l;
            if(l>largest)
                largest=l;
        }
        System.out.println("The smallest number is "+smaller);
        System.out.println("The largest number is "+largest);

    }
}
