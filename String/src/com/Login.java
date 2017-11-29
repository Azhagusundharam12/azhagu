package com;

import java.util.Scanner;

public class Login extends Reg
{
	String un;
	String pwd;

	void login()
	
	{
		System.out.println("login form");
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username");
		un = sc.next();
		
		System.out.println("Enter the Password");
		pwd = sc.next();
	}

	boolean validate()
	{
		boolean status = false;
		if (uname.equals(un) && pass.equals(pwd))
		{
			status = true;
		}
		return status;
	}

	public static void main(String[] args)
	{
		Login l1 = new Login();
		Scanner sc = new Scanner(System.in);
		do
		{
		l1.registration();
		l1.login();
		if (l1.validate())
		{
			System.out.println("your login is success!");
			System.out.println("your detals are:");
			l1.disp();
		} else
		{
			System.out.println("pls enter the correct username and pasword");
		}
		System.out.println("do you want to register agian?(y/n)");
		}while("y".equals(sc.next()));
	}
	
}
