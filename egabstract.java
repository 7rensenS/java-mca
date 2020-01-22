abstract class Shape
{
	int radius;
	Shape(int x)
	{
	radius=x;
	}
	abstract void diameter();
	abstract void area();
}

class circle extends Shape
{
	circle(int x)
	{
	super(x);
	}
	public void diameter()
	{
	System.out.println(2*radius);
	}
        public void area()
	{
	System.out.println(3.14*radius*radius);
	}
}
class egabstract
{
	public static void main(String args[])
	{
	circle c1= new circle(5);
	c1.diameter();
	c1.area();
	}
}
