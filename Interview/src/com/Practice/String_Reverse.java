package com.Practice;

public class String_Reverse {

	public static void main(String[] args) {
		String s="sainadh";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println("Reverse of String :"+s1);

	}
	
	
}