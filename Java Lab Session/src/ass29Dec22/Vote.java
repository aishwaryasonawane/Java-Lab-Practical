package ass29Dec22;
import java.util.Scanner;

public class Vote 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Age Of user");
		int age=sc.nextInt();
		 if(age>=18)
		 {
			 System.out.println("You are Eligible to vote");
		 }
		 else
		 {
			 throw new ArithmeticException("Age is Not correct");
		 }
		

	}

}




	