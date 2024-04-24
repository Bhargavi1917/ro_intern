import java.util.*;
abstract class Shape {
   double x;
  double y;
    abstract void printArea(double x,double y);

}
class Rectangle extends Shape{
    public void printArea(double x,double y )
    {
        System.out.println(x*y);
    }
}
class Circle extends Shape{
    public void printArea(double x,double y )
    {
        System.out.println(3.14*x*x);
    }
}
class Traingle1 extends Shape{
    public void printArea(double x,double y )
    {
        System.out.println(0.5*x*y);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double x=s.nextInt();
        double y=s.nextInt();
        Rectangle r=new Rectangle();
        r.printArea(x,y);
        Circle c=new Circle();
                c.printArea(x,x);
        Traingle1 t=new Traingle1();
        t.printArea(x,y);
    }
}

