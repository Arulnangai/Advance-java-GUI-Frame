import java.awt.*;

public class ExamImg extends Frame
{
Toolkit t;
Image im;
public ExamImg()
{
setVisible(true);
setSize(500,500);
t = Toolkit.getDefaultToolkit();
im = t.getImage("C:\\Users\\AnuApsara\\Pictures\\Flag.jfif");
}
public void paint(Graphics g)
{
g.drawImage(im,100,100,300,300,this);
}
public static void main(String arg[])
{
new ExamImg();
}
}