package com;
import java.lang.*;
public class StringBuild
{
	public static void main(String[] args)
	{
		
		StringBuilder s1 = new StringBuilder();
		s1.append("aaaa");
		s1.append("bbbb");
		s1.append("cccc");
		System.out.println(s1);
		System.out.println(s1.reverse());
	}
}
