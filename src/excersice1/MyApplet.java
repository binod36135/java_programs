package excersice1;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyApplet extends Applet implements ActionListener {
    String name=" ", gender=" ";
    int age;
    Label l1=new Label("Enter Name:");
    TextField tf=new TextField(20);
    Label l2=new Label("Select Gender:");
    CheckboxGroup g=new CheckboxGroup();
    Checkbox m=new Checkbox("Male",g,true);
    Checkbox f=new Checkbox("Female",g,false);
    Label l3=new Label("Age");
    Choice c=new Choice();
    Button b1=new Button("Submit");
    
    
    public void init(){
        add(l1);
        add(tf);
        add(l2);
        add(m);
        add(f);
        add(l3);
        c.add("19");
        c.add("20");
        c.add("21");
        c.add("22");
        add(c);
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g){
        g.drawString("Name:"+name,20,100);
        g.drawString("Gender"+gender, 20, 120);
        g.drawString("Age"+age,20,140);
    }
    public void actionPerformed(ActionEvent e){
        name=tf.getText();
        gender=g.getSelectedCheckbox().getLabel();
        age=Integer.parseInt(c.getSelectedItem());
        repaint();
    }
}
//<APPLET code="MyApplet.class" width="200" height=150"></APPLET>

