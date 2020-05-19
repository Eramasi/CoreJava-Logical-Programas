package BasicPrograms;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 3 numbers :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
	
		if(a>b&&a>c)
		{
			System.out.println("a is greatest number :"+a);
		}
		else if(b>c)
		{
			System.out.println(" b is greatr number :"+b);
		}
		else
		{
			System.out.println(" c is grater number :"+c);
			
		}
		

	}

}
