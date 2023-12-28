import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Program2 extends Frame implements ActionListener
{
	Panel p;
	JButton[] btn = new JButton[9];
	Button btn1;
	Label lb1 ;
	TextField tf1;
	String[] a= new String[9];
	String[] b= new String[9];
	String[] name= new String[9];
	int j,i,k;	
	static int score=0;
	ImageIcon i1,image9,image1,image2,image3,image4,image5,image6,image7,image8;
	Image im ;
	Image scaled ;
     	ImageIcon scaledIcon;
    public Program2()
    {
name[0]="one.jpg";
name[1]="two.jpg";
name[3]="four.jpg";
name[2]="three.jpg";
name[4]="five.jpg";
name[5]="six.jpg";
name[6]="seven.jpg";
name[7]="eight.jpg";
name[8]="Screenshot (22).png";
					setLayout(null);

					 i1= new ImageIcon(name[0]);
					  im = i1.getImage();
					  scaled = im.getScaledInstance(100,100, im.SCALE_SMOOTH);
     				        scaledIcon = new ImageIcon(scaled);
						image1=scaledIcon;
       				  btn[0] = new JButton(scaledIcon);
     				       add(btn[0]);
					 btn[0].setBounds(50,50,100,100);

					i1 = new ImageIcon("two.jpg");
					  im = i1.getImage();
					  scaled = im.getScaledInstance(100,100, im.SCALE_SMOOTH);
     				        scaledIcon = new ImageIcon(scaled);
						image2=scaledIcon;
       				  btn[1] = new JButton(scaledIcon);
     				       add(btn[1]);
					 btn[1].setBounds(50,50,100,100);

					i1= new ImageIcon("three.jpg");
					  im = i1.getImage();
					  scaled = im.getScaledInstance(100,100, im.SCALE_SMOOTH);
     				        scaledIcon = new ImageIcon(scaled);
						image3=scaledIcon;
       				  btn[2] = new JButton(scaledIcon);
     				       add(btn[2]);
					 btn[2].setBounds(50,50,100,100);

					 i1 = new ImageIcon("four.jpg");
					  im = i1.getImage();
					  scaled = im.getScaledInstance(100,100, im.SCALE_SMOOTH);
     				        scaledIcon = new ImageIcon(scaled);
						image4=scaledIcon;
       				  btn[3] = new JButton(scaledIcon);
     				       add(btn[3]);
					 btn[3].setBounds(50,50,100,100);

					 i1 = new ImageIcon("five.jpg");
					  im = i1.getImage();
					  scaled = im.getScaledInstance(100,100, im.SCALE_SMOOTH);
     				        scaledIcon = new ImageIcon(scaled);
						image5=scaledIcon;
       				  btn[4] = new JButton(scaledIcon);
     				       add(btn[4]);
					 btn[4].setBounds(50,50,100,100);

					 i1 = new ImageIcon("six.jpg");
					  im = i1.getImage();
					  scaled = im.getScaledInstance(100,100, im.SCALE_SMOOTH);
     				        scaledIcon = new ImageIcon(scaled);
						image6=scaledIcon;
       				  btn[5] = new JButton(scaledIcon);
     				       add(btn[5]);
					 btn[5].setBounds(50,50,100,100);

					 i1 = new ImageIcon("eight.jpg");
					  im = i1.getImage();
					  scaled = im.getScaledInstance(100,100, im.SCALE_SMOOTH);
     				        scaledIcon = new ImageIcon(scaled);
						image8=scaledIcon;
       				  btn[6] = new JButton(scaledIcon);
     				       add(btn[6]);
					 btn[6].setBounds(50,50,100,100);

					 i1 = new ImageIcon("seven.jpg");
					  im = i1.getImage();
					  scaled = im.getScaledInstance(100,100, im.SCALE_SMOOTH);
     				        scaledIcon = new ImageIcon(scaled);
						image7=scaledIcon;
       				  btn[7] = new JButton(scaledIcon);
     				       add(btn[7]);
					 btn[7].setBounds(50,50,100,100);

					 i1 = new ImageIcon(name[8]);
						image9=i1;
       				  btn[8] = new JButton(i1);
     				       add(btn[8]);
					 btn[8].setBounds(50,50,100,100);

		this.setBackground(new Color(255,255,0));
		b[0]="8";
		b[1]="4";
		b[2]="3";
		b[3]="1";
		b[4]="7";
		b[5]="5";
		b[6]="2";
		b[7]="6";
		b[8]="";

		Random r = new Random();
		int num = r.nextInt(8);
		for(i=0;i<=8;i++)
		{
			if(i+num<=8)
			{				
				a[i]=b[i+num];
			}
			if(8<i+num)
			{
				j=i;
				break;	
			}
		}
		for(k=i;k<=8;k++)
		{
			a[k]=b[k-j];
		}
		p = new Panel();
		p.setLayout(new GridLayout(3,3));
		p.setBounds(100,290,300,300);

		btn1 = new Button("Number Slide Game");
		btn1.setBounds(0,0,700,150);
		btn1.setBackground(new Color(0,255,0));		
		btn1.setForeground(new Color(0,0,204));
		btn1.setFont(new Font("Arial",Font.ITALIC,40));

		tf1 = new TextField();
		tf1.setBounds(200,200,100,30);
		tf1.setText(""+score);
		lb1 = new Label("Score");
		lb1.setBounds(100,200,100,30);
		lb1.setForeground(new Color(0,0,204));
		lb1.setFont(new Font("Arial",Font.ITALIC,20));
		
		add(lb1); add(tf1); add(btn1); add(p);

		for(int i=0;i<9;i++)
		{
			
			p.add(btn[i]);
			btn[i].addActionListener(this);
			btn[i].setLabel(a[i]);
		}
		
	}

	public void winner()
	{
		int count=0;
			if(btn[0].getIcon()==image1)
			{
				count+=1;
			}if(btn[1].getIcon()==image2)
			{
				count+=1;
			}if(btn[2].getIcon()==image3)
			{
				count+=1;
			}if(btn[3].getIcon()==image4)
			{
				count+=1;
			}if(btn[4].getIcon()==image5)
			{
				count+=1;
			}if(btn[5].getIcon()==image6)
			{
				count+=1;
			}if(btn[6].getIcon()==image7)
			{
				count+=1;
			}if(btn[7].getIcon()==image8)
			{
				count+=1;
			}if(btn[8].getIcon()==image9)
			{
				count+=1;
			}
		if(count==9)
		{
			score+=1;
			tf1.setText(""+score);
		}
	}	

	public void actionPerformed(ActionEvent ae)
	{
		Object ob = ae.getSource();
		for(j=0;j<9;j++)
		{
			if(ob==btn[j])
			{ break;}
		}
			int i;
			for(i=0;i<9;i++)
			{
				if(btn[i].getIcon()==image9)
				{break;}
			}
			btn[i].setIcon(btn[j].getIcon());
			btn[j].setIcon(image9);

			winner();
	}
    public static void main(String arg[])
    {
        Program2 p = new Program2();
	  p.setVisible(true);
	  p.setSize(700,700);
	  p.setTitle("Number Slide");		
    }
}
