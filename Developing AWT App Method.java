import java.awt.*;
class MyFrame extends Frame
{
    Button b;
    TextField tf;
    Label l;
     public MyFrame()
     {
         super("My App");
         l=new Label("Name");
         add(l);
         setLayout(new FlowLayout());

         tf=new TextField(20);
         add(tf);

         b=new Button("OK");
         add(b);
     }
}
class Main
{
    public static void main(String args[])
    {
     MyFrame f=new MyFrame();
     f.setVisible(true);
     f.setSize(400,400);
    }
}