
package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
public class Updatecustomer extends JFrame implements ActionListener
{
      JTextField t, t1,t2,t3,t4,t5,t6,ti;
      JComboBox c;
      JRadioButton b1,b2;
      JButton BB1,BB2;
    
      Updatecustomer(String username)
    {   
        setLayout(null);
    
        setBounds(600, 250,850,550);
        getContentPane().setBackground(Color.WHITE);
        JLabel l=new JLabel("Update Details Here");
        l.setBounds(70,0,400,25);
        l.setForeground(Color.red);
        l.setFont(new Font("Tahoma",Font.BOLD,30));
        add(l);
        
        
        
        JLabel l1=new JLabel("Username  :");
        l1.setBounds(30,50,150,25);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        t1=new JTextField();
        t1.setBounds(220,50,150,25);
        add(t1);
               
        JLabel l2=new JLabel("ID             :");
        l2.setBounds(30,100,150,25);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l2);
        ti=new JTextField();
        ti.setBounds(220,100,150,25);
        add(ti);
               
     
        JLabel l3=new JLabel("Name  :");
        l3.setBounds(30,150,150,25);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l3);
        t2=new JTextField();
        t2.setBounds(220,150,150,25);
        add(t2);
               
        JLabel l4=new JLabel("Number  :");
        l4.setBounds(30,200,150,25);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l4);
        t3=new JTextField();
        t3.setBounds(220,200,150,25);
        add(t3);
        JLabel l5=new JLabel("Gender  :");
        l5.setBounds(30,250,150,25);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l5);
        t=new JTextField();
        t.setBounds(220,250,150,25);
        add(t);
        
        JLabel l6=new JLabel("Country  :");
        l6.setBounds(30,300,150,25);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l6);
        t4=new JTextField();
        t4.setBounds(220,300,150,25);
        add(t4);
        JLabel l7=new JLabel("Address  :");
        l7.setBounds(30,350,150,25);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l7);
        t5=new JTextField();
        t5.setBounds(220,350,150,25);
        add(t5);
        JLabel l8=new JLabel("Email  :");
        l8.setBounds(30,400,150,25);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l8);
         t6=new JTextField();
        t6.setBounds(220,400,150,25);
        add(t6);
        BB1=new JButton("Update");
        BB1.setBounds(100,450,100,35);
        BB1.setBackground(Color.BLACK);
        BB1.setForeground(Color.WHITE);
        BB1.addActionListener(this);
        add(BB1);
         BB2=new JButton("Back");
        BB2.setBounds(250,450,100,35);
        BB2.setBackground(Color.BLACK);
        BB2.setForeground(Color.WHITE);
        BB2.addActionListener(this);
        add(BB2);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/update.png"));
        Image i=img1.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(i);
        JLabel l9=new JLabel(img2);
        l9.setBounds(420,50,420,400);
        add(l9);
                
        try
        {
            conn c=new conn();
             ResultSet rs=c.s.executeQuery("SELECT * FROM Coustomer WHERE username='"+username+"' ");
           while(rs.next())
           {
               t1.setText(rs.getString("username"));
               ti.setText(rs.getString("id"));
               t2.setText(rs.getString("name"));
               t3.setText(rs.getString("number"));
               t.setText(rs.getString("gender"));
               t4.setText(rs.getString("country"));
               t5.setText(rs.getString("address"));
               t6.setText(rs.getString("email"));
               
           }
        }
        catch(Exception e){}
       
        
     
    
}
      public static void main(String arg[])
      {
          new Updatecustomer("").setVisible(true);
      }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
         String username=t1.getText();
        String id=ti.getText();
        String name=t2.getText();
        String number=t3.getText();
        String gender =t.getText();
        String country =t4.getText();
        String address=t5.getText();
        String email=t6.getText();
        String q="UPDATE Coustomer SET username='"+username+"',id='"+id+"',name='"+name+"',number='"+number+"',gender='"+gender+"',country='"+country+"',address='"+address+"',email='"+email+"' WHERE username='annu'";
           if(ae.getSource()==BB1)
        {
          try
          {
           conn c=new conn();
           c.s.executeUpdate(q);
           JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY");
           this.setVisible(false);
          
          }
           catch(Exception e){}

        }
         
    }

 
}
