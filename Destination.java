
package travel_._tourism;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;


public class Destination extends JFrame implements Runnable
{
    Thread t1;

     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
     JLabel lebels[]={l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};

      
      String s[]={"travel_/_tourism/icons/dest1.jpg","travel_/_tourism/icons/dest2.png","travel_/_tourism/icons/dest3.jpg","travel_/_tourism/icons/dest4.jpg","travel_/_tourism/icons/dest5.jpg","travel_/_tourism/icons/dest6.jpg","travel_/_tourism/icons/dest7.jpeg","travel_/_tourism/icons/dest8.jpg","travel_/_tourism/icons/dest9.jpg","travel_/_tourism/icons/dest10.jpg"};
     
    Destination()
    {
        
      ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
     ImageIcon[] image={i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
     Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
     Image pictures[]={j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
     ImageIcon i11=null,i12=null,i13=null,i14=null,i15=null,i16=null,i17=null,i18=null,i19=null,i20=null;
     ImageIcon[] image2={i11,i12,i13,i14,i15,i16,i17,i18,i19,i20};
     
       for(int i=0;i<=9;i++)
       {
      setBounds(650,240,900,700);
         image[i]=new ImageIcon(ClassLoader.getSystemResource(s[i]));
         pictures[i]=image[i].getImage().getScaledInstance(900, 700,Image.SCALE_DEFAULT);
       image2[i]=new ImageIcon(pictures[i]);
       this.lebels[i]=new JLabel(image2[i]);
       this.lebels[i].setBounds(0, 0, 900, 700);
       add(this.lebels[i]);
    
       
       }
      t1=new Thread(this);
      t1.start();
    }
    public static void main(String arg[])
    {
        new Destination().setVisible(true);
    }

    @Override
    public void run() 
    {
          String hotels[]={"Four season hotel","Raddisons hotels","clasio hotel","the Bay club hotel","Breeze Blow hotel","Quick stop hotel","Happy morning hotel","Moss view hotel","Dream palace","the gamble stop"};
        for(int i=0;i<=9;i++)
        {
            this.lebels[i].setVisible(true);
           
            try
            {
            Thread.sleep(3000);
            this.lebels[i].setVisible(false);
            }
            catch(Exception e){}
            
        }
    }
    
}
