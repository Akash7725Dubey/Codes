class Car
{
    public void Start()
    {
        System.out.println("Car is stated");
    }
    public void Accelerated()
    {
        System.out.println("Car is Accelerated");
    }
    public void ChangeGear()
    {
        System.out.println("Car Gear is Changed");
    }
}
class SmartCar extends Car{
    public void ChangeGear()
    {
        System.out.println("Automatic gear is Changed");
    }
    public void Roof()
    {
        System.out.println("Roof is Opened");
    }
}
class Main
{
    public static void main(String args[])
    {
        SmartCar c=new SmartCar();
        c.Start();
        c.Accelerated();
        c.ChangeGear();
    }
}
