interface C1
{
  public void area();
}
abstract class A implements C1
{
  public void area()
  {
    System.out.println("Area-A");
  }
  abstract public void area2();
}
//inheritance
class B extends A
{
  public void area2()
  {
    System.out.println("Area-B");
  }
}
//ASD: access specifier failure demonstration
class ASD
{
  private int a1=10;
  public int getA()
  {
    return a1;
  }
}
class ASD2 extends ASD
{
  public int getB()
  {
    return getA();
  }
}
class Main1 {
  public static void main(String[] args) {
    //upcasting and downcasting
    B b=new B();
    A a1=b;
    A b1=new B();
    B b2=(B)b1;
    //a.area();
    b.area2();
    a1.area();
    b1.area2();
    b2.area2();
    b2.area();
    ASD2 obj=new ASD2();
    System.out.println(obj.getB());
  }
}
