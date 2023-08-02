import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        double p,d,y,s;
        System.out.println("Enter Purchase Price");
        Scanner sc=new Scanner(System.in);
        p=sc.nextDouble();
        System.out.println("Enter Depreciation");
        d=sc.nextDouble();
        System.out.println("Enter Year of Service");
        y=sc.nextDouble();
        s=p-d*y;
        System.out.println("Salvage value is "+s);
    }
}