import java.awt.*;
import java.awt.event.*;

class Radio extends Frame
{
Panel p1,p2;
Button b1,b2,b3,b4,b5;
Label l1,l2,l3,l4,l5;
TextField t1;
Radio()
{
setVisible(true);
setSize(500,500);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
p1 = new Panel();
p2 = new Panel();
b1 = new Button("Last");
b2 = new Button("Next");
b3 = new Button("Prev");
b4 = new Button("First");
b5 = new Button("Get");
t1 = new TextField(30);
p1.add(b1); p1.add(b2);
p1.add(b3); p1.add(b4); p1.add(b5);
l1 = new Label("B1");
l1.setBackground(Color.blue);
l2 = new Label("B2");
l2.setBackground(Color.blue);
l3 = new Label("B3");
l3.setBackground(Color.blue);
l4 = new Label("B4");
l4.setBackground(Color.blue);
l5 = new Label("B5");
l5.setBackground(Color.blue);
p2.add(l1); p2.add(l2);
p2.add(l3); p2.add(l4); p2.add(l5);
setLayout(null);
b1.setBounds(50,50,50,20); b2.setBounds(130,50,50,20);
b3.setBounds(200,50,50,20); b4.setBounds(270,50,50,20);
t1.setBounds(340,50,100,20);
b5.setBounds(460,50,50,20);
add(p1,BorderLayout.NORTH);
add(p2,BorderLayout.WEST);
}

public static void main(String ...arg)
{
new Radio();
}
}