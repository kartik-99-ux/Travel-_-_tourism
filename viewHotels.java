
package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;


public class viewHotels extends JFrame implements Runnable
{   Thread t1;

     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
     JLabel lebels[]={l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
     JLabel caption;
      
      String s[]={"travel_/_tourism/icons/hotel1.jpg","travel_/_tourism/icons/hotel2.jpg","travel_/_tourism/icons/hotel3.jpg","travel_/_tourism/icons/hotel4.jpg","travel_/_tourism/icons/hotel5.jpg","travel_/_tourism/icons/hotel6.jpg","travel_/_tourism/icons/hotel7.jpg","travel_/_tourism/icons/hotel8.jpg","travel_/_tourism/icons/hotel9.jpg","travel_/_tourism/icons/hotel10.jpg"};
     
     
   viewHotels()
   {  
      
      ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
     ImageIcon[] image={i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
     Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
     Image pictures[]={j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
     ImageIcon i11=null,i12=null,i13=null,i14=null,i15=null,i16=null,i17=null,i18=null,i19=null,i20=null;
     ImageIcon[] image2={i11,i12,i13,i14,i15,i16,i17,i18,i19,i20};
     
       for(int i=0;i<10;i++)
       {
      setBounds(650,240,900,700);
         image[i]=new ImageIcon(ClassLoader.getSystemResource(s[i]));
         pictures[i]=image[i].getImage().getScaledInstance(900, 700,Image.SCALE_DEFAULT);
       image2[i]=new ImageIcon(pictures[i]);
       this.lebels[i]=new JLabel(image2[i]);
       this.lebels[i].setBounds(0, 0, 900, 700);
       add(this.lebels[i]);
       caption =new JLabel();
       caption.setBounds(50, 600, 300, 30);
       caption.setForeground(Color.white);
       caption.setFont(new Font("Tahoma",Font.PLAIN,30));
       
       }
      t1=new Thread(this);
      t1.start();
      
      
      
   }
   public static void main(String arg[])
   {
       new viewHotels().setVisible(true);
   }

    @Override
    public void run() 
    { 
        String hotels[]={"Four season hotel","Raddisons hotels","clasio hotel","the Bay club hotel","Breeze Blow hotel","Quick stop hotel","Happy morning hotel","Moss view hotel","Dream palace","the gamble stop"};
        for(int i=0;i<10;i++)
        {
            this.lebels[i].setVisible(true);
            caption.setText(hotels[i]);
            this.lebels[i].add(caption);
            try
            {
            Thread.sleep(3000);
            this.lebels[i].setVisible(false);
            }
            catch(Exception e){}
            
        }
    }
    
}
