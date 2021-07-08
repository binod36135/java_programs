package swing2;
import javax.swing.*;
import java.awt.*;
public final class Frame {
    private JFrame f;
    //private JPanel p;
    private JButton b1;
    private JLabel l1, l2, l3,l4,l5,l6;
    private JTextField t1, t2;
    private JComboBox c1,c2,c3;
    private JRadioButton r1,r2;
    private ButtonGroup bg;
    private JCheckBox cb1,cb2,cb3;
    private final Integer day[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
    private final String month[]={"jan","feb","march","April","may","june","july","augest","sep","oct","dec"};
    private final Integer year[]={1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004};
    
    public Frame(){
        gui();
    }
    
    public void gui(){
        f=new JFrame("Register Form");
        f.setVisible(true);
        f.setLayout(null);
        f.setBounds(450,50, 500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c=f.getContentPane();
        c.setLayout(null);
        c.setVisible(true);
        c.setBounds(5,5,390,490);
        c.setBackground(Color.green);
           
        /*
        p=new JPanel();
        p.setBackground(Color.green);
        p.setLayout(null);
        p.setVisible(true);
        p.setBounds(5,5,400,450);
        */
        
        l1=new JLabel("Name:");
        l2=new JLabel("Address:");
        l3=new JLabel("Gender: ");
        l4=new JLabel("DOB: ");
        l5=new JLabel("Insurence: "); 
        l6=new JLabel("Accept");
        
        t1=new JTextField();
        t2=new JTextField();
        
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        r1.setEnabled(true);
        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        
        c1=new JComboBox(day);
        c2=new JComboBox(month);
        c3=new JComboBox(year);
        
        cb1=new JCheckBox("Yes");
        cb2=new JCheckBox("No");
        
        b1=new JButton("Submit");
                
        l1.setBounds(10,10, 100,30);
        l2.setBounds(10,60, 100,30);
        l3.setBounds(10,100,100,30);
        l4.setBounds(10,140,100,30);
        l5.setBounds(10,180,100,30);
        l6.setBounds(20,220,300,30);
        
        t1.setBounds(110, 10, 250, 30);
        t2.setBounds(110, 60, 250, 30);
        
        r1.setBounds(110,100,100,30);
        r2.setBounds(150,100,100,30);
        
        c1.setBounds(110,140,100,30);
        c2.setBounds(200,140,100,30);
        c3.setBounds(290,140,100,30);
        
        cb1.setBounds(110,180,100,30);
        cb2.setBounds(200,180,100,30);
        cb3.setBounds(25,220,40,30);
        
        b1.setBounds(10, 260, 100, 30);
        
       
        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(l4);
        c.add(l5);
        c.add(l6);
        
        c.add(t1);
        c.add(t2);
        
        c.add(r1);
        c.add(r2);
                
        c.add(c1);
        c.add(c2);
        c.add(c3);
        
        c.add(cb1);
        c.add(cb2);
        c.add(cb3);
        
        c.add(b1);
        
        f.add(c);
        
        
    }
    public static void main(String[] args){
        new Frame();
    }
    
}
