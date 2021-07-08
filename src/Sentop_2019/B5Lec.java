/*
 Write a java frame application called myFrame containing 2 labels having the name
"username" for label1 and "password" fro label 2 and also provinde text area for respective label.
Also add a buton with name "login".
 */
package Sentop_2019;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
public class B5Lec {
    public static void main(String[] args){
        new Login();
    }
    
}
class Login{
    private JFrame f;
    private JLabel name;
    private JTextField t1;
    private JLabel password;
    private JTextField t2;
    private JButton login;
    
    public Login(){
        init();
    }
    public void init(){
        f=new JFrame("Login Form");
        f.setVisible(true);
        f.setLayout(null);
        f.setBounds(450,200,400,250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container p=f.getContentPane();
        p.setVisible(true);
        p.setLayout(null);
        p.setBackground(Color.cyan);
        
        name=new JLabel("Username:");       t1=new JTextField(25);
        password=new JLabel("Password");    t2=new JTextField(25);
        login=new JButton("Login");
        
        name.setBounds(10,10,100,30);     t1.setBounds(150,10,200,30);
        password.setBounds(10,50,100,30); t2.setBounds(150,50,200,30);
        login.setBounds(10,100,100,30);
        
        p.add(name);
        p.add(password);
        p.add(t1);
        p.add(t2);
        p.add(login);
        
        f.add(p);
        
    }
}
