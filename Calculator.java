//<applet code = calc.class width = 300  height = 500> </applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Calculator extends Applet implements ActionListener
{
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
	TextField t1;
	float x,y,z = 0,flag = 0;
	public void init()
	{
		b0 = new Button("0");
		b0.addActionListener(this);
		b1 = new Button("1");
		b1.addActionListener(this);
		b2 = new Button("2");
		b2.addActionListener(this);
		b3 = new Button("3");
		b3.addActionListener(this);
		b4 = new Button("4");
		b4.addActionListener(this);
		b5 = new Button("5");
		b5.addActionListener(this);
		b6 = new Button("6");
		b6.addActionListener(this);
		b7 = new Button("7");
		b7.addActionListener(this);
		b8 = new Button("8");
		b8.addActionListener(this);
		b9 = new Button("9");
		b9.addActionListener(this);
		b10 = new Button("+");
		b10.addActionListener(this);
		b11 = new Button("-");
		b11.addActionListener(this);
		b12 = new Button("x");
		b12.addActionListener(this);
		b13 = new Button("/");
		b13.addActionListener(this);
		b14 = new Button("=");
		b14.addActionListener(this);
		t1 = new TextField();
		setLayout(null);
		setForeground(Color.blue);
		setBackground(Color.green);
		t1.setBounds(50,50,200,50);
		b7.setBounds(50,150,50,50);
		b8.setBounds(100,150,50,50);
		b9.setBounds(150,150,50,50);
		b10.setBounds(200,150,50,50);
		b4.setBounds(50,200,50,50);
		b5.setBounds(100,200,50,50);
		b6.setBounds(150,200,50,50);
		b11.setBounds(200,200,50,50);
		b1.setBounds(50,250,50,50);
		b2.setBounds(100,250,50,50);
		b3.setBounds(150,250,50,50);
		b12.setBounds(200,250,50,50);
		b0.setBounds(50,300,50,50);
		b14.setBounds(100,300,100,50);
		b13.setBounds(200,300,50,50);
		add(t1);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("0"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 0;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 0;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("1"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 1;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 1;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("2"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 2;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 2;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("3"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 3;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 3;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("4"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 4;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 4;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("5"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 5;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 5;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("6"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 6;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 6;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("7"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 7;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 7;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("8"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 8;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 8;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("9"))
		{
			if(flag == 0)
			{
				x = (x * 10) + 9;
				t1.setText(Float.toString(x));
			}
			else
			{
				y = (y * 10) + 9;
				t1.setText(Float.toString(y));
			}
		}
		else if(ae.getActionCommand().equals("+"))
			flag = 1;
		else if(ae.getActionCommand().equals("-"))
			flag = 2;
		else if(ae.getActionCommand().equals("x"))
			flag = 3;
		else if(ae.getActionCommand().equals("/"))
			flag = 4;
		else if(ae.getActionCommand().equals("="))
		{
			if( flag == 1 )
				z = x + y;
			else if( flag == 2 )
				z = x - y;
			else if( flag == 3 )
				z = x * y;
			else if( flag == 4 )
				z = x / y;
			t1.setText(Float.toString(z));
			flag =  0;
			x = Float.parseFloat(t1.getText());
			y = 0;
		}
	}
}
