
import java.awt.*;

public class Banking extends Frame {
    MenuBar mb;
    Menu m1,m2,m3;
    MenuItem mi1,mi2,mi3,mi4,mi5;
    MenuItem mi6,mi7,mi8;
    Panel p1;
    Label l1,l2;
    TextField tf1,tf2;

    Banking()
    {
        setVisible(true);
        setSize(500,500);
        mb = new MenuBar();
        m1 = new Menu("SB");
        m2 = new Menu("FD");
        m3 = new Menu("Exit");
        mi1 = new MenuItem("New account");
        mi2 = new MenuItem("Withdraw");
        mi3 = new MenuItem("Deposit");
        mi4 = new MenuItem("Calculate interest");
        mi5 = new MenuItem("To Close");
        mi6 = new MenuItem("New account");
        mi7 = new MenuItem("To Close");
        mi8 = new MenuItem("Exit");
        l1 = new Label("Name");
        l2 = new Label("Address");
        tf1 = new TextField(30);
        tf2 = new TextField(30);
        p1 = new Panel();
        setMenuBar(mb);mb.add(m1);mb.add(m2);mb.add(m3);
        m1.add(mi1);m1.add(mi2);m1.add(mi3);m1.add(mi4);m1.add(mi5);
        m2.add(mi6);m2.add(mi7);
        m3.addActionListener(ae -> System.exit(0));
        mi1.addActionListener( ae-> {
        add(p1,BorderLayout.CENTER);
        p1.add(l1);
        p1.add(l2);
        p1.add(tf1);
        p1.add(tf2);
        l1.setBounds(50,100,50,20);tf1.setBounds(120,100,50,20);
        l2.setBounds(50,150,50,20);tf2.setBounds(120,150,50,20);
        });
        mi2.addActionListener(ae->{});
        mi3.addActionListener(ae->{});
        mi4.addActionListener(ae->{});
        mi5.addActionListener(ae->{});
        mi6.addActionListener(ae->{});
        mi7.addActionListener(ae->{});
        mi8.addActionListener(ae->{});

    }

    public static void main(String ...arg)
    {
        new Banking();
    }
}
