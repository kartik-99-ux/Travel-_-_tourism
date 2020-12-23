

package travel_._tourism;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class signup extends JFrame  implements ActionListener
{   JButton B1,B2;
      JTextField t1,t2,t3,t4;
      Choice ch;
    signup()
    {   this.setLayout(null);
      setBounds(600, 250, 900, 400);
      this.getContentPane().setBackground(Color.white);
      JPanel p=new JPanel();
      p.setLayout(null);
      p.setBounds(0,0, 500, 400);
      p.setBackground(new Color(133,193,233));
      add(p);
      JLabel j1=new JLabel("Username");
      j1.setBounds(50,20, 125, 25);
      j1.setFont(new Font("Tahoma",Font.BOLD,14));
      p.add(j1);
      t1=new JTextField();
      t1.setBounds(190, 20, 200, 25);
      t1.setBorder(BorderFactory.createEmptyBorder());
      p.add(t1);
      JLabel j2=new JLabel("Name");
      j2.setBounds(50,60, 125, 25);
      j2.setFont(new Font("Tahoma",Font.BOLD,14));
      p.add(j2);
      t2=new JTextField();
      t2.setBounds(190, 60, 200, 25);
      t2.setBorder(BorderFactory.createEmptyBorder());
      p.add(t2);
      
        JLabel j3=new JLabel("password");
       j3.setBounds(50,100, 125, 25);
      j3.setFont(new Font("Tahoma",Font.BOLD,14));
      p.add(j3);
      t3=new JTextField();
      t3.setBounds(190, 100, 200, 25);
      t3.setBorder(BorderFactory.createEmptyBorder());
      p.add(t3);
      JLabel j4=new JLabel("Security question");
      j4.setBounds(50,140, 125, 25);
      j4.setFont(new Font("Tahoma",Font.BOLD,14));
      p.add(j4);
      
       ch=new Choice();
      ch.add("Your nick name");
      ch.add("your lucky number");
      ch.add("your hometown");
      ch.add("your favorate character");
      ch.setBounds(190, 140, 200, 25);
      p.add(ch);
      JLabel j5=new JLabel("Answer");
      j5.setBounds(50,180, 125, 25);
      j5.setFont(new Font("Tahoma",Font.BOLD,14));
      p.add(j5);
       t4=new JTextField();
      t4.setBounds(190, 180, 200, 25);
      t4.setBorder(BorderFactory.createEmptyBorder());
      p.add(t4);
       
      ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/signup.png"));
      Image i=img.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
      ImageIcon img1=new ImageIcon(i);
      JLabel j6=new JLabel(img1);
      j6.setBounds(580, 50,250,250);
     
      add(j6);
      B1=new JButton("Create");
      B1.setBounds(50,280, 100, 35);
      B1.setFont(new Font("Tahoma",Font.BOLD,14));
      B1.setBackground(Color.white);
      B1.setForeground(new Color(133,193,233));;
      B1.addActionListener(this);
      p.add(B1);
          
      B2=new JButton("Back");
      B2.setBounds(220,280, 100, 35);
      B2.setFont(new Font("Tahoma",Font.BOLD,14));
      B2.setBackground(Color.white);
     B2.setForeground(new Color(133,193,233));
     B2.addActionListener(this);
      p.add(B2);

      
      
      
    }

    
    public static void main(String arg[])
    {
         new signup().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {  
        if(ae.getSource()==B1)
        {
            String Username=t1.getText();
            String  name=t2.getText();
            String password=t3.getText();
            String security=ch.getSelectedItem();
            String ans=t4.getText();
           String query="INSERT INTO account(username,name,password,security,answer) VALUES('"+Username+"','"+name+"','"+password+"','"+security+"','"+ans+"')";
            try
            {
                conn c=new conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"You are register Succesfully");
               this.setVisible(false);
               new LogIn().setVisible(true);
            }
            catch(Exception e)
            {
                
            }
                    
            
        }
         if(ae.getSource()==B2)
         {
             new LogIn().setVisible(true);
             this.setVisible(false);
         }
    }
}
