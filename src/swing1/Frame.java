package swing1;
import java.awt.Color;
import javax.swing.*;
public class Frame {
    public static void main(String[] args){
    JFrame frame=new JFrame();
    ImageIcon icon=new ImageIcon("F:\\Onedrive\\Documents\\PROGRAMMING\\PROJECT\\NetBeansProjects\\JAVAApplications\\src\\swing1\\logo.png");
    //frame.getContentPane().setBackground(Color.red);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(200,10, 800, 700);
    frame.setTitle("Register Form");
    frame.setIconImage(icon.getImage());
    frame.setResizable(false);
    
    JLabel l1=new JLabel("User Name :");
    JLabel l2=new JLabel("Password: ");
    JTextField t1=new JTextField("User Name");
    JTextField t2=new JTextField("Password");
    
    l1.setBounds(10,20, 100,10);
    l2.setBounds(10,30, 100, 10);
    t1.setBounds(100,20,100,10);
    t2.setBounds(100,30,100,10);
    
    frame.add(l1);
    frame.add(l2);
    frame.add(t1);
    frame.add(t2);
    
    }
    
}
