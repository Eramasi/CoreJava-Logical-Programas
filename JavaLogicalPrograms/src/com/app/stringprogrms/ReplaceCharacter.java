package com.app.stringprogrms;
  
public class ReplaceCharacter {

	public static void main(String[] args) {
		
		String str="opentext";
		char charToReplace='t';
		
		System.out.println(str.indexOf(charToReplace));
		
		// check character is present in string 
		
		if(str.indexOf(charToReplace)==-1) {
			
			System.out.println("Given Character is not available in given string ");
			System.exit(0);
			
		}
		
		//Logics to replace char occurrence in string
		
		int cnt=1;
		 
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if( ch==charToReplace)
			{
				str=str.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(str);

	}

}
