//Week 6, Lab Problem - 2    Department.java

package labweek6prog;
import java.util.*;

public class Department  
{
  ArrayList <student> stud_det=new ArrayList <student>();
  void addNewStudent(student s1)
  {
    stud_det.add(s1);
  }
    void printAllStudents()
    {
      for (student st:stud_det)
       System.out.println(st);
    }
    
    void searchStudentID(int x)
    {
      boolean found=false;
      for (student st:stud_det)
         {
        if(st.ID==x)
        {
          found=true;
          System.out.println(st);
          break;
        }
         }
      if(found==true)
       System.out.println("Student found"); 
      else
        System.out.println("Student not found"); 
     }
    void searchStudentname(String x)
    {
      boolean found=false;
      for (student st:stud_det)
         {
        if(x.contains(st.name))
        {
          found=true;
          System.out.println(st);
          break;
        }
         }
      if(found==true)
       System.out.println("Student found"); 
      else
        System.out.println("Student not found"); 
     }
    
    void modifyStudentname(int x, String m)
    {
      boolean found=false;
      for (student st:stud_det)
         {
        if(st.ID==x)
        {
          found=true;
          st.name=m;
          System.out.println(st);
          break;
        }
         }
      if(found==true)
       System.out.println("Student Modified"); 
      else
        System.out.println("Student not found"); 
     }
}