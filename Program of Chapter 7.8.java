import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter Number of Digits");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.println("Enter First Number");
        int num1;
        num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2;
        num2=sc.nextInt();
        int num3;
        int num4;
        for(int i=1;i<=n-2;i++)
        {
            num3=num1+num2;
            System.out.println(num3);
            num4=num2+num3;
            System.out.println(num4);
            num1=num3;
            num2=num4;
        }
    }
}