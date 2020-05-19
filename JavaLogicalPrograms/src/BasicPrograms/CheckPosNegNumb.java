package BasicPrograms;

import java.util.Scanner;

public class CheckPosNegNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Number ");
		Scanner sc=new Scanner(System.in);
		double no=sc.nextDouble();
		if(no>0.0)
		{
			System.out.println("Given Number is Positive");
		}
		else if(no<0)
		{
			System.out.println("Given Number is Negative");
		}
		else {
			System.out.println("Given Number is zero");
		}
	}

}
