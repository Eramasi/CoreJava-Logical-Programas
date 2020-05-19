package com.app.stringprogrms;

import java.util.Scanner;

public class ReverseString {
	
	public static void reverse(String str) {
		
		char [] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a String :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		ReverseString.reverse(str);
		
		
		//Using toCharArray(); Method
		
		String str1="Chinna";
		char[] ch=str1.toCharArray();
		System.out.println(str1.charAt(4));// get the character based on index value
		System.out.println(ch.length);
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println("--------------");
		System.out.println("Approach-2");
		
		//Using length()-1 
		
		String st="Chinna";
		for(int i=st.length()-1;i>=0;i--)
		{
			System.out.print(st.charAt(i));
		}
		System.out.println("-----------");
		System.out.println("Using StringBuffer");
		System.out.println("Approach-3");
		StringBuffer sb=new StringBuffer(str1);
		System.out.println(sb.reverse());
		System.out.println("Approach-4");
		StringBuilder sbuilder=new StringBuilder(str);
		System.out.println(sbuilder.reverse());

	}

}
