package com;

public class F
{
	public static void main(String[] args)
	{
		String s1="welcome";
		//welcome
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('m'));
		System.out.println(s1.lastIndexOf('m'));
		System.out.println(s1.length());
		s1=s1.trim();
		System.out.println(s1.length());
	}
}
