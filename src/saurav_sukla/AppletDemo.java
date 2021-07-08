package saurav_sukla;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class AppletDemo extends Applet {
    private JLabel l1,l2;
    private JTextField t1,t2;
    private JButton b1;
    
    public void init(){
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("Login");
    }
    public void start(){
        setLayout(new GridLayout(3,2));
        
        add(l1);add(t1);
        add(l2);add(t2);
              
        add(b1);
    }
    
}
