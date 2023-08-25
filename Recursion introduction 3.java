import java.lang.*;
class Main {

    static int fun1(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else {
            return n*fun1(n-1);
        }
    }
    public static void main(String[] args)
    {
     System.out.println(fun1(5));
    }
}