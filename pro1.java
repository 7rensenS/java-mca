import java.io.*;
class pro1
{
	public static void main(String args[])throws Exception
	{
			int count=0;
			int n=args.length;
			String name[]=new String[n];
			 for(int i=0;i<n;i++)
			 {
			 	System.out.println(args[i]);
			 	 count++;
			 }
			System.out.println ("No  of Words are ");
		System.out.println(count);
	}
}
