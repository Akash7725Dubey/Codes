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
        int sum=0;
        int r;
        while(num>0)
        {
            r=num%10;
            num=num/10;
            sum=sum+r;
        }
        System.out.println(sum);
    }
}