package com.app.stringprogrms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="chakravarthi"; 
		
		StringBuilder sb2=new StringBuilder();
		
		/*for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			int idx=str.indexOf(ch,i+1);
			
			System.out.println(idx);
			if(idx==-1)
			{
				sb2.append(ch);
			}
			
		}
		System.out.print(" "+ sb2);*/
		
		/*char [] ch=str.toCharArray();
		int l=ch.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=ch[l-1];
					l--;
				}
			}
		}
		System.out.println("Remove Duplicate Elements in the String :");
		for(int i=0;i<l;i++)
		{
			System.out.print(ch[i] +"");
		}*/
		
		StringBuilder sb1=new StringBuilder();
		Set<Character> set=new LinkedHashSet();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character c:set)
		{
			sb1.append(c);
		}
		System.out.print(sb1);
		

	}

}
