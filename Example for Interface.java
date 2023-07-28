class Phone
{
    public void call()
    {
        System.out.println("Phone is calling");
    }
    public void Sms()
    {
        System.out.println("Phone is Sending Sms");
    }
}
interface ICamera
{
    void click();
    void Record();
}
interface IMusicPlayer
{
    void Start();
    void Stop();
    void Play();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void call()
    {
        System.out.println("Smart Phone is Calling");
    }
    public void Sms() {
        System.out.println("Smart Phone is Sending Sms");
    }
    public void click()
    {
        System.out.println("Smart Phone is Clicking Photos");
    }
    public void Record()
    {
        System.out.println("Smart Phone is Recording");
    }
    public void Start() {
        System.out.println("Smart Phone is Starting");
    }
    public void Stop()
    {
        System.out.println("Smart Phone is Stopped");
    }
    public void Play()
    {
        System.out.println("Smart Phone is Playing");
    }
}
public class Main
{
    public static void main(String args[])
    {
        SmartPhone sp=new SmartPhone();
        sp.Play();
        sp.call();
        sp.Sms();
    }
}