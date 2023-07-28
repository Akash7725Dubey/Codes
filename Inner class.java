class Outer
{
    int x=10;
    class Inner
    {
        int y=20;
        public void InnerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    public void OuterDisplay()
    {
        Inner i=new Inner();
        i.InnerDisplay();
    }
}
public class Main
{
    public static void main(String args[])
    {
        Outer o=new Outer();
        o.OuterDisplay();
    }
}
