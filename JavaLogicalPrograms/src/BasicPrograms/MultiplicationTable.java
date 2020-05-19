package BasicPrograms;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void getMul(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + " x " + i + " = " +(num*i));
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		getMul(num);
		
		

	}

}
