package swing2;
import javax.swing.*;
public class TextField {
    private JTextField t;
    private JFrame f;
    
    public TextField(){
        gui();
    }
    public void gui(){
        t=new JTextField("This is text field");
        f=new JFrame();
        f.setBounds(100,200, 400,500);
        f.setVisible(true);
        f.add(t);
    }
    public static void main(String[] args){
        new TextField();
    }
    
    
}
