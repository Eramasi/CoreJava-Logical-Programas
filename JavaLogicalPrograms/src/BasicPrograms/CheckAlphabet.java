package BasicPrograms;

import java.util.Scanner;

public class CheckAlphabet {
	
	public static void CheckAlph(char ch)
	{
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println(ch + " is an alphebet");
			
		}
		else {
			System.out.println(ch + " is not an alphabet");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("To Check Entered Character is Alphabet or not");
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0); 
		CheckAlph(ch);
		

	}

}
