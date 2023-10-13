import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
MyFrame()
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
}
}

class MyFrameMain
{
public static void main(String ...arg)
{
new MyFrame();

}
}

