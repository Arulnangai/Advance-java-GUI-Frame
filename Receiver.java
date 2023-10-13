import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class Receiver extends Frame
{
Label l1,l2,l3;
Button b1,b2;
TextField t1,t2;
List li1;
Socket s;
BufferedReader br;
PrintStream ps;
Receiver()throws Exception
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
li1 = new List();
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(li1);
add(b1);add(b2);
setLayout(null);
l1.setBounds(50,50,100,20);t1.setBounds(50,70,300,30);
l2.setBounds(50,130,100,20);t2.setBounds(50,150,300,30);
l3.setBounds(50,200,300,20);li1.setBounds(50,220,300,250);
b1.setBounds(370,220,60,20);b2.setBounds(370,250,60,20);
s = new Socket(InetAddress.getByName("localhost"),2023);
br = new BufferedReader(new InputStreamReader(s.getInputStream()));
ps = new PrintStream(s.getOutputStream());
b1.addActionListener(ae ->
{
String s1 =t2.getText();
ps.println(t1.getText() +":"+ s1);
li1.add("Me: "+s1);
t2.setText("");
t2.requestFocus();
});
b2.addActionListener(ae -> {
try{
li1.add(br.readLine());
}catch(Exception e){}
});
}

public static void main(String ...arg)throws Exception
{
new Receiver();
}
}