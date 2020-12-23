
package travel_._tourism;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class paytm  extends JFrame implements ActionListener
        
{  
    
    
      JButton b1;
      
        paytm()
     {   
        setBounds(670,240,800,600);
          JEditorPane E=new JEditorPane();
          E.setEditable(false);
          try
          {
              E.setPage("https//paytm.com/credit-card-bill-payment");
              
          }
          catch(Exception e)
          { 
              E.setContentType("text/html");
              E.setText("<html>Could not load</html>");
          
          }
           b1=new JButton("Back");
           b1.addActionListener(this);
          JScrollPane js=new JScrollPane(E);
          getContentPane().add(js);
          add(E);
          E.add(b1);
          b1.setBounds(610,20, 80, 40);
         
          
      }
   
     
    public static void main(String arg[])
    {
     new paytm().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       if(ae.getSource()==b1)
       {
           this.setVisible(false);
           new payment().setVisible(true);
       }
    }
}
