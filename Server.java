import java.awt.*;
import java.awt.event.*;

class Sender extends Frame
{
Label l1,l2,l3;
Button b1,b2;
TextField t1,t2,t3;
Sender()
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
l1 = new Label("Name");
l2 = new Label("Message");
l3 = new Label("History");
b1 = new Button("Send");
b2 = new Button("Receive");
t1 = new TextField(50);
t2 = new TextField(50);
t3 = new TextField(50);
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);add(b2);
setLayout(null);
l1.setBounds(50,50,100,20);t1.setBounds(50,70,300,30);
l2.setBounds(50,130,100,20);t2.setBounds(50,150,300,30);
l3.setBounds(50,200,300,20);t3.setBounds(50,220,300,250);
b1.setBounds(370,220,60,20);b2.setBounds(370,250,60,20);
}
public static void main(String ...arg)
{
new Sender();
}
}