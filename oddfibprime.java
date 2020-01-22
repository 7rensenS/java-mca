import java.io.*;
class odd implements Runnable
{
Thread t;
odd()
{
t= new Thread(this,"odd");
t.setPriority(1);
t.start();
}
public void run()
{
	try
	{
		int i;
		for(i=1;i<=20;i++)
		{
		    if(i%2!=0)
		  System.out.println("odd"+i);

		}

		Thread.sleep(500);
	}
catch(InterruptedException e)
{
	System.out.println("my thread odd is interuptted");
}
System.out.println("my thread odd is over");
}
}
class fib implements Runnable
{
Thread t;
fib()
{
t= new Thread(this,"fib");
t.setPriority(6);
t.start();
}
public void run()
{
	try
	{
	   int a=0,b=1,c=0,i;
	   System.out.println(+a);
	   System.out.println(+b);
	  while(c<50)
	   {
	        for(i=0;i<=10;i++)
	   {
	       c=a+b;
	       System.out.println(+c);
	       a=b;
	       b=c;

	   }
	   c++;
	   }

	   Thread.sleep(500);
	}

catch(InterruptedException e)
{
	System.out.println("my thread fib is interuptted");
}
System.out.println("my fibodd is over");
}
}
class prime implements Runnable
{
Thread t;
prime()
{
t= new Thread(this,"prime");
t.setPriority(9);
t.start();
}
public void run()
{
	try
	{
		    int i,m=0,flag=0,j;
            for(j=0;j<=20;j++)
        {
            m=j/2;
            if(j==0||j==1){
             System.out.println(j+" not prime");
        }
  else
  {
            for(i=2;i<=m;i++)
            {
            if(j%i==0)
            {
            System.out.println(j+"not prime");
            flag=1;
             break;
             }
   }
   if(flag==0)  { System.out.println(j+" is prime number"); }
  }
}
		Thread.sleep(500);
	}
catch(InterruptedException e)
{
	System.out.println("my thread prime is interuptted");
}
System.out.println("my thread prime is over");
}
}
public class oddfibprime
{
	public static void main(String a[])
	{
		new odd();
		new fib();
		new prime();
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
