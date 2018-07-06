import java.util.*;
import java.io.*;
class Shape
{
  int height,width,radius; 
  public Shape(int height,int width)
  {
    this.height=height;
    this.width=width;
  }
  //overloading
  public Shape(int radius)
  {
    this.radius=radius; 
  }
  public double getArea()
  {
    return height*width;
  }
  public double getPerimeter()
  {
    return 2*(height+width);
  }
  public double getArea(int radius)
  {
    return 3.14*radius*radius;
  }
  public double getPerimeter(int radius)
  {
    return 2*3.14*radius;
  }
  public int hashcode()
  {
    return height;
  }
  public boolean equals(Object obj)
    {
    if(this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        Shape shape = (Shape) obj;
        return (shape.height == this.height && shape.width==this.width);
    }
}
class Square extends Shape
{
  public Square(int side)
  {
    super(side,side);
  }
  public double getArea()
  { return super.getArea();}
  public double getPerimeter()
  { return super.getPerimeter();}
}
class Circle extends Shape
{
  public Circle(int radius)
  {
    super(radius);
  }
  public double getArea()
  { return super.getArea(radius);}
  public double getPerimeter()
  { return super.getPerimeter(radius);}
}
//custom exception
class NegNumber extends RuntimeException
{
  NegNumber(String s)
  {
    super(s);
  }
}
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    if(a<0||b<0||c<0||d<0)
    throw new NegNumber("Hold on..Negative Argument(s)!");
    //catch
    Shape s=new Shape(a,b);
    Shape s1=new Shape(a,b);
    Square sq=new Square(c);
    Shape ci=new Circle(d);
    if(s.hashcode()==s1.hashcode())
    System.out.println("Same height found!");
    if(s.equals(s1))
    System.out.println("Both Objects are equal. ");
    System.out.println(s.getArea());
    System.out.println(s.getPerimeter());
    System.out.println(sq.getArea());
    System.out.println(sq.getPerimeter());
    System.out.println(ci.getArea());
    System.out.println(ci.getPerimeter());

  }
}
