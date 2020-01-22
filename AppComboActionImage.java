//<applet code = combo.class width = 800  height = 500> </applet>

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppComboActionImage extends Applet implements ItemListener
{
	Choice c;
	Image img;
	public void init()
	{
		c = new Choice();

		c.add("Home");
		c.add("Train");
		c.add("Farm");
		c.add("Road");
		c.add("Lawn");
		c.add("Roadend");

		c.setBounds(50,50,100,50);
		c.addItemListener(this);

		add(c);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c.getSelectedItem()=="Home")
		{
			img = getImage(getDocumentBase(),"home.jpg");
			repaint();
		}
		else if(c.getSelectedItem()=="Train")
		{
			img = getImage(getDocumentBase(),"train.jpg");
			repaint();
		}
		else if(c.getSelectedItem()=="Farm")
		{
			img = getImage(getDocumentBase(),"farm.jpg");
			repaint();
		}
		else if(c.getSelectedItem()=="Road")
		{
			img = getImage(getDocumentBase(),"Road.jpg");
			repaint();
		}
		else if(c.getSelectedItem()=="Lawn")
		{
			img = getImage(getDocumentBase(),"Lawn.jpg");
			repaint();
		}
		else if(c.getSelectedItem()=="Roadend")
		{
			img = getImage(getDocumentBase(),"Roadend.jpg");
			repaint();
		}
	}

	public void paint(Graphics g)
	{
			g.drawImage(img,0,0,this);
	}
}
