package com;

import java.lang.*;

public class C1
{
	public static void main(String[] args)
	{
		String s1="abc" + "xyz";
		System.out.println(s1);
		String s2="abc";
		String s3="xyz";
		String s4=s2.concat(s3);
		System.out.println(s4);
		String s5=2 + 4 + "abc" +2 +4;
		System.out.println(s5);
		
	}
}
