import java.util.Scanner;

public class Add
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the a value");
//		int a = sc.nextInt();
//		System.out.println("enter the b value");
//		int b = sc.nextInt();
//		int sum = a + b;
//		System.out.println("Sum=" + sum);
		System.out.println("what is your name?");
		String name = sc.nextLine();
		System.out.println("your name is:" + name);
		sc.close();
	}

}
