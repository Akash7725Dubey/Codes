import java.lang.*;
class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("\n From Thread A"+i);

        }
        System.out.println("Thread A exit");
    }

}
class B extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("\n From Thread B"+j);
        }
        System.out.println("Thread B exit");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("\n From Thread C"+k);
        }
        System.out.println("Thread C exit");
    }
}
class Main
{
    public static void main(String args[])
    {
        new A().start();
        new B().start();
        new C().start();
    }
}