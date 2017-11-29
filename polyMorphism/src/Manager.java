public class Manager
{
	static void method(A a2)
	{
		System.out.println(a2.i);
		a2.test();
	}
	public static void main(String[] args)
	{
		A a1=new A();
//		Manager.method(a1);
		B b1=new B();
		if(b1 instanceof B)
		{
			Manager.method(b1);
			System.out.println("yes");
		}else
		{
			System.out.println("no");
		}
		//Manager.method(b1);
		
	}
}
