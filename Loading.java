
package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Loading extends JFrame implements Runnable
{  JProgressBar c;
   Thread t;
   String username;
   
    @Override
    public void run() 
    {
         try
         {
             for(int i=1;i<=101;i++)
             {
                 int m=c.getMaximum();
                 int n=c.getValue();
                 if(n<m)
                 {
                     c.setValue(c.getValue()+1);
                     
                 }
                 else
                 {
                     i=102;
                     setVisible(false);
                     new Dashboard(username).setVisible(true);
                 }
                 Thread.sleep(50);
             }
             
         }
         catch(Exception e){}
    }
    
    Loading(String username)
            
    {   this.username=username;
        t=new Thread(this);
         
        this.setLayout(null);
        this.setBounds(700,250,650,400);
        this.getContentPane().setBackground(Color.white);
        JLabel l1=new JLabel("Welcome to Trave & Tourism Application");
        l1.setBounds(50,20,600,40);
        l1.setFont(new Font("Ralway",Font.BOLD,25));
        l1.setForeground(Color.BLUE);
        add(l1);
        
       
        c=new JProgressBar();
        c.setBounds(150,100,300,25);
       c.setStringPainted(true);
        add(c);
        JLabel l2=new JLabel("please wait.....");
        l2.setBounds(255, 130, 120,30);
        l2.setFont(new Font("Tohima",Font.BOLD,14));
        l2.setForeground(Color.red);
        add(l2);
        
        JLabel l3=new JLabel("Welcome  "+username);
        l3.setBounds(60, 310, 150,30);
         l3.setFont(new Font("Tohima",Font.BOLD,14));
         l3.setForeground(Color.red);
        add(l3);
         this.setVisible(true);
         t.start();
        
        
       
    }
    public static void main(String arg[])
    {
        new Loading("");
       
    }


}
