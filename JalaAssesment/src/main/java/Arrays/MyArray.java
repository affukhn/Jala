package Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyArray {
    private int [] arr=new int[10];
    private Scanner s=new Scanner(System.in);
    public MyArray()
    {
        addElementToArr();
        AverageSum();
        FindIndexArray();
        remove();
        copyArrayToAnother();
        insertAtIndex();
        MinAndMax();
        reverse();
        findDuplicate();

    }

    private void MinAndMax() {
        System.out.println("Max value of the arrays is"+Arrays.stream(arr).max());
        System.out.println("Min value of the arrays is"+Arrays.stream(arr).filter(x->x!=0).min());
    }

    public void reverse()
    {
      int []a=IntStream.range(0,arr.length).map(i->{
          if(i>arr.length/2) return arr[i];
            int ele=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            return ele;
        }).toArray();

        System.out.println(Arrays.toString(a));
    }

    public void findDuplicate()
    {
        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Filter out elements that appear more than once
        Set<Integer> nonDistinctElements = frequencyMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        int []a=Arrays.stream(arr)
                .boxed()
                .filter(nonDistinctElements::contains)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(a));

    }

    private void FindIndexArray() {
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the value to search in above array");
        int ele=s.nextInt();
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==ele)
           {
               System.out.println("index is "+i);
               break;
           }
       }
    }
    private void FindElementPresent() {
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the value to search in above array");
        int ele=s.nextInt();
        boolean b=true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                System.out.println("element is present  "+ele);
                b=false;
                break;
            }
        }
        if(b)
            System.out.println("element is not present"+ele);
    }
    public void remove()
    {
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the ele to be remove in above array");
        int ele=s.nextInt();
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {

                arr[i]=arr[i+1];
                break;

            }
        }
        for(int j=i+1;j<arr.length-1;j++)
        {
            arr[j]=arr[j+1];
        }
        System.out.println(Arrays.toString(arr));
    }

    public void insertAtIndex()
    {
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the ele to be insert at position index in above array");
        int ele=s.nextInt();
        System.out.println("index value");
        int index=s.nextInt();
        int oldEle=arr[index];
        arr[index]=ele;
        for(int i=index+1;i<arr.length-1;i++)
        {
            arr[i]=oldEle;
            oldEle=arr[i+1];

        }

        System.out.println(Arrays.toString(arr));
    }
    public void  copyArrayToAnother()
    {
      int []b= Arrays.copyOf(arr,arr.length);
        System.out.println("new Arrays is");
        System.out.println(Arrays.toString(b));
    }

    private void AverageSum() {
       float avg= (Arrays.stream(arr).sum())/arr.length;
        System.out.println("The average is "+avg);
    }


    private void addElementToArr() {
        int i=0;
        while(arr[i]!=0)
        {
            i++;
        }
        System.out.println("Enter the element and to exit type -1");
        int ele;
        for(int j=i;j<arr.length;j++)
        {
            if((ele=s.nextInt())==-1)
                break;
            arr[j]=ele;
        }
        System.out.println(Arrays.toString(arr));

    }
}
