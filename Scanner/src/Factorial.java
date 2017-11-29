import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		do
		{
			int fact = 1;
			System.out.println("enter the number");
			int n = sc.nextInt();
			if (n == 0)
			{
				System.out.println("your factorial is:" + fact);
				System.exit(0);
			}
			while (n > 0)
			{
				fact = fact * n;
				n--;
			}
			System.out.println("your factorial is:" + fact);
			System.out.println("do u want again?(y/n)");
		} while ("y".equals(sc.next()));
		System.out.println("thank you!");
	}
}
