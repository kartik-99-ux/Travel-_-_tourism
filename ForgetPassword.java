
package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.*;


public class ForgetPassword extends JFrame implements ActionListener
{     JTextField t1,t2,t3,t4;
        JTextField t5;
      JButton b1,b2,b3,b4,b5;
     ForgetPassword ()
     {    setLayout(null);
         setBounds(550,250,850,400);
         this.getContentPane().setBackground(Color.white);
         JPanel j=new JPanel();
         j.setLayout(null);
         j.setBounds(30,30, 500,300 );
         JLabel l=new JLabel("Username");
         l.setBounds(40,30, 100, 25);
         l.setFont(new Font("Tahoma",Font.BOLD,14));
         j.add(l);
         t1=new JTextField();
         t1.setBounds(220,30 ,180, 25);
         t1.setBorder(BorderFactory.createEmptyBorder());
         j.add(t1);
         b1=new JButton("search");
         b1.setBounds(417, 30, 80,25);
         b1.setBackground(Color.DARK_GRAY);
         b1.setForeground(Color.white);
         b1.setBorder(BorderFactory.createEmptyBorder());
         b1.addActionListener(this);
         j.add(b1);
         JLabel l2=new JLabel("Name");
         l2.setBounds(40,80, 100, 25);
         l2.setFont(new Font("Tahoma",Font.BOLD,14));
         j.add(l2);
         t2=new JTextField();
         t2.setBounds(220,80 ,180, 25);
         t2.setBorder(BorderFactory.createEmptyBorder());
         j.add(t2);
    
       
         JLabel l3=new JLabel("Security Question");
         l3.setBounds(40,120, 150, 25);
         l3.setFont(new Font("Tahoma",Font.BOLD,14));
         j.add(l3);
         t3=new JTextField();
         t3.setBounds(220,120 ,180, 25);
         t3.setBorder(BorderFactory.createEmptyBorder());
         j.add(t3);
     
          JLabel l4=new JLabel("Answer");
         l4.setBounds(40,160, 100, 25);
         l4.setFont(new Font("Tahoma",Font.BOLD,14));
         j.add(l4);
         t4=new JTextField();
         t4.setBounds(220,160 ,180, 25);
         t4.setBorder(BorderFactory.createEmptyBorder());
         j.add(t4);
         b4=new JButton("Retrieve");
         b4.setBounds(417, 160, 80,25);
         b4.setBackground(Color.DARK_GRAY);
         b4.setForeground(Color.white);
         b4.setBorder(BorderFactory.createEmptyBorder());
         b4.addActionListener(this);
         j.add(b4);
          JLabel l5=new JLabel("password");
           l5.setBounds(40,200, 100, 25);
           
           j.add(l5);
         t5=new JTextField();
         t5.setBounds(220, 200,180,25);
         l5.setFont(new Font("Tahoma",Font.BOLD,14));
         t5.setBorder(BorderFactory.createEmptyBorder());
         j.add(t5);
         b5=new JButton("submit");
         b5.setBounds(230, 260, 80,25);
         b5.setBackground(Color.RED);
         b5.setForeground(Color.white);
         b5.setBorder(BorderFactory.createEmptyBorder());
         b5.addActionListener(this);
         j.add(b5);
         add(j);
         
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/forgotpassword.jpg"));
         Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         
         JLabel l6=new JLabel(i3);
         l6.setBounds(520, 20,300,300);
         add(l6);
        
       
         
         
         this.setVisible(true);
     }
     
     public static void main(String arg[])
     {
         new  ForgetPassword ();
     }

    @Override
    public void actionPerformed(ActionEvent ae)
    {  

       if(ae.getSource()==b1)
       {
         try
        {
        conn c=new conn();
       String sql="SELECT * FROM account WHERE USERNAME ='"+t1.getText()+"'";
       c.s.executeQuery(sql);
       ResultSet rs=c.s.executeQuery(sql);
       while(rs.next())
       {
          t2.setText(rs.getString("name"));
          t3.setText(rs.getString("security"));
          
        }
        }
          catch(Exception e)
        {
            
        }
       }
       
       else if(ae.getSource()==b4)
       {
           
          
           try
        {
        conn c=new conn();
       String sql="SELECT * FROM account WHERE  answer='"+t4.getText()+"' AND  USERNAME ='"+t1.getText()+"'";
       c.s.executeQuery(sql);
       ResultSet rs=c.s.executeQuery(sql);
       while(rs.next())
       {
          t5.setText(rs.getString("password"));
         
        }
        }
          catch(Exception e)
        {
            
        }
       }
       else if(ae.getSource()==b5)
       {
           this.setVisible(false);
           new LogIn().setVisible(true);
           
       }
    }
      
    }

