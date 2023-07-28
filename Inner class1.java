
class Outer
{
    int x=10;
    Inner i=new Inner();
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

        i.InnerDisplay();
        System.out.println(i.y);
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
