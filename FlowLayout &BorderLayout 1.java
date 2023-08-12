import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    Button b1,b2,b3,b4,b5,b6;
    public MyFrame()
    {
        super("FlowLayout Demo");
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        Panel p=new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));
       add(p,BorderLayout.EAST);
        //add(b6);
    }
}
class Main
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);

    }
}