
package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class viewYourbooking extends JFrame implements ActionListener
{     JButton b1,b2;
     JLabel  user,Hotel,persons,days,ac,food,id,number,phone,price;
   
    viewYourbooking( String username)
    
    {    this.setLayout(null);
        setBounds(600,240, 1200, 650);
        getContentPane().setBackground(Color.WHITE);
        JLabel heading=new JLabel("VIEW YOUR BOOKED DETAILS");
        heading.setBounds(60,0,350,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        heading.setForeground(Color.magenta);
        add(heading);
        JLabel l1=new JLabel("username:");
        l1.setBounds(30,50,100,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        user=new JLabel();
        user.setBounds(250,50,100,30);
        user.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(user);
         JLabel l2=new JLabel("Hotel:");
        l2.setBounds(30,100,100,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l2);
        Hotel=new JLabel();
        Hotel.setBounds(250,100,100,30);
        Hotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(Hotel);
        JLabel l3=new JLabel("Total persons:");
        l3.setBounds(30,150,130,30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l3);
         persons=new JLabel();
        persons.setBounds(250,130,100,30);
        persons.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(persons);
         JLabel l4=new JLabel("Total days:");
        l4.setBounds(30,200,100,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l4);
        days=new JLabel();
        days.setBounds(250,200,100,30);
        days.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(days);
         JLabel l5=new JLabel("A/C included?:");
        l5.setBounds(30,250,150,30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l5);
        ac=new JLabel();
        ac.setBounds(250,250,150,30);
        ac.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(ac);
         JLabel l6=new JLabel("Food included?:");
        l6.setBounds(30,300,150,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l6);
        food=new JLabel();
        food.setBounds(250,300,130,30);
        food.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(food);
        
        JLabel l7=new JLabel("ID:");
        l7.setBounds(30,350,100,30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l7);
        id=new JLabel();
        id.setBounds(250,350,100,30);
        id.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(id);
        JLabel l8=new JLabel("number:");
        l8.setBounds(30,400,100,30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l8);
        
        number=new JLabel();
        number.setBounds(250,400,150,30);
        number.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(number);
         JLabel l9=new JLabel("Email:");
        l9.setBounds(30,450,100,30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l9);
        
        phone=new JLabel();
        phone.setBounds(250,450,250,30);
        phone.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(phone);
        JLabel l10=new JLabel("price:");
        l10.setBounds(30,500,100,30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l10);
        
        price=new JLabel();
        price.setBounds(250,500,100,30);
        price.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(price);
        b1=new JButton("Back");
        b1.setBounds(300, 550, 100,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
       //  user.setText("kartik");//hardcoded value
       //  Phone.setText("6387117024");//hardcoded value
         ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/bookedDetails.jpg"));
         Image i=img1.getImage().getScaledInstance(600,500,Image.SCALE_DEFAULT);
         ImageIcon img2=new ImageIcon(i);
         JLabel img=new JLabel(img2);
         img.setBounds(600,20,600,500);
         add(img);
         String q="SELECT * FROM bookedHotel WHERE username='anurag'";
         try
         {
            conn c=new conn();
           ResultSet rs= c.s.executeQuery(q);// table name where the data is stored;
           while(rs.next())
           {
               user.setText(rs.getString("username"));//2 represents that 2nd coloumn is of named pack correct database is important
               Hotel.setText(rs.getString("hotel"));
               persons.setText(rs.getString("persons"));
               days.setText(rs.getString("days"));
               ac.setText(rs.getString("ac"));
               food.setText(rs.getString("food"));
               id.setText(rs.getString("id"));
               number.setText(rs.getString("number"));
               phone.setText(rs.getString("email"));
               price.setText(rs.getString("price"));
           }
           }
         
         catch(Exception e){}
    
    }
    public static void main(String arg[])
    {
        new viewYourbooking("").setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) 
    {
       if(ae.getSource()==b1)
       {
           this.setVisible(false);
       }
       
    }
}
