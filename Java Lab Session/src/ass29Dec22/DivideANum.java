package ass29Dec22;
import java.util.Scanner;

public class DivideANum {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int a;
		try
		{
			a=i/j;
			System.out.println("The Division Of two Number:"+a);
		}
		catch(Exception e)
		{
			System.out.println("The Exception is :"+e);
		}

	}

}


