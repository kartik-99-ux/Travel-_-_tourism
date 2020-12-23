
package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class LogIn extends JFrame implements ActionListener
{   JButton b,b2,b3;
    JTextField t;
    JPasswordField t2;
  
  LogIn()
  {  
   
      
      setLayout(null);
      getContentPane().setBackground(Color.WHITE);
     setBounds(500,300,900,400);
     JPanel p=new JPanel();
      p.setBounds(0, 0, 400, 400);
      p.setBackground(new Color(131,193,233));
      p.setLayout(null);
      add(p);
      ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/login.png"));
      Image i1=img1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
      ImageIcon img2=new ImageIcon(i1);
      JLabel j=new JLabel(img2);
      j.setBounds(100,120,200,200);
       p.add(j);
       JPanel p2=new JPanel();
       p2.setLayout(null);
       p2.setBounds(400,30,450, 300);
       add(p2);
       JLabel l2=new JLabel("Username");
       l2.setBounds(60,20 ,100,25);
       l2.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       p2.add(l2);
        t=new JTextField();
       t.setBounds(60,60,300,30);
       t.setBorder(BorderFactory.createEmptyBorder());
       p2.add(t);
      JLabel l3=new JLabel("password");
       l3.setBounds(60,110 ,100,25);
       l3.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       p2.add(l3);
        t2=new JPasswordField();
       t2.setBounds(60,150,300,30);
       t2.setBorder(BorderFactory.createEmptyBorder());
       p2.add(t2);
        
      b=new JButton("Login");
      b.setBounds(60,200,130,30);
      b.setBackground(new Color(131,193,233));
      b.setForeground(Color.white);
      b.setBorder(BorderFactory.createEmptyBorder());
      b.addActionListener(this);
      p2.add(b);
      
      b2=new JButton("Signin");
      b2.setBounds(280,200,130,30);
      b2.setBackground(Color.WHITE);
      b2.setForeground(Color.BLUE);
      b2.setBorder(BorderFactory.createEmptyBorder());
      b2.setBorder(new LineBorder(new Color(131,193,233)));
      b2.addActionListener(this);
      p2.add(b2);
      JLabel jl=new JLabel("trouble in login......");
      jl.setBounds(50, 250,100,25);
      jl.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
      jl.setForeground(Color.RED);
      p2.add(jl);
      b3=new JButton("Forget password");
      b3.setBounds(230,250,130,30);
      b3.setBackground(Color.WHITE);
      b3.setForeground(Color.BLUE);
      b3.addActionListener(this);
      p2.add(b3);
      
      
       
       
     
       
       
     setVisible(true);

  }
       public static void main(String arg[])
     {
       new LogIn();
     }
      // String user=t.getText();
    @Override
    public void actionPerformed(ActionEvent ae) 
    { 
      if(ae.getSource()==b2)
      {      this.setVisible(false);
            new signup().setVisible(true);
          
         
      }
      else if(ae.getSource()==b)
      {
          try
          {
              String username=t.getText();
              String password=t2.getText();
              String Query="SELECT * FROM account WHERE username='"+username+"' AND password='"+password+"'";
              conn c=new conn();
              ResultSet rs=c.s.executeQuery(Query);
              if(rs.next())
              {
                 new Loading(username).setVisible(true);
                  
              }
             else
              {
                  JOptionPane.showMessageDialog(null, "invalid log in");
              }
              
          }
          catch(Exception e)
          {
              
          }
      }
      else if(ae.getSource()==b3)
      {
          this.setVisible(false);
          new ForgetPassword().setVisible(true);
      }
      
    }
    
    
    
}
