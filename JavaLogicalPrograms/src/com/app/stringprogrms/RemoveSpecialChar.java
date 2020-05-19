package com.app.stringprogrms;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="@#$%^java@143&*(_";
		
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));

	}

}
