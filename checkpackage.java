
package travel_._tourism;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class checkpackage  extends JFrame
{
    checkpackage()
    {
      
String pack[]={"GOLD PACKAGE","6 days and 7 nights","Airport Assistance","Half Day Tour","Daily Buffet","Welcome Drink on Arrival","Full Day 3 Island cruise","English speaking guide","Book now","Summer Special","12000-/₹","travel_/_tourism/icons/package1.jpg"}; 
String pack2[]={"SILVER PACKAGE","5 days and 6 nights","Toll free Entrance free Ticket","Meet and Greet at airport","Night Safari","Welcome Drink on Arrival"," full day Island cruise","Cruise with Dinner","Book now","Winter Special","24000-/₹","travel_/_tourism/icons/package2.jpg"};
String pack3[]={"BRONZE PACKAGE","4 days and 5 nights","","Half Day Tour","Horse Ridding","Return Airfare","stay in 5 star hotel","BBQ Dinner","Book now","Trip Special","36000-/₹","travel_/_tourism/icons/package3.jpg"};
JPanel p1=createJPanel(pack);
JPanel p2=createJPanel(pack2);
JPanel p3=createJPanel(pack3);
this.setBounds(650,250,900,600);
      JTabbedPane T=new JTabbedPane();
      T.addTab("Package 1",null,p1);
      T.addTab("Package 2",null,p2);
      T.addTab("Package 3",null,p3);
      this.add(T,BorderLayout.CENTER);
    }
    
     public JPanel createJPanel(String pack[])
      {
          JPanel p=new JPanel();
          p.setLayout(null);
          p.setBackground(Color.white);
          JLabel l1=new JLabel(pack[0]);
          l1.setBounds(50,5,300,40);
          l1.setFont(new Font("Tahoma",Font.PLAIN,32));
          p.add(l1);
          JLabel l2=new JLabel(pack[1]);
          l2.setBounds(30,60,300,32);
          l2.setForeground(Color.red);
          l2.setFont(new Font("Tahoma",Font.PLAIN,20));
          p.add(l2);
          JLabel l3=new JLabel(pack[2]);
          l3.setBounds(30,100,300,32);
          l3.setForeground(Color.BLUE);
          l3.setFont(new Font("Tahoma",Font.PLAIN,20));
          p.add(l3);
         JLabel l4=new JLabel(pack[3]);
          l4.setBounds(30,140,300,32);
          l4.setForeground(Color.red);
          l4.setFont(new Font("Tahoma",Font.PLAIN,20));
          p.add(l4);
          JLabel l6=new JLabel(pack[4]);
          l6.setBounds(30,180,300,32);
          l6.setForeground(Color.blue);
          l6.setFont(new Font("Tahoma",Font.PLAIN,20));
          p.add(l6);
         JLabel l7=new JLabel(pack[5]);
          l7.setBounds(30,220,300,32);
          l7.setForeground(Color.red);
          l7.setFont(new Font("Tahoma",Font.PLAIN,20));
          p.add(l7);
          JLabel l8=new JLabel(pack[6]);
          l8.setBounds(30,260,300,32);
          l8.setForeground(Color.blue);
          l8.setFont(new Font("Tahoma",Font.PLAIN,20));
          p.add(l8);
          JLabel l9=new JLabel(pack[7]);
          l9.setBounds(30,300,300,32);
          l9.setForeground(Color.red);
          l9.setFont(new Font("Tahoma",Font.PLAIN,20));
          p.add(l9);
          
          JLabel l10=new JLabel(pack[8]);
          l10.setBounds(30,350,320,40);
          l10.setForeground(Color.blue);
          l10.setFont(new Font("Tahoma",Font.PLAIN,30));
          p.add(l10);
                   
          JLabel l11=new JLabel(pack[9]);
          l11.setBounds(100,450,300,35);
          l11.setForeground(Color.red);
          l11.setFont(new Font("Tahoma",Font.PLAIN,30));
          p.add(l11);
             JLabel l12=new JLabel(pack[10]);
          l12.setBounds(400,450,300,30);
          l12.setForeground(Color.blue);
          l12.setFont(new Font("Tahoma",Font.PLAIN,30));
          p.add(l12);
          
          ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource(pack[11]));
          Image i1=img1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
          ImageIcon img2=new ImageIcon(i1);
          JLabel j=new JLabel(img2);
          j.setBounds(350,20, 500,300);
          p.add(j);
          
          
          return p;
          
      }
    
public static void main(String arg[])
{
  new checkpackage().setVisible(true);   
}





}
