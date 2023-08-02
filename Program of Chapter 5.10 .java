import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      System.out.println("Enter Inductance");
      Scanner sc=new Scanner (System.in);
      double l;
      l=sc.nextDouble();
      System.out.println("Enter Resistance");
      double r;
      r=sc.nextDouble();
      double f;
      double c=0.01;

      for(double i=0.01;i<=0.1;i=i+c)
      {
          f=Math.sqrt((1/(l*(c+i)))-((r*r)/(4*(c+i)*(c+i))));
          System.out.println("Frequency is "+f);
      }

    }
}