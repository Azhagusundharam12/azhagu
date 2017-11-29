package pack1;

import java.util.Scanner;

public class Multilple
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the divider value");
		int j = sc.nextInt();
		try
		{
			int i = 10 / j;
			String s1 = null;
			s1.length();
		} 
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch (NullPointerException ex)
		{
			System.out.println(ex);
		}
		
		System.out.println("main");
	}
}
