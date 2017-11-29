public class Use
{
	int age;

	Use(int age)
	{
		this.age = age;
	}

	public static void main(String[] args)
	{
		Use u1 = new Use(12);
		System.out.println(u1.age);
		Use u2 = new Use(15);
		System.out.println(u2.age);
	}
}
