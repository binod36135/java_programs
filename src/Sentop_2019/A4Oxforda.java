/*
 WAP to read some customers information as customer id, name and address and store
into a database (table called tblcustomer) using applet
 */
package Sentop_2019;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
//<Applet code="A4Oxforda" height="500" width="600">
public class A4Oxforda extends Applet implements ActionListener {
    String message="";
    private String id;
    private TextField t1;
    private String name;
    private TextField t2;
    private String address;
    private TextField t3;
    private Button b1;
   
    GridBagConstraints layout = new GridBagConstraints();
    
    public void addAll(Component c, int x, int y){
        layout.gridx=x;
        layout.gridy=y;
        add(c, layout);
    }
    public void init(){
        setLayout(new GridBagLayout());
        addAll(new Label("ID:"),0,0);
        addAll(new Label("Name:"),0,1);
        addAll(new Label("Address:"),0,2);
        b1=new Button("Insert");
        addAll(b1,0,3);
        t1=new TextField(20);
        addAll(t1,1,0);
        t2=new TextField(20);
        addAll(t2,1,1);
        t3=new TextField(20);
        addAll(t3,1,2);
        
        b1.addActionListener(this);
    }
  @Override
     public  void actionPerformed (ActionEvent e)
    {
        if (e.getSource()==b1)
        {
            message = "save has been clicked";
            repaint ();
            id = t1.getText();
            name = t2.getText();
            address = t3.getText();
                     
            
            save ();
            
              
        }
    }
       
    public void save(){
        {
        // database connection
        try
        {
            Class.forName ("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/users", "root", "");
            String sql = "insert into register  (id, name, address,) values (?, ?, ?,)";
            PreparedStatement prp = con.prepareStatement (sql);
            prp.setString (1, id);
            prp.setString(2, name);
            prp.setString (3, address);
           
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
        
    } 



