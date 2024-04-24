public class Traingle {
    double a;
    double b;
    double c;
    Traingle()
    {
        a=3;
        b=4;
        c=5;
        double per=a+b+c;
 System.out.println(per);
 double s=per/2;
double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
 System.out.println(area);
    }
    public static void main(String args[]){
        Traingle o=new Traingle();

    }
}
