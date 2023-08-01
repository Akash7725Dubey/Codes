//Program for converting Fahrenheit to Celsius
import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter temperature in Fahrenheit");
        Scanner sc =new Scanner(System.in);
        double temp;
        temp=sc.nextDouble();
        double celsius;
        celsius=(temp-32)/1.8;
        System.out.println("Celsius "+celsius);
    }
}