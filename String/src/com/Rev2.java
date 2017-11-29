package com;

public class Rev2
{
public static void main(String[] args)
{
	String s1="welcome";
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	System.out.println("reverse="+s2);
}
}
