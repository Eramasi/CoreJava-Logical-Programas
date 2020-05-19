package BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static void getPrime(int num)
	{
		boolean flag=false;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num +" is a Prime Number");
		}
		else {
			System.out.println(num +" is not a Prime Number");
		}
	}
	


	public static void main(String[] args) {
		//A Number is divisible by 1 and itself Ex: 13 is divisible by 1 and 13 itself.
	System.out.println("Enter a number: ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	PrimeNumber.getPrime(num);
	
	}
}
	
	
		

