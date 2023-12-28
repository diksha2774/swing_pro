import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class All_Component_swing extends JFrame
{
	public All_Component_swing()
	{
		/*setLayout(new FlowLayout());
		JComboBox c = new JComboBox();
		add(c);
		c.setBounds(100,100,100,30);
		c.addItem("one");
		c.addItem("two");
		String[] a ={"one","two","one","two","one","two","one","two"};
		JList l = new JList(a);
		add(l);
		l.setBounds(240,100,100,300);

JTextArea t = new JTextArea(20,20);

       JScrollPane scrollableTextArea = new JScrollPane(t);  
  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
       scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
  	add(scrollableTextArea);

JPasswordField fi = new JPasswordField(100);
add(fi);
fi.setToolTipText("Enter your Password");  
 String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};   

JTable t = new JTable(data,column);
 JScrollPane sp = new JScrollPane(t);
        add(sp);

DefaultMutableTreeNode root = new DefaultMutableTreeNode("course");
DefaultMutableTreeNode root1 = new DefaultMutableTreeNode("ST");
DefaultMutableTreeNode root2 = new DefaultMutableTreeNode("unit1");
DefaultMutableTreeNode root3 = new DefaultMutableTreeNode("unit2");
DefaultMutableTreeNode root4 = new DefaultMutableTreeNode("unit3");
DefaultMutableTreeNode root5 = new DefaultMutableTreeNode("ADBMS");
DefaultMutableTreeNode root6 = new DefaultMutableTreeNode("AJP");
DefaultMutableTreeNode root7 = new DefaultMutableTreeNode("unit1");
root.add(root1); root.add(root6); root.add(root5);
root5.add(root7);
root1.add(root2);root1.add(root3);root1.add(root4);

JTree tree = new JTree(root);
        add(tree);


*/
Button btn1 = new Button("ONE");
Button btn2 = new Button("two");
Button btn3 = new Button("three");

JPanel p1 = new JPanel();
p1.setLayout(new FlowLayout());
p1.add(btn1);

JPanel p2 = new JPanel();
p2.setLayout(new FlowLayout());
p2.add(btn2);

JPanel p3 = new JPanel();
p3.setLayout(new FlowLayout());
p3.add(btn3);

JTabbedPane tb = new JTabbedPane();

tb.add("FOLDER1",p1);
tb.add("FOLDER2",p2);
tb.add("FOLDER3",p3);

add(tb);
	}

	public static void main(String ar[])
	{
		All_Component_swing f = new All_Component_swing();
		f.setSize(400,400);
		f.setVisible(true);
		f.setTitle("Demo");
	}
}


/*import javax.swing.*;    
public class All_Component_swing extends JFrame{    
JProgressBar jb;    
int i=0,num=0;     
All_Component_swing(){    
jb=new JProgressBar(0,2000);    
jb.setBounds(40,40,160,30);         
jb.setValue(0);   
jb.setStringPainted(true);    
add(jb);    
setSize(250,150);    
setLayout(null);    
}    
public void iterate()
{ while(i<=1000){    
  jb.setValue(i);    
  i=i+20;    
  try{Thread.sleep(150);}catch(Exception e){}    
}    
}    
public static void main(String[] args) {    
   All_Component_swing m=new All_Component_swing();    
    m.setVisible(true);    
    m.iterate();    
}    
}  */