//program implementing type casting
package prcode;
public class Class_Conver {
  public static void main(String[] args) {
    int a=255,b;
    double x=1.732,y;
    char ch1='A';
    byte p,q=110;
    b=(int)x; 
    y=a;
    System.out.println("a "+a);
    System.out.println("x "+x);
    System.out.println("ch1 "+ch1);
    System.out.println("b "+b);
    System.out.println("y "+y);
    b=ch1;
    p=(byte)a;
    System.out.println("b "+b);
    System.out.println("p "+p);
    b=q;
    System.out.println("q "+q);
    System.out.println("b "+b);
    
  }
}