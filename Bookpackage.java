
package travel_._tourism;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Bookpackage extends JFrame implements ActionListener
        
{
  
    JTextField f1,f2,f3,f4;
    Choice c;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JButton b1,b2,b3;
    String pack[]={"GOLD","SILVER","BRONZE"};
     Bookpackage(String username)
     {
             setLayout(null);
            this.setBounds(500,250, 1100, 600);
            getContentPane().setBackground(Color.WHITE); 
             ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/bookpackage.jpg"));
             Image i=img1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
             ImageIcon img2=new ImageIcon(i);
             JLabel limg=new JLabel(img2);
             limg.setBounds(750,50, 300,200);
             add(limg);
            JLabel l=new JLabel("BOOK PACKAGE");
            l.setBounds(300,20,300,30);
            l.setFont(new Font("Tahoma",Font.BOLD,30));
            add(l);
            l2=new JLabel("username");
            l2.setBounds(50,90,200,30);
            l2.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l2);
            l3=new JLabel();
            l3.setBounds(500,90,200,30);
            l3.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l3);
            l4=new JLabel("Select package");
            l4.setBounds(50,140,200,30);
            l4.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l4);
            c=new Choice();
            c.add("GOLD");
            c.add("SILVER");
            c.add("BRONZE");
            c.setBounds(500, 140, 200,60);
            add(c);
           l5=new JLabel("Total persons");
            l5.setBounds(50,210,200,30);
            l5.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l5);
            f1=new JTextField("1");
            f1.setBounds(500,210,200,30);
            add(f1);
            l6=new JLabel("ID:");
            l6.setBounds(50,270,200,30);
            l6.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l6);
            l9=new JLabel();
            l9.setBounds(500,270,200,30);
            l9.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l9);
           // f2=new JTextField();
           // f2.setBounds(500,210,200,30);
           // add(f2);
            l7=new JLabel("Number");
            l7.setBounds(50,320,200,30);
            l7.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l7);
             l10=new JLabel();
            l10.setBounds(500,320,200,30);
            l10.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l10);
            l8=new JLabel("Email");
            l8.setBounds(50,370,200,30);
            l8.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l8);
            l11=new JLabel();
            l11.setBounds(500,370,200,30);
            l11.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l11);
            
            l13=new JLabel("Total price");
            l13.setBounds(50,430,200,30);
            l13.setFont(new Font("Tahoma",Font.PLAIN,20));
            l13.setForeground(Color.RED);
            add(l13);
               l14=new JLabel();
            l14.setBounds(500,430,200,30);
            l14.setFont(new Font("Tahoma",Font.PLAIN,20));
            add(l14);
            
            try
            {
             conn c=new conn();
             ResultSet rs=c.s.executeQuery("select * from Coustomer where username='"+username+"'");
             while(rs.next())
             {
                 l3.setText(rs.getString("username"));
                 l9.setText(rs.getString("id"));
                  l10.setText(rs.getString("number"));
                 l11.setText(rs.getString("email"));
                 
             }
            }
            catch(Exception e){}
            
            b1=new JButton("check prices");
            b1.setBounds(50, 500, 160,40);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            add(b1);
            
            b2=new JButton("Book package");
            b2.setBounds(300, 500, 160,40);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.addActionListener(this);
            add(b2);
            b3=new JButton("Back");
            b3.setBounds(500, 500, 160,40);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);
            b3.addActionListener(this);
            add(b3);
            
         
     }
    
     public static void main(String arg[])
     {
      new Bookpackage("").setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
        String username=l3.getText();
        String pack=c.getSelectedItem();
        String persons=f1.getText();
        String id=l9.getText();
        String number=   l10.getText();
        String email=l11.getText();
        String price=l14.getText();
        String q="INSERT INTO bookpackage(username,package,total_person,id,number,phone,price) VALUES('"+username+"', '"+pack+"','"+persons+"','"+id+"' ,'"+number+"','"+email+"','"+price+"')";
        if(ae.getSource()==b1)
        {
           String p=(String)c.getSelectedItem();
           
           int cost=0;
           
           if(p.equals("GOLD"))
           {
               cost=12000;
           }
           else if(p.equals("SILVER"))
           {
               cost=24000;
           }
           else if(p.equals("BRONZE"))
           {
               cost=36000;
           }
           
           int per=Integer.parseInt(f1.getText());
          cost= cost*per;
          l14.setText("Rs ="+cost);
           
           
        }
        else if(ae.getSource()==b2)
        {
            
           try
           {
               conn c1=new conn();
           
                c1.s.executeUpdate(q);//table name is bookpackage
               JOptionPane.showMessageDialog(null,"Booked succesfully");
               this.setVisible(false);
           }
           catch(Exception e){}
            
        }
        else if(ae.getSource()==b3)
        {
           this .setVisible(false);
            
        }
            
       
   }
}
