//<applet code = key.class width = 800 height = 600></applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AppKeyBoard extends Applet implements KeyListener
{
	String s="";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyTyped(KeyEvent ke)
	{
		char c=ke.getKeyChar();
		s =  Character.toString(c);
		repaint();
	}
	public void keyPressed(KeyEvent ke)
	{
		if(ke.getKeyCode() == ke.VK_ALT )
			s = "ALT" ;
		else if(ke.getKeyCode() == ke.VK_HOME )
			s = "HOME" ;

		repaint();
	}
	public void keyReleased(KeyEvent ke)	{	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("Arial",Font.BOLD,200));
		g.setColor(Color.red);
		g.drawString(s,100,300);
	}
}
