import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       System.out.println("Enter Demand rate");
       Scanner sc=new Scanner (System.in);
       double d;
       d=sc.nextDouble();
       System.out.println("Enter Setup Cost");
       double s;
       s=sc.nextDouble();
       System.out.println("Enter Holding Cost per unit time");
       double h;
       h=sc.nextDouble();
       double e;
       e=Math.sqrt((2*d*s)/(h));
       double t;
       t=Math.sqrt((2*s)/(d*h));
       System.out.println("EOQ "+e);
       System.out.println("TBO "+t);
    }
}