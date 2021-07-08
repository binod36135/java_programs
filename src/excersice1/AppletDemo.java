package excersice1;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
 
//<applet code='AppletDemo' with='600' height='600'></applet>
public class AppletDemo extends Applet  {
    //private JPanel p;
    private GridBagConstraints gbc;
    private JLabel l1;
    private JLabel l2;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;
       
    @Override
    public void init(){
       
       // p=new JPanel(new GridBagLayout());
        gbc=new GridBagConstraints();
        l1=new JLabel("Username:");     
        l2=new JLabel("Password:");     
        t1=new JTextField(10);            
        t2=new JTextField(10);         
        b1=new JButton("Login");   
        
    }
    @Override
        public void start(){
           
        
       // p.setVisible(true);
       // p.setBackground(Color.LIGHT_GRAY);
        
        
        gbc.insets=new Insets(5,5,5,5);
        
        gbc.gridx=0;
        gbc.gridy=0;
        add(l1,gbc);
        gbc.gridx=2;
        gbc.gridy=0;
        add(t1,gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        add(l2,gbc);
        gbc.gridx=2;
        gbc.gridy=2;
        add(t2,gbc);
        gbc.gridx=0;
        gbc.gridy=4;
        add(b1,gbc);
        
        }
          
     }
   
    
      
        
    
   
    
   
            


