package excersice1;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.sql.*;
/*
<applet code='AppletDemo' with='600' height='700'></applet>
*/
public class AppletDemo1 extends Applet implements ActionListener {
    private Label l1, l2, l3, l4, l5, l6;
    private TextField t1, t2, t3, t4;
    private Button b1, b2;
    private CheckboxGroup genderGroup; 
    private Checkbox male;
    private Checkbox female;
    
    private String message = "gautama";
    
    //data
    private String fullName;
    private String email;
    private String password;
    private String gender;
    private String languageKnown;
            
    
    
    private List languageList;
    private String[] languages = {"Nepali", "Hindi", "English"};
  
    public void init ()
    {
        setLayout (new GridLayout (7, 2));
        
        l1 = new Label ("Name");
        t1 = new TextField (25);
        
        l2 = new Label ("Email");
        t2 = new TextField (25);
        
        l3 = new Label ("Password");
        t3 = new TextField (25);
        t3.setEchoCharacter('*');
        
        l4 = new Label ("gender");
        genderGroup = new CheckboxGroup ();
        male = new Checkbox("Male", genderGroup, true);
        female = new Checkbox("Female", genderGroup, false);
        l5 = new Label (" ");
        
        l6 = new Label("Lanaguaes");
        languageList = new List (1);
        languageList.add (languages[0]);
        languageList.add (languages[1]);
        languageList.add (languages[2]);
        
        b1 = new Button ("Signup");
        b2 = new Button ("Cancle");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add (male);
        add(l5); add (female);
        add(l6); add (languageList);
        add(b1); add(b2);
        
      Frame f = (Frame) this.getParent().getParent ();
      f.setTitle ("User Registration Form");
     }
    
    @Override
    public  void actionPerformed (ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            message = "signup has been clicked";
            repaint ();
            fullName = t1.getText();
            email = t2.getText();
            password = t3.getText();
            
            if (male.getState() == true)
            {
                gender = "Male";
            }
            else
            {
                gender = "Femal";
            }
            
            languageKnown = languageList.getSelectedItem();
            save ();
            clear ();
        }
        else if (e.getSource() == b2)
        {
            clear ();
       repaint ();
        }
        else
        {
            message = "does not working";
            repaint ();
        }
                
    }
    
    public void paint (Graphics g)
    {
        showStatus(message);
    }
    
    public void clear ()
    {
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
    
    public void save ()
    {
        // database connection
        try
        {
            Class.forName ("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/users", "root", "");
            String sql = "insert into register  (full_name, email, password, gender, language_known) values (?, ?, ?, ?, ?)";
            PreparedStatement prp = con.prepareStatement (sql);
            prp.setString (1, fullName);
            prp.setString(2, email);
            prp.setString (3, password);
            prp.setString (4, gender);
            prp.setString(5, languageKnown);
            prp.executeUpdate ();
            
            message = "success";
            return;
        }
        catch (Exception e)
        {
            message = "Sql error: " + e;
        }
        return;
    }
}

