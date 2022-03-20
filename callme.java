//Dynamic Method Dispatch
package prcode;

class A1 
 {
  void callme()
  {
    System.out.println("Inside A's callme method");
   }
}
class B1 extends A1 
{
  void callme() 
  {
  System.out.println("Inside B's callme method");
  }
}

class C1 extends A1 
{
  void callme() {
  System.out.println("Inside C's callme method");
}
}
public class callme {
  public static void main(String[] args) {
    A1 a = new A1();    // object of type A
    B1 b = new B1();   // object of type B
    C1 c = new C1();   // object of type C
    A1 r;            // obtain a reference of type A
    r = a;         // r refers to an A object
    r.callme();    // calls A's version of callme 
    r = b;            // r refers to a B object
    r.callme();     // calls B's version of callme
    r = c;           // r refers to a C object
    r.callme();         // calls C's version of callme
  }
}