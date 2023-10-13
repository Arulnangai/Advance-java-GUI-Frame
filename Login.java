import java.awt.*;
import java.awt.event.*;

class Login extends Frame
{
Label l1,l2;
Button b1,b2;
TextField t1,t2;
Login()
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
l1 = new Label("Username");
l2 = new Label("Password");
b1 = new Button("Login");
b2 = new Button("Clear");
t1 = new TextField(20);
t2 = new TextField(20);
add(l1);add(t1);
add(l2);add(t2);
add(b1);add(b2);
setLayout(null);
l1.setBounds(100,100,100,20);t1.setBounds(220,100,100,20);
l2.setBounds(100,140,100,20);t2.setBounds(220,140,100,20);
b1.setBounds(150,220,50,20);b2.setBounds(220,220,50,20);
b1.addActionListener(ae -> {
String a = t1.getText();
String b = t2.getText();

if(a.equalsIgnoreCase("lakshSim") && b.equalsIgnoreCase("itech@123"))
{
String s1 = "Login Successful";
add(s1,BorderLayout.SOUTH);
}
else
{
String s2 ="Invalid Credentials";
add(s2,BorderLayout.SOUTH);
}
});
b2.addActionListener(ae ->{
t1.setText("");
t2.setText("");
});
}

public static void main(String ...arg)
{
new Login();
}
}