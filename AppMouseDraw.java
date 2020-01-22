// <applet code=AppMouseDraw,class width=500 height=500>   </applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppMouseDraw extends Applet implements MouseListener
{
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		Graphics g=getGraphics();

		if(me.getButton()==me.BUTTON1)
		{
			g.setColor(new Color(0,255,0));
			g.fillRect(me.getX(),me.getY(),100,20);
			g.setColor(new Color(0,0,0));
			g.drawString("Single Click ",me.getX(),me.getY());
		}
		else if(me.getButton()==me.BUTTON3)
		{
			g.setColor(new Color(255,0,0));
			g.fillOval(me.getX(),me.getY(),100,50);
			g.drawString("Right Click ",me.getX(),me.getY());
		}
		if(me.getClickCount()==2)
		{
			g.setColor(new Color(0,0,255));
			g.drawRect(me.getX(),me.getY(),150,50);
			g.drawString("Double Click ",70 + me.getX(),me.getY());
		}
	}
	public void mousePressed(MouseEvent me)	{	}
	public void mouseExited(MouseEvent me)	{	}
	public void mouseReleased(MouseEvent me){	}
	public void mouseEntered(MouseEvent me)	{	}
}
