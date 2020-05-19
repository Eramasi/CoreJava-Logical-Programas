package com.app.stringprogrms;

import java.util.Arrays;
import java.util.Scanner;

public class SortingStringChar {
	
	public static void getstring(String str1)
	{
		//Using Sort Method
		char [] charArray=str1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Without Using Sort Method
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		SortingStringChar.getstring(str1);
		
		String str="JAVA";
		char ch[]=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			}
		}
		System.out.println(new String(ch));

	}

}
