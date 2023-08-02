import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter number");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(Integer.MIN_VALUE+"<"+n+"<"+Integer.MAX_VALUE);
    }
}