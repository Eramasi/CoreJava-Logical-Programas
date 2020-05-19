package BasicPrograms;

import java.util.Scanner;

public class NumberofDigits {
	static int count=0;
	public static int getNumofDigits(long num)
	{
		while(num!=0)
		{
			num=num/10;  //1563,156,15,1
			++count;     //1,2,3,4,5
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter a Number :");
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		System.out.println(NumberofDigits.getNumofDigits(num));

	}

}
