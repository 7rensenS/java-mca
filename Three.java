//erorrrrrr

import java.io.*;
class One
{
String name,place;
One()
{
DataInputStream d=new DataInputStream (System.in);
System.out.println("Enter the name ");
name=d.readLine();
System.out.println("Enter the place ");
place=d.readLine();
}
}
class Two extends One
{
Two()
{
super();
System.out.println("name is"+name);
System.out.println("place is"+place);
}
}
class Three extends Two
{
public static void main(String arg[])
{
Three ob=new Three();
}
}
