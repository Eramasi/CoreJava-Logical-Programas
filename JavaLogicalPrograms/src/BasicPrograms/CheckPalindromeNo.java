package BasicPrograms;

import java.util.Scanner;

public class CheckPalindromeNo {
	static int rem;
	static int revnum=0;
	
	
	public static void CheckPalin(int num)
	{
		int actualnum=num;
		while(num!=0)
		{
			rem=num%10;
			revnum=revnum*10+rem;
			num=num/10;
		}
		
		System.out.println("Reverse of a Number is: "+revnum);
		
		if(actualnum==revnum)
		{
			System.out.println(actualnum+" is a Palindrome");
		}
		else 
		{
			System.out.println(actualnum +" is not a Palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		CheckPalindromeNo.CheckPalin(num);
		

	}

}
