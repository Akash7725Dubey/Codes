import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}