import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a");
        int a;
        a=sc.nextInt();
        System.out.println("Enter b");
        int b;
        b=sc.nextInt();
        System.out.println("Enter c");
        int c;
        c=sc.nextInt();
        System.out.println("Enter d");
        int d;
        d=sc.nextInt();
        System.out.println("Enter m");
        int m;
        m=sc.nextInt();
        System.out.println("Enter n");
        int n;
        n=sc.nextInt();
        if((a*d)-(c*d)==0)
        {
            System.out.println("Denominator cannot be zero");
        }
        else {
            double x1, x2;
            x1 = ((m * d) - (b * n)) / ((a * d) - (c * d));
            x2 = ((n * a) - (m * c)) / ((a * d) - (c * d));
            System.out.println("x1 is " + x1);
            System.out.println("x2 is " + x2);
        }
    }
}