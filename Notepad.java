import java.awt.*;
import java.awt.event.*;
class MyNotepad extends Frame 
{
MenuBar mb;
Menu m1,m2,m3;
MenuItem mi1,mi2,mi3;
MenuItem mi4,mi5,mi6;
MenuItem mi7,mi8,mi9,mi10;
MyNotepad()
{
setVisible(true);
setSize(500,500);
mb = new MenuBar();
m1 = new Menu("File");
m2 = new Menu("Edit");
m3 = new Menu("Exit");
mi1 = new MenuItem("New");
mi2 = new MenuItem("Open...");
mi3 = new MenuItem("Save");
mi4 = new MenuItem("Save As...");
mi5 = new MenuItem("Close");
mi6 = new MenuItem("Cut");
mi7 = new MenuItem("Copy");
mi8 = new MenuItem("Paste");
mi9 = new MenuItem("Select All");
mi10 = new MenuItem("Close");
setMenuBar(mb);mb.add(m1);mb.add(m2);mb.add(m3);
m1.add(mi1);m1.add(mi2);m1.add(mi3);m1.add(mi4);m1.add(mi5);
m2.add(mi6);m2.add(mi7);m2.add(mi7);m2.add(mi9);
m3.add(mi10);

mi5.addActionListener(ae -> System.exit(0));
mi10.addActionListener(ae -> System.exit(0));
}
public static void main(String arg[])
{
new MyNotepad();
}
}
