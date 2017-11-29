public class A
{
	A()
	{
		System.out.println("const without arg");
	}

	
	public static void main(String[] args)
	{
		System.out.println("main");
		A a1 = new A();
		A a2=a1;
	}
}
