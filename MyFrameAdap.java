import java.awt.*;
import java.awt.event.*;
//Adapter class
class MyFrameAdap extends Frame
{
MyFrameAdap()
{
setVisible(true);
setSize(500,500);
addWindowListener(new Anu());
}

public static void main(String ...arg)
{
new MyFrameAdap();
}
}

class Anu  extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}