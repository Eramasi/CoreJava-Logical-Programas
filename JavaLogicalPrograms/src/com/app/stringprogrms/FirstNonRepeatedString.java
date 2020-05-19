package com.app.stringprogrms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Chakrvathi";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);}
			else
			{
				map.put(ch,1);
			}
		}
		System.out.println(map);
		
		for(Entry<Character, Integer> entrySet:map.entrySet())
		{
			if(entrySet.getValue()==1) {
				System.out.println(entrySet.getKey());
				break;
				
				
			}
		}
		// iterating key & value's using entry set
		
		Map<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1,"Java Developer");
		hm.put(2,"Automation Engineer");
		hm.put(3,"AWS Developer");
		
		for(Entry<Integer,String> entryset:hm.entrySet())
		{
			System.out.println(entryset.getKey()+" "+entryset.getValue() );
			
		}
		

	}

}
