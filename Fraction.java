import java.util.*;
public class Fraction {
    int num;
    int den;

    public Fraction(int num, int den) {
        this.num=num;
        this.den=den;
    }

    public void get(){
        System.out.print(num+"/"+den);
    }
    public int gcd(int x,int y){
        if(y==0)
        {
            return x;
        }
        else {
            return gcd(y,x%y);
        }
    }
    public boolean equals(int num2,int den2) {
        if (num < num2 && den < den2) {
            int rem = gcd(num2, den2);
            int f1 = num2 / rem;
            int f2 = den2 / rem;
            if (f1 == num && f2 == den) {
                return true;
            } else {
                return false;
            }
        } else if (num2 < num && den2 < den) {
            int rem = gcd(num2, den2);
            int f1 = num / rem;
            int f2 = den / rem;
            if (f1 == num2 && f2 == den2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(num2==num && den2==den){
            return true;
        }

        else{
            return false;
        }
    }
       public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                Fraction o=new Fraction(4,3);
                int num2=sc.nextInt();
                int den2=sc.nextInt();
                o.get();
                System.out.println(o.equals(num2,den2));




            }
        }