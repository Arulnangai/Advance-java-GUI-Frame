import java.awt.*;
import java.awt.event.*;

class AVLogin extends Frame
{
Label ll1,l1,l2,l3,l4,l5,l6;
Button b1,b2;
TextField t1,t2,t3,t4,t5,t6;

AVLogin()
{
setVisible(true);
setSize(700,700);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
ll1 = new Label("Welcome to Sign-up page ...!");
l1 = new Label("First name");
l2 = new Label("Last name");
l3 = new Label("Phone number");
l4 = new Label("Residential code");
l5 = new Label("Email");
l6 = new Label("Password");
b1 = new Button("Register");
b2 = new Button("Reset");
t1 = new TextField(100);
t2 = new TextField(100);
t3 = new TextField(100);
t4 = new TextField(100);
t5 = new TextField(100);
t6 = new TextField(100);
add(ll1);
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(l4);add(t4);
add(l5);add(t5);
add(l6);add(t6);
add(b1);add(b2);
ll1.setBounds(100,50,200,20);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,200,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,200,20);
l3.setBounds(100,180,100,20);t3.setBounds(220,180,200,20);
l4.setBounds(100,220,100,20);t4.setBounds(220,220,200,20);
l5.setBounds(100,260,100,20);t5.setBounds(220,260,200,20);
l6.setBounds(100,300,100,20);t6.setBounds(220,300,200,20);
b1.setBounds(100,340,50,20);b2.setBounds(220,340,50,20);
/*b1.addActionListener(ae -> {
String a = t1.getText();
String b = t2.getText();

}); */
}

public static void main(String ...arg)
{
new AVLogin();
}
}