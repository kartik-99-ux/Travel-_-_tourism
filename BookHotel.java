
package travel_._tourism;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class BookHotel extends JFrame implements ActionListener
{      Choice choice,c1,c2;
      JTextField f1,f2;
      JLabel user,id,number,phone,price;
      JButton b1,b2,b3;
    
      
    
    BookHotel(String username)
    {
        setLayout(null);
        setBounds(550,240,1100,650);
        getContentPane().setBackground(Color.WHITE);
        JLabel l1=new JLabel("BOOK HOTEL");
        l1.setBounds(350,2, 200, 30);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        l1.setForeground(Color.red);
        add(l1);
        JLabel l2=new JLabel("username:");
        l2.setBounds(20,70,200, 30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l2);
        user=new JLabel();
        user.setBounds(300,70,200, 30);
        user.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(user);
        JLabel l4=new JLabel("Select Hotel :");
        l4.setBounds(20,110,200, 30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l4);
        choice=new Choice();//create a table into your database and choices will come from there(create table Hotels(name varchar(40),cost_per_day varchar(50),food_charges varchar(40),ac_charges varchar(50));
         try
         {
            conn connect=new conn();
            ResultSet rs= connect.s.executeQuery("select * from Hotels");
            while(rs.next())
            {
                choice.add(rs.getString("name"));
            }
             
         }
         catch(Exception e)
         {}

        choice.setBounds(300,110,200,30);
        add(choice);
        JLabel l5=new JLabel("Total persons:");
        l5.setBounds(20,150,200, 30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l5);
        f1=new JTextField();
        f1.setBounds(300,150, 200,25);
        add(f1);
        JLabel l6=new JLabel("No.of days:");
        l6.setBounds(20,190,200, 30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l6);
        f2=new JTextField();
        f2.setBounds(300,190, 200,25);
        add(f2);
        JLabel l7=new JLabel("A/C or NON A/C:");
        l7.setBounds(20,240,200, 30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l7);
        c1=new Choice();
        c1.add("A/C");
        c1.add("NON A/C");
        c1.setBounds(300,240,200,30);
        add(c1);
       JLabel l8=new JLabel("Food included:");
        l8.setBounds(20,290,200, 30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l8);
        c2=new Choice();
        c2.add("Yes");
        c2.add("No");
        c2.setBounds(300,290,200,30);
        add(c2);
       JLabel l9=new JLabel("ID:");
        l9.setBounds(20,330,200, 30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l9);
        id=new JLabel();
        id.setBounds(300,330,200, 30);
        id.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(id);
        JLabel l10=new JLabel("Number:");
        l10.setBounds(20,380,200, 30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l10);
        number=new JLabel();
        number.setBounds(300,380,200, 30);
        number.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(number);
         JLabel l11=new JLabel("Email:");
        l11.setBounds(20,430,200, 30);
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l11);
        phone=new JLabel();
        phone.setBounds(300,430,200, 30);
        phone.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(phone);
         JLabel l12=new JLabel("Total price:");
        l12.setBounds(20,480,200, 30);
        l12.setFont(new Font("Tahoma",Font.PLAIN,20));
         l12.setForeground(Color.red);
        add(l12);
       price =new JLabel();
       price.setBounds(300,480,200, 30);
        price.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(price);
        //
      //  user.setText("kartik");//hardcode liya hai baad me hta dunga;
        try
        {
            conn c=new conn();
           ResultSet rs= c.s.executeQuery("select * from  Coustomer where username='"+username+"'");
            
            while(rs.next())
            {
                user.setText(rs.getString("username"));
                id.setText(rs.getString("id"));
                number.setText(rs.getString("number"));
                phone.setText(rs.getString("email"));
                
            }
        }
        catch(Exception e){}
        
        b1=new JButton("check price");
        b1.setBounds(50,540, 120,30);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("Book");
        b2.setBounds(200,540, 120,30);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
         b3=new JButton("Book");
        b3.setBounds(350,540, 120,30);
        b3.setBackground(Color.blue);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        add(b3);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/book.jpg"));
        Image i1=img1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(i1);
        JLabel l13=new JLabel(img2);
        l13.setBounds(520, 50, 600, 500);
        add(l13);
        
                
        
        
        
        
    }
     
    public static void main(String arg[])
    {
        new BookHotel("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {  // price.setText("10000");
        
       if(ae.getSource()==b1)
       {
           
         try
         {
            conn connect=new conn();
            ResultSet rs=connect.s.executeQuery("select * from Hotels where name='"+choice.getSelectedItem()+"'");
            while(rs.next())
            {
                int cost=Integer.parseInt(rs.getString("cost"));
                int food=Integer.parseInt(rs.getString("food"));
                int ac=Integer.parseInt(rs.getString("ac"));
                int persons=Integer.parseInt(f1.getText());
                int days=Integer.parseInt(f2.getText());
                
                String acprice=c1.getSelectedItem();
                String foodprice=c2.getSelectedItem();
                if(persons+days>0)
                {
                    int total=0;
                    total+=acprice.equals("A/C")?ac:0;
                    total+=foodprice.equals("Yes")?food:0;
                    total+=cost;
                    total=total*(persons*days);
                    price.setText(""+total);
                }
                else
                {
                   price.setText("Please enter valid number");
                }
                 
            }
         }
         catch(Exception e){}
       }
        if(ae.getSource()==b2)
       {
           try 
           {
               conn d=new conn();
               d.s.executeUpdate("insert into bookedHotel(username,hotel,persons,days,ac,food,id,number,email,price) values('"+user.getText()+"','"+choice.getSelectedItem()+"','"+f1.getText()+"','"+f2.getText()+"','"+c1.getSelectedItem()+"','"+c2.getSelectedItem()+"','"+id.getText()+"','"+number.getText()+"','"+phone.getText()+"','"+price.getText()+"')");
               this.setVisible(false);
           }
           catch(Exception e)
           {
               
           }
       }
      else if(ae.getSource()==b3)
       {
           this.setVisible(false);
       }
    }
}
/// all these value should be stored into a table;
//create database for this;
//  create table bookedHotel(username,hotel,persons,days,ac,food,id,number,phone,price);