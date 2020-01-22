// <applet code=mousepencil width=500 height=500> </applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AppMousePencil extends Applet implements MouseListener,MouseMotionListener
{
	int x=0,y=0,xe=0,ye=0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mousePressed(MouseEvent me)
	{
			xe=me.getX();
			ye=me.getY();
	}

	public void mouseDragged(MouseEvent me)
	{
		Graphics g=getGraphics();
		g.setColor(new Color(0,0,0));
		x=xe;
		y=ye;
		xe=me.getX();
		ye=me.getY();

		g.drawLine(x,y,xe,ye);
	}
	public void mouseClicked(MouseEvent me)	{	}
	public void mouseExited(MouseEvent me)	{ 	}
	public void mouseReleased(MouseEvent me){	}
	public void mouseEntered(MouseEvent me)	{	}
	public void mouseMoved(MouseEvent me)	{	}
}
