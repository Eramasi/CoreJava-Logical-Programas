package BasicPrograms;

import java.util.Scanner;

public class Factorial {
	static int fact=1;
	
	public static void getFact(int num)
	{
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("The Factorial of a number is: " +fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		getFact(num);

	}

}
