package ass20Jan23;

import java.util.Scanner;

class MyThread extends Thread
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary of Employee : ");
		double sal = sc.nextDouble();
		
		System.out.println("Actual Salary :"+sal);
		
		double salhike = sal/10;
		double finalsal= sal+salhike;

	    double hike = (sal+salhike-sal)/(sal)*100;
        System.out.println("Your Salary After Hike "+hike+"% : "+finalsal);
	
	}
}
 class EmpThread {

	public static void main(String[] args) 
	{ 
		 MyThread t = new MyThread();
		 t.start();
		 
	}

}