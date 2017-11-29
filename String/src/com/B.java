package com;

public class B 
{
	
	public static void main(String[] args)
	{
		String s1=new String("abc");
		String s2="abc";
		String s3=new String("abc");
		String s4="ABC";
		System.out.println(s1.toString()==s2.toString());
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equalsIgnoreCase(s4));
		
	}
}
