package com;

import java.util.Scanner;

public class Input
{
public static void main(String[] args)
{
	StringBuffer sb=new StringBuffer();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string value");
	sb.append(sc.next());
	System.out.println("enter the string value");
	sb.append(sc.next());
	System.out.println("enter the string value");
	sb.append(sc.next());
	System.out.println("enter the string value");
	sb.append(sc.next());
	System.out.println(sb);
}
}
