package com;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
		String s1;
		String s2="";

		Scanner sc = new Scanner(System.in);
		System.out.println("ener the string ");
		s1 = sc.next();
		for (int i = s1.length() - 1; i >= 0; i--)
		{
			s2 = s2 + s1.charAt(i);
		
			
		}
		System.out.println(s2);
		boolean status=s1.equals(s2);
		if(status)
		{
			System.out.println(s1+" is palindrome");
		}
		else
		{
			System.out.println(s1+" is not a palindrome");
		}
	}
}
