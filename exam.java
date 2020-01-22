package shapes; 
public class square 
{ 
	public void display() 
	{ 
		int a=10; 
		int area=a*a;
 		System.out.println("area of square is:"+area);
	         int perimeter=4*a;
		 System.out.println("perimeter of square is:"+perimeter);
	 }
 }
package shapes;
public class circle
 { 
	public void display()
	 { 
	 int r=12;
	 int area=3.14*r*r; 
	 System.out.println("area of circle:"+area); 
	 int perimeter=2*3.14*r;
	 System.out.println("perimeter of circle is:"+perimeter);
	 }
 } 
import java.io*;
import shapes.*; 
public class exam 
{ 
	public static void main(String a[])
	{ 
	square s1=new square(); 
	s1.display();
	circle c1=new circle();
	c1.display(); 
	}
}
