package pack1;

import java.util.Scanner;

public class Throw
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if (age <= 0)
		{
			throw new ArithmeticException();
		}
		System.out.println("your age is:" + age);
	}
}
