import java.lang.*;
class Main extends Thread
{
    public void run()
    {
        int i=1;

        while(true)
        {

            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String args[])
    {
        Main t=new Main();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}