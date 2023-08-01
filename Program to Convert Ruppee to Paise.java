//Program for Reading the Price and converting it to Paise
import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter the Price");
        double price;
        Scanner sc=new Scanner(System.in);
        price =sc.nextDouble();
        double Amt;
        Amt=price*100;
        System.out.println("Amount in Paise "+Amt+"paise");
    }
}