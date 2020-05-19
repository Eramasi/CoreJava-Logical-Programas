package BasicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void ArmstgNo(int num)
	{
		int rem;
		int sumno=0;
		int actualnum=num;
		while(num!=0)
		{
			rem=num%10;
			sumno=sumno+(rem*rem*rem);
			num=num/10;
			
		}
		System.out.println("The sum of cubes of a number is: " +sumno);
		
		if(actualnum==sumno)
		{
			System.out.println(actualnum +" is a Armstrong Number ");
		}
		else 
		{
			System.out.println(actualnum +" is not a Armstrong Number ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ArmstrongNumber. ArmstgNo(num);
		
	}

}
