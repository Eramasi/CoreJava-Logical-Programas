package BasicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	static int revnum = 0;
	static int rem;

	public static int RevNumb(int num) {
		while (num != 0) {
			rem = num % 10;
			revnum = revnum * 10 + rem;
			num = num / 10;
		}
		return revnum;
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(ReverseNumber.RevNumb(num));

	}

	
	
}
