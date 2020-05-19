package BasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	int f1=0;
	int f2=1;
	int f3;
	
	public void getFibo(int num)
	{
		for(int i=1;i<=num;i++)
		{
			System.out.print(" "+ f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;
			
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter a number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		FibonacciSeries Fib=new FibonacciSeries();
		Fib.getFibo(num);
		
		

	}

}
