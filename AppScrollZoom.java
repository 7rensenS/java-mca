// <applet code=scrollbar width=1000 height=800>   </applet>
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppScrollZoom extends Applet implements AdjustmentListener
{
	Scrollbar s1;
	int r;

	public void init()
	{
		setLayout(null);

		s1=new Scrollbar(Scrollbar.VERTICAL,100,50,50,500);
		s1.setBounds(10,20,50,400);
		s1.addAdjustmentListener(this);

		add(s1);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		r = s1.getValue();
		repaint();
	}

	public void paint(Graphics g)
	{
		g.setColor(new Color(100,255,0));
		g.fillOval(350-r/2, 350-r/2, r, r);

		g.setColor(new Color(0,100,255));
		g.fillRect(650-r/2, 350-r/2, r, r);
	}
}
