package BasicPrograms;

import java.util.Scanner;

public class PrimeNumberInter {
	
	public static void getPrimaryIntervel(int low,int high)
	{
		while(low < high)
		{
			boolean flag=false; 
			for(int i=2;i<low/2;i++)
			{
				if(low % i==0)
				{
					flag=true;
					break;
					
				}
			}
			if(!flag)
			{
				System.out.println(low +" ");
			}
			low++;
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a range of primary numbers");
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		PrimeNumberInter.getPrimaryIntervel(low,high);
		
		
	}
}
