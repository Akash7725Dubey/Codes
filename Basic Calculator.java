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
    Button bRem=new Button("%");
    Button bPer=new Button("%");
    Label tf=new Label("       ");
    void appendText(String input)
    {
        tf.setText((tf.getText())+input);
    }
    MyFrame() {

       b0.addActionListener(this);
       b1.addActionListener(this );
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       bSum.addActionListener(this);
       bSub.addActionListener(this);
       bMul.addActionListener(this);
       bDiv.addActionListener(this);
       bEqual.addActionListener(this);
       bClear.addActionListener(this);
       bRem.addActionListener(this);
       bPer.addActionListener(this);

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
      add(bRem);
      add(bPer);
      add(bClear);
        add(tf);

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
        else if(e.getSource()==bDiv)
        {
            x=Double.parseDouble(tf.getText());
            Operators="/";
            tf.setText("");

        }
        else if(e.getSource()==bRem)
        {
            x=Double.parseDouble(tf.getText());
            Operators="Rem";
            tf.setText("");
        }
        else if(e.getSource()==bPer)
        {
            x=Double.parseDouble(tf.getText());
            Operators="%";
            tf.setText("");
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
                case "%":
                    appendText(x%y+"");
                    break;

            }
        }
    }

}
class Main
{
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setVisible(true);
        f.setSize(290,250);
    }
}
