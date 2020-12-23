

package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener
{
     JButton  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13, b14,b15;
     String username;
      Dashboard(String username)
      {  this.username=username;
          setLayout(null);
          setExtendedState(JFrame.MAXIMIZED_BOTH);
          JPanel p1=new JPanel();
          p1.setLayout(null);
          p1.setBounds(0,0,1950,80);
          p1.setBackground(new Color(0,0,103));
          add(p1);
          ImageIcon img3=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/dash.jpg"));
          Image i2=img3.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
          ImageIcon img4=new ImageIcon(i2);
          JLabel l2=new JLabel(img4);
          l2.setBounds(0,3,70,70);
          p1.add(l2);
          
          JLabel l3=new JLabel("Let's Go!!");
          l3.setBounds(80,10,300,40);
          l3.setFont(new Font("Tahoma",Font.BOLD,30));
          l3.setForeground(Color.white);
          p1.add(l3);
          
          JPanel p2=new JPanel();
          p2.setLayout(null);
          p2.setBounds(0,65, 300,1000);
          p2.setBackground(new Color(0,0,103));
          add(p2);
         b1=new JButton("Add personson Details");
         b1.setBounds(0,0,300,50);
         //b1.setBorder(BorderFactory.createEmptyBorder());
         b1.setBackground(new Color(0,0,103));
         b1.setForeground(Color.white);
         b1.setFont(new Font("Tahoma",Font.PLAIN,20));
         b1.setMargin(new Insets(0,0,0,60));
         b1.addActionListener(this);
         p2.add (b1);
         b2=new JButton("Update personson Details");
         b2.setBounds(0,50,300,50);
         b2.setBackground(new Color(0,0,103));
         b2.setForeground(Color.white);
         b2.setFont(new Font("Tahoma",Font.PLAIN,20));
         b2.setMargin(new Insets(0,0,0,30));
        b2.addActionListener(this);
         p2.add (b2);
             JButton b3=new JButton("Check Details");
         b3.setBounds(0,100,300,50);
         b3.setBackground(new Color(0,0,103));
         b3.setForeground(Color.white);
         b3.setFont(new Font("Tahoma",Font.PLAIN,20));
          b3.setMargin(new Insets(0,0,0,130));
            b3.addActionListener(this);
         p2.add (b3);
         b4=new JButton("Delete personsonal Details");
         b4.setBounds(0,150,300,50);
         b4.setBackground(new Color(0,0,103));
         b4.setForeground(Color.white);
         b4.setFont(new Font("Tahoma",Font.PLAIN,20));
         // b4.setMargin(new Insets(0,0,0,100));
           b4.addActionListener(this);
         p2.add (b4);
         b5=new JButton("Check Package");
         b5.setBounds(0,200,300,50);
         b5.setBackground(new Color(0,0,103));
         b5.setForeground(Color.white);
         b5.setFont(new Font("Tahoma",Font.PLAIN,20));
          b5.setMargin(new Insets(0,0,0,120));
            b5.addActionListener(this);
         p2.add (b5);
          b6=new JButton("Book Package");
         b6.setBounds(0,250,300,50);
         b6.setBackground(new Color(0,0,103));
         b6.setForeground(Color.white);
         b6.setFont(new Font("Tahoma",Font.PLAIN,20));
          b6.setMargin(new Insets(0,0,0,120));
            b6.addActionListener(this);
         p2.add (b6);
         b7=new JButton("View Hotels");
         b7.setBounds(0,300,300,50);
         b7.setBackground(new Color(0,0,103));
         b7.setForeground(Color.white);
         b7.setFont(new Font("Tahoma",Font.PLAIN,20));
          b7.setMargin(new Insets(0,0,0,130));
            b7.addActionListener(this);
         p2.add (b7);
         b8=new JButton("Book Here");
         b8.setBounds(0,350,300,50);
         b8.setBackground(new Color(0,0,103));
         b8.setForeground(Color.white);
         b8.setFont(new Font("Tahoma",Font.PLAIN,20));
          b8.setMargin(new Insets(0,0,0,130));
            b8.addActionListener(this);
         p2.add (b8);
         b9=new JButton("Hotel Details");
         b9.setBounds(0,400,300,50);
         b9.setBackground(new Color(0,0,103));
         b9.setForeground(Color.white);
         b9.setFont(new Font("Tahoma",Font.PLAIN,20));
         b9.setMargin(new Insets(0,0,0,120));
         b9.addActionListener(this);
         p2.add (b9);
         b10=new JButton("Destinations");
         b10.setBounds(0,450,300,50);
         b10.setBackground(new Color(0,0,103));
         b10.setForeground(Color.white);
         b10.setFont(new Font("Tahoma",Font.PLAIN,20));
         b10.setMargin(new Insets(0,0,0,130));
         b10.addActionListener(this);
         p2.add (b10);
         b11=new JButton("Payment");
         b11.setBounds(0,500,300,50);
         b11.setBackground(new Color(0,0,103));
         b11.setForeground(Color.white);
         b11.setFont(new Font("Tahoma",Font.PLAIN,20));
         b11.setMargin(new Insets(0,0,0,140));
           b11.addActionListener(this);
         p2.add (b11);
         b12=new JButton("View Package");
         b12.setBounds(0,550,300,50);
         b12.setBackground(new Color(0,0,103));
         b12.setForeground(Color.white);
         b12.setFont(new Font("Tahoma",Font.PLAIN,20));
         b12.setMargin(new Insets(0,0,0,130));
         b12.addActionListener(this);
         p2.add (b12);
              b13=new JButton("Calculator");
         b13.setBounds(0,600,300,50);
         b13.setBackground(new Color(0,0,103));
         b13.setForeground(Color.white);
         b13.setFont(new Font("Tahoma",Font.PLAIN,20));
          b13.setMargin(new Insets(0,0,0,140));
            b13.addActionListener(this);
         p2.add (b13);
          b14=new JButton("Notepad");
         b14.setBounds(0,650,300,50);
         b14.setBackground(new Color(0,0,103));
         b14.setForeground(Color.white);
         b14.setFont(new Font("Tahoma",Font.PLAIN,20));
          b14.setMargin(new Insets(0,0,0,140));
            b14.addActionListener(this);
         p2.add (b14);
          b15=new JButton("About");
         b15.setBounds(0,700,300,50);
         b15.setBackground(new Color(0,0,103));
         b15.setForeground(Color.white);
         b15.setFont(new Font("Tahoma",Font.BOLD,20));
          b15.setMargin(new Insets(0,0,0,130));
         b15.addActionListener(this);
         p2.add (b15);
         
         JLabel l4=new JLabel("Travel and Tourism Management System");
         l4.setBounds(800,80,1500,100);
         l4.setFont(new Font("Tahoma",Font.PLAIN,30));
         l4.setForeground(Color.white);
         add(l4);
         
          
          ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/home.jpg"));
          Image i=img.getImage().getScaledInstance(1950,1000,Image.SCALE_DEFAULT);
          ImageIcon img2=new ImageIcon(i);
          JLabel l=new JLabel(img2);
          l.setBounds(0,0,1950,1000);
          add(l);
    
          this.setVisible(true);
      }
    public static void main(String arg[])
    {
        new Dashboard("");
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource()==b13)
         {
                try
                {
                     Runtime.getRuntime().exec("calc.exe");
                }
                catch(Exception e){}
         }
         else if(ae.getSource()==b14)
         {
                try
                {
                     Runtime.getRuntime().exec("notepad.exe");
                }
                catch(Exception e){}
         }
         else if(ae.getSource()==b1)
         {
           new  AddCoustomer(username).setVisible(true);
         }
         else if(ae.getSource()==b2)
         {
             new Updatecustomer(username).setVisible(true);
         }
         else if(ae.getSource()==b5)
         {
             new checkpackage().setVisible(true);
         }
         else if(ae.getSource()==b6)
         {
             new Bookpackage(username).setVisible(true);
         }
         else if(ae.getSource()==b12)
         {
             new viewpackage(username).setVisible(true);
         }
         else if(ae.getSource()==b7)
         {
             new viewHotels().setVisible(true);
         }
         else if(ae.getSource()==b10)
         {
             new Destination().setVisible(true);
         }
         else if(ae.getSource()==b8)
         {
             new BookHotel(username).setVisible(true);
         }
         else if(ae.getSource()==b9)
         {
             new viewYourbooking(username).setVisible(true);
         }
          else if(ae.getSource()==b11)
         {
             new payment().setVisible(true);
         }
              else if(ae.getSource()==b15)
         {
             new about().setVisible(true);
         }
             
            else if(ae.getSource()==b4)
         {
             new Delete(username).setVisible(true);
         }
             
         
         
         
    }
}
