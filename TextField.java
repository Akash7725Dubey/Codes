import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    Label l1,l2;
    TextField tf;
    MyFrame()
    {
        super("TextField Demo");
        l1=new Label("No Text is entered yet");
        l2=new Label("Enter Key is not yet hit");
        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
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