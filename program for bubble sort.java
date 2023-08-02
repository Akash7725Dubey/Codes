import java.lang.*;
import java.util.Scanner;
//Bubble sort
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter no. of elements in an array");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element of index "+i);
            A[i]=sc.nextInt();
        }
        for(int j=0;j<A.length-1;j++)
        {
            for(int k=j+1;k<A.length;k++)
            {
                if(A[j]>A[k])
                {
                    A[j]=A[j]^A[k];
                    A[k]=A[j]^A[k];
                    A[j]=A[j]^A[k];
                }
            }
        }
        for(int x:A)
        {
            System.out.println(x);
        }


    }

}