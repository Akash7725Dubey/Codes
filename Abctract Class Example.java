abstract class Shape
{
    abstract double perimeter();
    abstract double area();
}
 class Circle extends Shape
{
double radius;
  public double perimeter()
  {
      return Math.PI*radius*2;
  }
  public double area()
  {
      return Math.PI*radius*radius;
  }
}
 class Rectangle extends Shape
{
    double length;
    double breadth;
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
public class Main
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        r.length=90;
        r.breadth=78;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        Circle c=new Circle();
        c.radius=89;
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
