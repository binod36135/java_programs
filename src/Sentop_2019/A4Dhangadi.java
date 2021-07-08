/*
 Write down the swing code to display user register page assume any social media networking site. 
 */
package Sentop_2019;
import javax.swing.*;
import java.awt.*;
public class A4Dhangadi {
    public static void main(String [] args){
       new Register(); 
    }
    
}
class Register{
    private JFrame f;
    private JPanel p;
    private JLabel name;
    private JTextField t1;
    private JLabel address;
    private JTextField t2;
    private JLabel phoneNumber;
    private JTextField t3;
    private JButton register;
    
    Register(){
        init();
    }
    public void init(){
        GridBagConstraints layout = new GridBagConstraints(); 
        layout.insets=new Insets(10,10,10,10);
        
        f=new JFrame("Register Form");
        f.setVisible(true);
        f.setBounds(200,50,500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p=new JPanel();
        p.setVisible(true);
        p.setBackground(Color.cyan);
            
                   
        name=new JLabel("Full Name:");
        address=new JLabel("Address:");
        phoneNumber=new JLabel("Phone:");
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        register=new JButton("Register");
        
        layout.gridx=0;
        layout.gridy=0;
        p.add(name,layout);
        layout.gridx=1;
        layout.gridy=0;
        p.add(t1,layout);
        layout.gridx=0;
        layout.gridy=1;
        p.add(address,layout);
        layout.gridx=1;
        layout.gridy=1;
        p.add(t2,layout);
        layout.gridx=0;
        layout.gridy=2;
        p.add(phoneNumber,layout);
        layout.gridx=1;
        layout.gridy=2;
        p.add(t3,layout);
        layout.gridx=0;
        layout.gridy=4;
        p.add(register,layout);
        
        f.add(p);
                
    }
        
}

