class Tv
{
    public void SwitchOn()
    {
        System.out.println("Tv is Switched on");
    }
    public void ChangeChannel()
    {
        System.out.println("TV Channel is changed");
    }
}
class SmartTv extends Tv
{
    public void SwitchOn()
    {
        System.out.println("Smart Tv is Switched On");
    }
    public void ChangeChannel()
    {
        System.out.println("Smart Tv channel is Changed");
    }
    public void Browse()
    {
        System.out.println("Smart Tv is Browsed");
    }
}
class Main
{
    public static void main(String args[])
    {
        SmartTv t=new SmartTv();
        t.ChangeChannel();
        t.SwitchOn();
    }
}