
package travel_._tourism;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class payment extends JFrame implements ActionListener
{
       JButton  b1,b2;
    payment()
    {
        setLayout(null);
        setBounds(650,240,800,600);
        getContentPane().setBackground(Color.white);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel_/_tourism/icons/paytm.jpeg"));
        Image i=img1.getImage().getScaledInstance(800,600, Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(i);
        JLabel l=new JLabel(img2);
        l.setBounds(0,0,800, 600);
        add(l);
       b1=new JButton("Pay");
        b1.setBounds(380, 0, 100,35);
        b1.setBackground(Color.GRAY);
       b1.setForeground(Color.white);
        b1.addActionListener(this);
        l.add(b1);
       b2=new JButton("Back");
        b2.setBounds(520, 0, 100,35);
        b2.setBackground(Color.gray);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l.add(b2);
    }
public static void main(String arg[])
{
    new payment().setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            new paytm().setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
            this.setVisible(false);
        }
    }
  
}
