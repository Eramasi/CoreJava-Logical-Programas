package com.app.stringprogrms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str="CHAKRAVARTHI";
		
		for(char ch:str.toCharArray())
		{
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.println("Non Repeating :"+ch);
			}
		}

		
		Map<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1,"Java Developer");
		hm.put(2,"Automation Engineer");
		
		for(Entry<Integer, String> hm1:hm.entrySet())
		{
			System.out.println(hm1.getKey() + " "+ hm1.getValue());
		}
		
		String str1="zyx";
		char [] ch=str1.toCharArray();
	
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
,				if(ch[i]>ch[j])
				{
					char temp;
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
				
			}
		}
		System.out.println(new String(ch));*/
		
		/*String str="I am Chakravarthi";
		String [] str1=str.split(" ");
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]+" ");		}*/
		
		
		/*String str="CHAKRAVARTHI";
		List<String> list = Arrays.asList(str.split(""));
		Set<String>  set=new HashSet<String>(list);
		for(Object o:set)
		{
			System.out.println(o+ " :"+Collections.frequency(list, o));
		}*/
		
		
		int [] array= {65,98,67,32,45,63,12,97};
		for(int i:array)
		{
			System.out.print(" "+i);
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Find The Largest and Smallest Number in the array");
		int FS=array[0];
		int Fl=array[0];
		int SL=array[0];
		int SS=array[0];
		for(int j=0;j<array.length;j++)
		{
			if(array[j]>Fl)
			{
				Fl=array[j];
			}
			
			
			else if(array[j]>SL)
			{
				SL=array[j];
			}
			else if(array[j]<FS)
			{
				FS=array[j];
			}
			else if(array[j]<SS)
			{
				SS=array[j];
			}
		}
		System.out.println("The Smallest Number is "+FS);
		System.out.println("The Second Smallest Number is:"+SS);
		System.out.println("The First Largest Number is "+Fl);
		System.out.println("The Second Largest Number is "+SL);
		
		int[] a={12, 13, 24, 45, 65, 27, 37, 43, 41, 50, 75, 68, 98, 78};
		
        Arrays.sort(a);
		int maxIndex = a[a.length-3];
		System.out.println(maxIndex);
		
		
	}
}

