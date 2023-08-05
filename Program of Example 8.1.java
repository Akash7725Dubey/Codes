class Rectangle
{
    int length, breadth;
    void getdata(int x,int y)
    {
        length=x;
        breadth=y;
    }
    int area()
    {
        return length*breadth;
    }

}
class Main
{
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        r1.length=10;
        r1.breadth=90;
        r2.length=45;
        r2.breadth=89;
        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}