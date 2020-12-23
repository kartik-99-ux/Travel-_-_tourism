
package travel_._tourism;
import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class about extends JFrame implements ActionListener
{     JButton b;
       about()
       {    setLayout(null);
           setBounds(800,240,700,650);
           getContentPane().setBackground(Color.white);
           JLabel l=new JLabel("Travel and tourism management system");
           l.setBounds(50,10, 600, 40);
           l.setFont(new Font("Tahoma",Font.PLAIN,30));
           l.setForeground(Color.red);
           add(l);
           String s="jkdsugfuidshfkdsnvdsjdhasdkjvbmzkjhainac djkcgsdhsdm, jk"
                   + "dsdbkjm,c cc zxcbdhdssdbjhdgfdshfksdbnfdsbfjkdsh"
                   + "dbasjkbcjkdshushduhsdnsdjbsdki"
                   + "ssdbhjSBDfgsdufihsdif"
                   + "dsjkbdwehoiewu"
                   + "zcjksduishaKL;SDHSGFUIJJSVDUYATD"
                   + "SBASHJDGDSHDF"
                   + "SJSGFWEFYEWIOJKFBDSHDG"
                   + "WWDQUWE[O VSYDIDMBUSY9"
                   + "SABSHJGUDYWE8DUEWKD "
                   + "NAGDWEY78EWY   CJKG"
                   + "DKDIEYD78EWYHKJWJEEGD78W"
                   + "DNEEUGDUIEWYWHJKEWNJEWKGD7WEUIWB"
                   + "DNDJHEUDGWEUEHJGWWT8QBSJKXXXGFFSCSDCJSDFSDSKLJSPODEJHFF"
                   + "DNNSHDUWEDSMNUHD78EYDOIWEN"
                   + "EDGDDYEDEUPEMMWEBEUQYE8ENAM AS,DA'AUUDIA]DD   "
                   + "";
           TextArea t=new TextArea(s,10,40,Scrollbar.VERTICAL);
           t.setEditable(false);
           t.setBounds(20,90,450,300);
           add(t);
           b=new JButton("Back");
           b.setBounds(400,500,150,30);
           b.setBackground(new Color(131,193,233));
           b.addActionListener(this);
           add(b);
       }
    public static void main(String arg[])
    {
      new about().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    { 
        if(ae.getSource()==b)
        {
            this.setVisible(false);
        }
    }
}
