import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class cbox extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	TextField t;
Font f1,f2,f3;
	public void init()
	{

setForeground(Color.red);
		setBackground(Color.black);

c1 = new Checkbox(" FONT 1 ",false);
		c2 = new Checkbox("FONT 2 ",false);
		c3 = new Checkbox("FONT 3 ",false);

		c1.setBounds(50,50,160,50);
		c2.setBounds(50,100,160,50);
		c3.setBounds(50,150,160,50);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		t = new TextField();
		t.setBounds(50,200,160,50);

		setLayout(null);
 f1 = new Font("Arial",Font.BOLD,18);    
       f2 = new Font("Forte",Font.PLAIN,24);    
       f3 = new Font("Elephant",Font.ITALIC,28);

		add(c1);
		add(c2);
		add(c3);
		add(t);
	}

	public void itemStateChanged(ItemEvent e)
	{
		Graphics g = getGraphics();

		if(e.getItemSelectable()==c1)
		{
			g.setFont(f1);     
      		g.drawString("Thank you",50,200);
			repaint();
		}
		if(e.getItemSelectable()==c2)
		{
			g.setFont(f2);     
      		g.drawString("Thank you",50,200);	repaint();
	}
		if(e.getItemSelectable()==c3)
		{
			g.setFont(f2);     
      		g.drawString("Thank you",50,200); repaint();
		}
	}
}
