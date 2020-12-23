
package travel_._tourism;
import java.awt.Image;
import javax.swing.*;

public class splash 
{
    public static void main(String arg[])throws Exception
    {
       splashframe frame= new splashframe();
       frame.setVisible(true);
       int x=1;
       for(int i=1;i<=700;i=i+6,x=x+4)
       {
       frame.setLocation(940-(x+i/2),500-(i/4));
       frame.setSize(x+i, i);
       Thread.sleep(10);
       }
       frame.setVisible(true);
    }
    
}
class splashframe  extends JFrame implements Runnable
{    
    
     Thread th1=new Thread(this);
     
       
      splashframe ()
      {
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/splash.jpg"));
     Image lmg= i1.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);
     ImageIcon l3=new ImageIcon(lmg);
     JLabel l=new JLabel(l3);
     add(l);
      
       setUndecorated(true);
       th1.start();
      }
         
      
        public void run()
    {
        try
        {
            Thread.sleep(7000);
            new LogIn();
            this.setVisible(false);
        }
        catch(Exception e)
        {
            
            
            
        }
        
    }
      
     
     
}


