import java.io.*;
class five implements Runnable
{
Thread t;
five()
{
t= new Thread(this,"five");
t.setPriority(1);
t.start();
}
public void run()
{
	try
	{	
		int i,k=5,r=0;
		for(i=1;i<=10;i++)
		{
		r=k*i;
	System.out.println(+r);
		}
		i++;
		
		Thread.sleep(500);
	}
catch(InterruptedException e)
{
	System.out.println("my thread five is interuptted");
}
System.out.println("my thread five is over");
}
}
class seven implements Runnable
{
Thread t;
seven()
{
t= new Thread(this,"seven");
t.setPriority(6);
t.start();
}
public void run()
{
	try
	{	
		int i,k=7,r=0;
		for(i=1;i<=10;i++)
		{
		r=k*i;
	System.out.println(+r);
		}
		i++;
		
		Thread.sleep(500);
	}
catch(InterruptedException e)
{
	System.out.println("my thread seven is interuptted");
}
System.out.println("my thread seven is over");
}
}
class thirteen implements Runnable
{
Thread t;
thirteen()
{
t= new Thread(this,"thirteen");
t.setPriority(9);
t.start();
}
public void run()
{
	try
	{	
		int i,k=13,r=0;
		for(i=1;i<=10;i++)
		{
		r=k*i;
	System.out.println(+r);
		}
		i++;
		
		Thread.sleep(500);
	}
catch(InterruptedException e)
{
	System.out.println("my thread thirteen is interuptted");
}
System.out.println("my thread thirteen is over");
}
}
public class Multithread
{
	public static void main(String a[])
	{
		new five();
		new seven();
		new thirteen();
		try
		{
		Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
		System.out.println("thread interrupted");
		}
	}
}
