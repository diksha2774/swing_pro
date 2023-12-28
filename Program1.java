import javax.swing.*;
import java.awt.*;

public class Program1 extends Frame
{
    public Program1()
    {
					setLayout(null);
					ImageIcon i = new ImageIcon("WIN_20230131_19_21_14_Pro.jpg");

					 Image im = i.getImage();
					 Image scaled = im.getScaledInstance(100,100, im.SCALE_SMOOTH);
     				       ImageIcon scaledIcon = new ImageIcon(scaled);
       				 JButton btn1 = new JButton(scaledIcon);
     				       add(btn1);
					 btn1.setBounds(50,50,100,100);
    }
    public static void main(String arg[])
    {
        Program1 p = new Program1();
	  p.setVisible(true);
	  p.setSize(1400,1000);		
    }
}