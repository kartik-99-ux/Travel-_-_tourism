
package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class Delete extends JFrame implements ActionListener
        
{
    JLabel user;
    String username;
    JButton b1,b2,b3;
    Delete(String username)
    { 
       this.username=username;
      
        setLayout(null);
        setBounds(660,240,850,550);
        getContentPane().setBackground(Color.white);
        JLabel heading=new JLabel("Delete Your account");
        heading.setBounds(200,0, 300,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);
        JLabel l1=new JLabel("username:");
        l1.setFont(new Font("Tahoma",Font.PLAIN,15));
        l1.setBounds(30,70,100,30);
        add(l1);
        
        JLabel l11=new JLabel();
        l11.setBounds(250,70, 100, 30);
        add(l11);
        
        JLabel l2=new JLabel("Name:");
        l2.setBounds(30,110,100,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l2);
        JLabel l12=new JLabel();
        l12.setBounds(250,110, 100, 30);
        add(l12);
        
        JLabel l3=new JLabel("id:");
        l3.setBounds(30,150,100,30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l3);
         JLabel l13=new JLabel();
        l13.setBounds(250,150, 100, 30);
        add(l13);
        JLabel l4=new JLabel("Number:");
        l4.setBounds(30,190,100,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l4);
        JLabel l14=new JLabel();
        l14.setBounds(250,190, 100, 30);
        add(l14);
        JLabel l5=new JLabel("Gender:");
        l5.setBounds(30,230,100,30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l5);
        JLabel l15=new JLabel();
        l15.setBounds(250,230, 100, 30);
        add(l15);
        JLabel l6=new JLabel("Country:");
        l6.setBounds(30,270,100,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l6);
         JLabel l16=new JLabel();
        l16.setBounds(250,270, 100, 30);
        add(l16);
        JLabel l7=new JLabel("Address");
         l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        l7.setBounds(30,310,100,30);
        add(l7);
        JLabel l17=new JLabel();
        l17.setBounds(250,310, 100, 30);
        add(l17);
         JLabel l8=new JLabel("Email:");
         l8.setFont(new Font("Tahoma",Font.PLAIN,15));
        l8.setBounds(30,350,100,30);
        add(l8);
         JLabel l18=new JLabel();
        l18.setBounds(250,350, 100, 30);
        add(l18);

        try
        {
         conn c=new conn();
         ResultSet rs=c.s.executeQuery("select * from Coustomer where username='"+username+"'");
         while(rs.next())
         {
             l11.setText(rs.getString("username"));
             l12.setText(rs.getString("name"));
             l13.setText(rs.getString("id"));
             l14.setText(rs.getString("number"));
             l15.setText(rs.getString("gender"));
             l16.setText(rs.getString("country"));
             l17.setText(rs.getString("address"));
             l18.setText(rs.getString("email"));
            
         }
        }
        catch(Exception e)
        {}
        b1=new JButton("Delete");
        b1.setBounds(70,430,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(b1);
         b2=new JButton("Back");
        b2.setBounds(250,430,150,35);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(b2);
         ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/delete.png"));
         Image i=img1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
         ImageIcon img2=new ImageIcon(i);
         JLabel l10=new JLabel(img2);
         l10.setBounds(500,100, 300, 300);
         add(l10);
         
       
    }
    public static void main(String arg[])
    {
        new Delete("").setVisible(true);
    }
     
    @Override
    public void actionPerformed(ActionEvent ae) 
    {   
          String q="DELETE FROM account WHERE username='"+username+"'";
        if(ae.getSource()==b1)
        {
         
            try
            {
                conn c=new conn();
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Deleted succesfully");
                System.exit(0);
            }
            catch(Exception e){}
        }
        else if(ae.getSource()==b2)
        {
            this.setVisible(false);
        }
    }
    
}
