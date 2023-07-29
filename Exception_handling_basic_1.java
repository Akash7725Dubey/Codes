import java.lang.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter Two number");
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=b/a;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Division by zero");
        }
    }
}