package BasicPrograms;

import java.util.Scanner;

public class LeapYr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a year:");
		Scanner sc=new Scanner(System.in);
		
		long year=sc.nextLong();
//		System.out.println(year);
//		if(year % 4==0 || year % 100==0 || year% 400==0 ) {
//			System.out.println(year+ " is a leap year");
//		}
//		else
//		{
//			System.out.println(year +" is not a leap year");
//		}
//		
//
//	}
		
		boolean leap=false;
		
		if(year %4 ==0) {
		
			if(year % 100==0) {
				if(year % 400==0) {
					leap=true;}
				else {leap=false;}
			}
			else {
				leap=true;}
		}
			else {
				leap=false;}
	
	if(leap)
	{
		System.out.println(year + "is a leap year ");
	}
	else {
		System.out.println(year + " is not a leap year");
	}
	}
}

			


