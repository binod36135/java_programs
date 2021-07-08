/*
 Write an event code that display student data into another windows
 */
package Sentop_2019;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EventDemo{
   private JFrame f;
   private JTextField t1;
   private JButton b1;
   
   EventDemo(){
       gui();
   }
   public void gui(){
       f=new JFrame("Student  Data");
       f.setBounds(500,50,400,500);
       f.setVisible(true);
       f.setLayout(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       Container p=f.getContentPane();
       p.setVisible(true);
       
       t1=new JTextField(20);                   t1.setBounds(5,50,350,40);
       b1=new JButton("Open in New Window");    b1.setBounds(5,100,350,40);
       
       p.add(t1);
       p.add(b1);
       
       f.add(p);
       
       b1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               action(e);
           }
       });
       
        
   }
   public void action(ActionEvent e){
       
   }
   
}
public class A4Oxfordb {
    public static void main(String[] args){
        new EventDemo();
    }
    
}
