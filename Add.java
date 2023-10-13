import java.awt.*;
import java.awt.event.*;

class Add extends Frame
{
Label l1,l2,l3;
Button b1,b2;
TextField t1,t2,t3;

Add()
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
l1 = new Label("Number 1");
l2 = new Label("Number 2");
l3 = new Label("Result");
b1 = new Button("Add");
t1 = new TextField(20);
t2 = new TextField(20);
t3 = new TextField(20);
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);
setLayout(null);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,100,20);
l3.setBounds(100,180,100,20);t3.setBounds(220,180,100,20);
b1.setBounds(250,220,50,20);
b1.addActionListener(ae -> {
if(ae.getActionCommand().equalsIgnoreCase("Add"))
{
int a = Integer.valueOf(t1.getText());
int b = Integer.valueOf(t2.getText());
int c = a+b;
t3.setText(String.valueOf(c));
b1.setLabel("Clear");
}

if(ae.getActionCommand().equalsIgnoreCase("Clear"))
{
t1.setText("");
t2.setText("");
t3.setText("");
t1.requestFocus();
b1.setLabel("Add");
}
});
}
}


class MyAddMain
{
public static void main(String ...arg)
{
new Add();
}
}
