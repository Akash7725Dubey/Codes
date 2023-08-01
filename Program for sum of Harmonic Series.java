//Program for Sum of Harmonic Series
import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter Last Element");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        double sum=1;
        for(int i=2;i<=n;i++)
        {
            sum=sum+1.0/i;
        }
        System.out.println(sum);
    }