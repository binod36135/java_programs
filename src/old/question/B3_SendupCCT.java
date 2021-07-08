package old.question;
//Write a program in Swing for signup form and save the data into the database.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class B3_SendupCCT {
    private JFrame f;
    private JLabel l1,l2,l3,l4;
    private JTextField t1,t2,t3,t4;
    private JButton b1;
    
    public B3_SendupCCT(){
        gui();
    }
    public void gui(){
        f=new JFrame("Sign Up Form");
        f.setLayout(null);
        f.setVisible(true);
        f.setBounds(100,50,400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=f.getContentPane();
        c.setLayout(null);
        c.setBounds(5,5,395,495);
        c.setBackground(Color.green);
        l1=new JLabel("First Name:");       t1=new JTextField();   
        l2=new JLabel("Last Name:");        t2=new JTextField();
        l3=new JLabel("Address:");          t3=new JTextField();
        l4=new JLabel("Phone Numbe:");      t4=new JTextField();
        l1.setBounds(10,10,200,30);         t1.setBounds(100,10,250,30);
        l2.setBounds(10,70,200,30);         t2.setBounds(100,70,250,30);
        l3.setBounds(10,130,200,30);        t3.setBounds(100,130,250,30);
        l4.setBounds(10,200,200,30);        t4.setBounds(100,200,250,30);
        b1=new JButton("Sign Up");          b1.setBounds(10,260,100,30);
        c.add(l1); c.add(l2); c.add(l3); c.add(l4); c.add(t1); c.add(t2);
        c.add(t3); c.add(t4); c.add(b1); f.add(c);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                submitAction(e);
            }
        });
     }
    public void submitAction(ActionEvent e){
        String firstName=t1.getText();
        String lastName=t2.getText();
        String address=t3.getText();
        long phoneNumber=Long.parseLong(t4.getText());
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/binoddatabase","root","root");
            Statement stmt=con.createStatement();
            stmt.executeUpdate
           ("insert into sabitatable" + " values('"+firstName+"',"
           + " '"+lastName+"', '"+address+"', '"+phoneNumber+"')");
            
            con.close();
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
                
    }
    public static void main(String[] args){
        new B3_SendupCCT();
    }
 }
