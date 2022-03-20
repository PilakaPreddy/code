//single inheritance  - My_Calculation.java
package prcode;

 public class My_Calculation extends Calculation_java
  {
   void arith(int x, int y)
   {
     addition(x,y);  //accessing methods of super class
     subtraction(x,y); //accessing methods of super class
   }
  public void multiplication(int x, int y)
  {
  z=x*y; 
  System.out.println("The product of the given numbers:"+z);
  }
  }