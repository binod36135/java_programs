package swing2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Form {
    private JFrame f;
    private JLabel l1,l2,l3,l4,l5,l6;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;
    private JRadioButton rb1,rb2;
    private JComboBox cb1,cb2,cb3;
    private final Integer day[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
    private final String month[]={"jan","feb","march","April","may","june","july","augest","sep","oct","dec"};
    private final Integer year[]={1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004};
    private JCheckBox check1,check2;
    private ButtonGroup bg;
    private JTextArea ta1;
    
    public Form(){
        gui();
    }
    public void gui(){
        f=new JFrame("Register Form");
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(480,100,400,500);
        
        Container c=f.getContentPane();
        c.setLayout(null);
        c.setBounds(5,5,300,300);
        c.setBackground(Color.GREEN);
        
        l1=new JLabel("Name: ");             t1=new JTextField();
        l2=new JLabel("Address: ");          t2=new JTextField();
        l3=new JLabel("Insurance");          check1=new JCheckBox();
        l4=new JLabel("Gender: ");           rb1=new JRadioButton("Male",true);
                                             rb2=new JRadioButton("Female");
                                             bg=new ButtonGroup();
                                             bg.add(rb1); bg.add(rb2);
        l5=new JLabel("DOB: ");              cb1=new JComboBox(day);
                                             cb2=new JComboBox(month);
                                             cb3=new JComboBox(year);
        l6=new JLabel("Accept Terms and Conditions");   check2=new JCheckBox();
              
        b1=new JButton("Submit");
        ta1=new JTextArea();
               
        l1.setBounds(10,10,90,30);      t1.setBounds(100,10,270,30);
        l2.setBounds(10,50,90,30);      t2.setBounds(100,50,270,30);
        l3.setBounds(35,90,90,30);      check1.setBounds(10,90,20,30);
        l4.setBounds(10,130,90,30);     rb1.setBounds(70,130,60,30);
                                        rb2.setBounds(140,130,80,30);
        l5.setBounds(10,180,90,30);     cb1.setBounds(70,180,40,30);
                                        cb2.setBounds(115,180,80,30);
                                        cb3.setBounds(202,180,60,30);
        l6.setBounds(35,220,200,30);    check2.setBounds(10,220,20,30);
        
        b1.setBounds(10,260,80,30);
        ta1.setBounds(10,300,360,150);
       
        
        c.add(l1);c.add(l2);c.add(l3);c.add(l4);c.add(l5); c.add(l6);
        c.add(t1);c.add(t2);
        c.add(rb1);c.add(rb2);
        c.add(check1);c.add(check2);
        c.add(cb1);c.add(cb2);c.add(cb3);
        c.add(b1);
        c.add(ta1);
        f.add(c);
       
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                submit_action(e);
            }
        });
        
    }
    public void submit_action(ActionEvent e1){
        String name=t1.getText();
        if(check2.isSelected()){
            String address=t2.getText();
            String ins="No";
            if(check1.isSelected()==true)
                ins="Yes";
            String gen="Male";
            if(rb2.isSelected()==true)
                gen="Female";
            Integer day1=(Integer)cb1.getSelectedItem();
            String month1=(String)cb2.getSelectedItem();
            Integer year1=(Integer)cb3.getSelectedItem();
            ta1.setText("Name :"+name+"\nAddress: "+address+"\nInsurance: "+ins+
            "\nGender: "+gen+"\nDOB :"+month1+" "+day1+","+year1);
        }else{
            ta1.setText("Please cick on Terms and Conditions "+name);
        }
    }
    public static void main(String[] args){
        new Form();
    }
    
}
