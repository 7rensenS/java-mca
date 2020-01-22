//<applet code = colours.class width = 1385  height = 645> </applet>

//erorrrrrrr
import java.awt.*;
import java.util.*;
import java.applet.*;
import java.awt.event.*;

public class Appcolours extends Applet implements ActionListener
{
	int r,g,b;
    TextField t1,t3,t2;
	Button bt;
	public void init()
	{
		setLayout(null);
		bt = new Button("COLOUR ");
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		bt.addActionListener(this);
		bt.setBounds(40,50,100,40);
		add(bt);
		add(t1);
		add(t2);
		add(t3);
		t1.setBound(50,50,40,30);
		t2.setBound(150,50,40,30);
		t3.setBound(250,50,40,30);

}
	public void actionPerformed(ActionEvent ae)
	{

		Random rn = new Random();

		r = Integer.parseInt(t1.getText());
		g = Integer.parseInt(t2.getText());
		b = Integer.parseInt(t3.getText());
		setBackground(new Color(r,g,b));

	}
}
