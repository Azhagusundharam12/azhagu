public class C
{
	int test(int j)
	{
		System.out.println(j);
		System.out.println("test");
		return j;
	}

	int test2()
	{
		System.out.println("test2");
		return 6;

	}

	public static void main(String[] args)
	{
		C c1 = new C();
		c1.test(c1.test2());
		System.out.println(c1.test(34));
		System.out.println(c1.test2());

	}
}
