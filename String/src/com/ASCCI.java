package com;

import java.util.Scanner;

public class ASCCI
{
public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the character");
	String s1=sc.next();
	char c=s1.charAt(0);
	int i=c;
	System.out.println("ASCII="+i);
}
}
