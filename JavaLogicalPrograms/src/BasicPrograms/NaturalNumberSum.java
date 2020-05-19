package BasicPrograms;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Numer");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		int sum1=0;
		
		for(int j=1;j<=num;j++)
		{
			sum1=sum1+j;
			
		}
		System.out.println("Sum of Nt Nums using for loop is: "+sum1);
		
		while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("The sum of natural Numbers is "+sum);
		
		}
	

}



