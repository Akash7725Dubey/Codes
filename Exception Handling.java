public class Main
{
    static int area(int l,int b)throws Exception
    {
        if(l<0||b<0)
            throw new Exception();
            return l * b;

    }
    static void Meth1()throws Exception
    {
       System.out.println( area(-56,21));
    }
    public static void main(String args[])throws Exception
    {
        try
        {
            Meth1();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}