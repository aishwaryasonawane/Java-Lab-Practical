package ass20Jan23;
import java.util.Scanner;
public class EmpDetails
{
   int id,sal;
  String name;
  String designation;
  public void emp()
  {
	  Scanner sc = new Scanner(System.in);
			
	  System.out.print("Enter Id :");
	  id =sc.nextInt();
			
	  System.out.print("Enter Emp Name :");
	  name =sc.next();
			
	  System.out.print("Enter Salary :");
	  sal =sc.nextInt();
			
	  System.out.print("Enter Designation :");
	  designation =sc.next();
			
			
	}

}

