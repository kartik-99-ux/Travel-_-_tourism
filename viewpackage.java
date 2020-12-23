
package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class viewpackage  extends JFrame implements ActionListener
{     JButton b1,b2;
    
    viewpackage( String username)
    
    {   
        this.setLayout(null);
        setBounds(600,240, 1000, 500);
        getContentPane().setBackground(Color.WHITE);
        JLabel heading=new JLabel("VIEW PACKAGE DETAILS");
        heading.setBounds(60,0,300,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);
        JLabel l1=new JLabel("username:");
        l1.setBounds(30,50,100,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        JLabel user=new JLabel();
        user.setBounds(180,50,100,30);
        user.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(user);
         JLabel l2=new JLabel("package:");
        l2.setBounds(30,100,100,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l2);
        JLabel pack=new JLabel();
        pack.setBounds(220,100,100,30);
        pack.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(pack);
        JLabel l3=new JLabel("Total persons:");
        l3.setBounds(30,150,130,30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l3);
        JLabel total=new JLabel();
        pack.setBounds(220,130,100,30);
        pack.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(total);
         JLabel l4=new JLabel("ID:");
        l4.setBounds(30,200,100,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l4);
        JLabel ID=new JLabel();
        ID.setBounds(220,200,100,30);
        ID.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(ID);
         JLabel l5=new JLabel("Number:");
        l5.setBounds(30,250,100,30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l5);
        JLabel number=new JLabel();
        number.setBounds(220,250,100,30);
        number.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(number);
         JLabel l6=new JLabel("Phone:");
        l6.setBounds(30,300,100,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l6);
        JLabel Phone=new JLabel();
        Phone.setBounds(220,300,130,30);
        Phone.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(Phone);
        
        JLabel l7=new JLabel("Price:");
        l7.setBounds(30,350,100,30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l7);
        JLabel price=new JLabel();
        price.setBounds(220,350,100,30);
        price.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(price);
        b1=new JButton("Back");
        b1.setBounds(300, 400, 100,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
         ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/bookedDetails.jpg"));
         Image i=img1.getImage().getScaledInstance(600,500,Image.SCALE_DEFAULT);
         ImageIcon img2=new ImageIcon(i);
         JLabel img=new JLabel(img2);
         img.setBounds(500,20,600,500);
         add(img);
         String q="SELECT * FROM bookpackage WHERE username='"+username+"'";
        
         try
         {
            conn c=new conn();
           ResultSet rs= c.s.executeQuery(q);// table name where the data is stored;
           while(rs.next())
           {
               user.setText(rs.getString("username"));
               pack.setText(rs.getString("package"));//2 represents that 2nd coloumn is of named pack correct database is important
               total.setText(rs.getString("total_persons"));
               ID.setText(rs.getString("id"));
               number.setText(rs.getString("number"));
               Phone.setText(rs.getString("phone"));
               price.setText(rs.getString("price"));
           }
         }
         catch(Exception e){}
        
    }
    public static void main(String arg[])
    {
        new viewpackage("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       if(ae.getSource()==b1)
       {
           this.setVisible(false);
       }
       
    }
}
