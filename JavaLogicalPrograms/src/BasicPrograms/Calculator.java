package BasicPrograms;

import java.util.Scanner;

public class Calculator {
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		Double fistno=sc.nextDouble();
		Double sendno=sc.nextDouble();
		System.out.println("Please enter an operator : (+,-,*,/): ");
		char ch=sc.next().charAt(0);
		double result=0;
		switch(ch)
		{
		case '+':
			result=fistno+sendno;
			break;
		case '-':
			result=fistno-sendno;
			break;
		case '*':
			result=fistno*sendno;
			break;
		case '/':
			result=fistno/sendno;
			break;
			default:
				System.out.println("Please Pass The Correct Operator :");
				break;
			
		}
		System.out.println(result);
		
		

	}

}
