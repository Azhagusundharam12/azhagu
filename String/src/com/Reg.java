package com;
import java.util.Scanner;

public class Reg extends Object
{
	String fname;
	String lname;
	int age;
	String uname;
	String pass;

	void registration()
	{
		System.out.println("-------------------");
		System.out.println("Registration form");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		fname = sc.next();

		System.out.println("Enter the Last Name");
		lname = sc.next();

		System.out.println("Enter the Age");
		age = sc.nextInt();

		System.out.println("Enter the Username");
		uname = sc.next();

		System.out.println("Enter the Password");
		pass = sc.next();
	
		System.out.println("your reagistration is succes!");

	}

	void disp()
	{
		System.out.println("First name=" + fname);
		System.out.println("last name=" + lname);
		System.out.println("age=" + age);
		System.out.println("uname=" + uname);
		System.out.println("password=" + pass);

	}
}
