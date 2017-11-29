package com;

import java.util.Scanner;

public class Rev1
{
	public static void main(String[] args)
	{
		String rev = "";
		// welcome
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc.next();
		int len = s1.length() - 1;
		for (int i = len; i >= 0; i--)
		{
			rev = rev + s1.charAt(i);
		}
		System.out.println("original=" + s1);
		System.out.println("Reverse=" + rev);
		if (s1.equals(rev))
		{
			System.out.println("palindrome");
		} else
		{
			System.out.println("not palindrome");
		}
	}
}
