package com;

public class C
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = "ABC";
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
