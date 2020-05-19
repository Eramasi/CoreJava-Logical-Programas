package BasicPrograms;

import java.util.Scanner;

public class AddIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 integers ");
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1+num2);
		
		System.out.println("Enter 2 Float Numbers");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		System.out.println(f1 * f2);
		
		char c='A';
		int ascii=c;
		System.out.println(ascii);

	}

}
