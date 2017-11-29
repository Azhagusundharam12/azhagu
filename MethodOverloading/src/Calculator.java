public class Calculator
{
	public static void main(String[] args)
	{
		add();
		int sub = sub();
		System.out.println("sub" + sub);
		mul(10, 20);
		int div = div(20, 10);
		System.out.println("div=" + div);
	}

	static void add()
	{
		int a = 90;
		int b = 20;
		int c = a + b;
		System.out.println("sum=" + c);
	}

	static int sub()
	{
		int a = 90;
		int b = 20;
		int c = a - b;
		return c;
	}

	static void mul(int a, int b)
	{
		int c = a * b;
		System.out.println("mul=" + c);
	}

	static int div(int a, int b)
	{
		int c = a / b;
		return c;
	}
}
