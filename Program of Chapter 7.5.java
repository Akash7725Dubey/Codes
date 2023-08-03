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
        int r;
        int rev=0;
        while(num>0)
        {
            r=num%10;
            num=num/10;
            rev=rev*10+r;

        }
        System.out.println(rev);
    }
}