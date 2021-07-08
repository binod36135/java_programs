package old.question;
import javax.swing.*;
import java.awt.*;
//<APPLET CODE="A4_2018Fall HEIGHT=400 WIDTH=500> </APPLET>
public class A4_2018Fall {
    public static void main(String[] args) {
        new GridBagConstrantDemo();
    }
}
class GridBagConstrantDemo{
    private JFrame f;
    private JLabel name, address, gender,city;
    private JTextField nameField, addressField;
    private JRadioButton gRadio1, gRadio2;
    private JTextArea cityArea;
    private JButton submit, cancil;
    
    public GridBagConstrantDemo(){
        gui();
    }
    public void gui(){
        f=new JFrame("Grid bag constrant layout demo");
        f.setBounds(400,50,400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        JPanel p=new JPanel(new GridBagLayout());
        p.setVisible(true);
        p.setBackground(Color.LIGHT_GRAY);
        f.getContentPane().add(p, BorderLayout.NORTH);
               
        name=new JLabel("Enter Name:");         nameField=new JTextField("Enter Name");
        address=new JLabel("Enter Address:");   addressField=new JTextField("Enter Address");
        gender=new JLabel("Gender:");           gRadio1=new JRadioButton("Male");
                                                gRadio2=new JRadioButton("Female");
        city=new JLabel("City:");               cityArea=new JTextArea("Enter City");
        
        submit=new JButton("Submit");
        cancil=new JButton("Cancil");
                
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.insets=new Insets(10,10,10,10);
        
        gbc.gridx=0;
        gbc.gridy=0;
        p.add(name,gbc);
        gbc.gridx=0;
        gbc.gridy=1;
        p.add(address,gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        p.add(gender,gbc);
        gbc.gridx=0;
        gbc.gridy=3;
        p.add(city,gbc);
        gbc.gridx=0;
        gbc.gridy=6;
        p.add(submit,gbc);
        gbc.gridx=1;
        gbc.gridy=6;
        p.add(cancil,gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        p.add(nameField,gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        p.add(addressField,gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        p.add(gRadio1,gbc);
        gbc.gridx=2;
        gbc.gridy=2;
        p.add(gRadio2,gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        p.add(cityArea,gbc);
       
        
        f.add(p);
          
    }
}
