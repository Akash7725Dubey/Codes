import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {

    Double x;
    Double y;
    Button b0 = new Button("0");

    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button bSum=new Button("+");
    Button bSub=new Button("-");
    Button bMul=new Button("*");
    Button bDiv=new Button("/");
    Button bEqual=new Button("=");
    Button bClear=new Button("C");

    Button bPer=new Button("%");
    Button bDeci=new Button(".");
    Button bRev=new Button("Back");
    Button bCancel=new Button("x");
    TextField tf=new TextField("            ",25);

    void appendText(String input)
    {
        tf.setText((tf.getText())+input);
    }
    Boolean DisplayY=true;
    MyFrame() {

        b0.addActionListener(this);
        b0.setPreferredSize(new Dimension(50, 50));
        b1.addActionListener(this );
        b1.setPreferredSize(new Dimension(50, 50));
        b2.addActionListener(this);
        b2.setPreferredSize(new Dimension(50, 50));
        b3.addActionListener(this);
        b3.setPreferredSize(new Dimension(50, 50));
        b4.addActionListener(this);
        b4.setPreferredSize(new Dimension(50, 50));
        b5.addActionListener(this);
        b5.setPreferredSize(new Dimension(50, 50));
        b6.addActionListener(this);
        b6.setPreferredSize(new Dimension(50, 50));
        b7.addActionListener(this);
        b7.setPreferredSize(new Dimension(50, 50));
        b8.addActionListener(this);
        b8.setPreferredSize(new Dimension(50, 50));
        b9.addActionListener(this);
        b9.setPreferredSize(new Dimension(50, 50));
        bSum.addActionListener(this);
        bSum.setPreferredSize(new Dimension(50, 50));
        bSub.addActionListener(this);
        bSub.setPreferredSize(new Dimension(50, 50));
        bMul.addActionListener(this);
        bMul.setPreferredSize(new Dimension(50, 50));
        bDiv.addActionListener(this);
        bDiv.setPreferredSize(new Dimension(50, 50));
        bEqual.addActionListener(this);
        bEqual.setPreferredSize(new Dimension(50, 50));
        bClear.addActionListener(this);
        bClear.setPreferredSize(new Dimension(50, 50));
        bPer.addActionListener(this);
        bPer.setPreferredSize(new Dimension(50, 50));
        bDeci.addActionListener(this);
        bDeci.setPreferredSize(new Dimension(50,50));
        bRev.addActionListener(this);
        bRev.setPreferredSize(new Dimension(50,50));
        bCancel.addActionListener(this);
        bCancel.setPreferredSize(new Dimension(50,50));
        tf.setPreferredSize(new Dimension(200, 800));

        add(tf);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bEqual);
        add(bSum);
        add(bSub);
        add(bMul);
        add(bDiv);
       add(bCancel);
        add(bPer);
        add(bDeci);
        add(bClear);
        add(bRev);
        add(bCancel);


        setLayout(new FlowLayout());
    }
    String Operators;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==(b0))
        {
            appendText("0");
        }
        else if(e.getSource()==(b1))
        {
            appendText("1");
        }
        else if(e.getSource()==(b2))
        {
            appendText("2");
        }
        else if (e.getSource()==(b3))
        {
            appendText("3");
        }
        else if (e.getSource()==(b4))
        {
            appendText("4");
        }
        else if(e.getSource()==(b5))
        {
            appendText("5");
        }
        else if(e.getSource()==(b6))
        {
            appendText("6");
        }
        else if(e.getSource()==(b7))
        {
            appendText("7");
        }
        else if(e.getSource()==(b8))
        {
            appendText("8");
        }
        else if(e.getSource()==(b9))
        {
            appendText("9");
        }
        else if(e.getSource()==(bRev))
        {
           if(DisplayY)
           {
               tf.setText(String.valueOf(y));
           }
           else {
               tf.setText(String.valueOf(x));
           }
           DisplayY= !DisplayY;
        }
        else if (e.getSource()==(bDeci))
        {
            appendText(".");
        }
        else if(e.getSource()==bSum)
        {
            x=Double.parseDouble(tf.getText());
            Operators="+";
            tf.setText("");

        }

        else if(e.getSource()==bSub)
        {
            x=Double.parseDouble(tf.getText());
            Operators="-";
            tf.setText("");

        }
        else if(e.getSource()==bMul)
        {
            x=Double.parseDouble(tf.getText());
            Operators="*";
            tf.setText("");

        }
        else if(e.getSource()==bCancel)
        {
            String str3=tf.getText();
            if(!str3.isEmpty())
            {
                String p=str3.substring(0,str3.length()-1);
                tf.setText(p);
            }
        }
        else if(e.getSource()==bDiv)
        {
            x=Double.parseDouble(tf.getText());
            Operators="/";
            tf.setText("");

        }

        else if(e.getSource()==bPer)
        {
            double currentValue = Double.parseDouble(tf.getText());
            double result = currentValue / 100;
            tf.setText(result + "%");
        }
        else if(e.getSource()==bClear)
        {
            tf.setText("");
        }
        else if(e.getSource()==(bEqual)) {
            {
                y = Double.parseDouble(tf.getText());
                tf.setText("");
            }
            switch (Operators) {
                case "+":
                    appendText((x + y)+"");
                    break;
                case "-":
                    appendText( (x - y)+"" );
                    break;
                case "*":
                    appendText( (x * y )+"");
                    break;
                case "/":
                    appendText( (x / y)+"" );
                    break;
                case "Rem":
                    appendText(x%y+"");
                    break;
                case "%":
                    appendText((x/100)+"%");

            }
        }
    }

}
class Main
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setBackground(Color.BLACK);
        f.setVisible(true);
        f.setSize(250,350);
    }
}































