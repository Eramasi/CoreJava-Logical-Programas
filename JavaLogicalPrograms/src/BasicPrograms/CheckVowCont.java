package BasicPrograms;

import java.util.Scanner;

public class CheckVowCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter alaphabetical's");
		
		Scanner sc=new Scanner(System.in);
		
	    char ch=sc.next().charAt(0);
	    
	    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	    {
	    	System.out.println( ch +" is Vowel");
	    }
	    else
	    {
	    	System.out.println(ch +" is Consonant");
	    }
	    
	    switch(ch)
	    {
	    case 'a':
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
	    	System.out.println(ch + " is vowel");
	    	break;
	    	
	    	default: 
	    		System.out.println(ch +" is a consonent" );
	    		
	    		break;
	    
	    }
		
		
	}

}
