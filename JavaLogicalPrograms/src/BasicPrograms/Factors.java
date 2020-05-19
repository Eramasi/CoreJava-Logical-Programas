package BasicPrograms;

import java.util.Scanner;

public class Factors {
	
	public static void getFact(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Factors.getFact(num);
	}

}
