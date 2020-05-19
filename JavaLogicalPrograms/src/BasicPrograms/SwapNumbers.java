package BasicPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=30;
		
		System.out.println("Before Swapping:  A value is " +a + "  B value is "+b);
		
	  int temp=a;
	  a=b;
	  b=temp;
	  System.out.println("After Swapping:  A value is " +a + "  B value is "+b);
		
		// without temp
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:  A value is " +a + "  B value is "+b);
		 
		

	}

}
