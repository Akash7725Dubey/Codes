import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter x");
        Scanner sc=new Scanner (System.in);
        int x;
        x=sc.nextInt();
        if(x>0)
        {
            System.out.println("1");
        }
        else if(x<0)
        {
            System.out.println("-1");
        }
        else if(x==0)
        {
            System.out.println("0");
        }
    }
}