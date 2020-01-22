import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class pgm extends Applet implements MouseListener
{
	public void init()
	{
	addMouseListener(this);
	}
public void mouseClicked(MouseEvent me)
	{
	Graphics g=getGraphics();
	int rd,gr,bl;
	int x=me.getX();
	int y=me.getY();
	Random r= new Random();
	rd=r.nextInt(255);
	gr=r.nextInt(255);
	bl=r.nextInt(255);
	Color c=new Color(rd,gr,bl);
	g.setColor(c);
	String s=Integer.toString(x);
	String s1=Integer.toString(y);
	showStatus("x="+s+"Y="+s1);
	g.fillOval(x,y,30,30);
	}
	public void mousePressed(MouseEvent me)
	{
		repaint();
	}
	public void mouseExited(MouseEvent me)	{	}
	public void mouseReleased(MouseEvent me){	}
	public void mouseEntered(MouseEvent me)	{	}
	public void paint(Graphics g){		}
}
