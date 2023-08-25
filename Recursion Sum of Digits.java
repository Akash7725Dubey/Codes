import java.lang.*;
import java.util.*;
class Main
{

    static int fun(int n)
    {

        if(n>0) {

            int r;
            r = n % 10;


            return ( r + fun(n / 10));


        }

    }
    public static void main(String args[])
    {
        System.out.println("Enter Number");
        Scanner s=new Scanner(System.in);
        int num;
        num=s.nextInt();
        System.out.println(fun(num));
    }
}
