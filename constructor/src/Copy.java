public class Copy
{
	int i=10;
	Copy()
	{
		System.out.println("cons1");
	}
	public static void main(String[] args)
	{
		Copy c1=new Copy();
		c1.i=89;
		Copy c2=new Copy();
		Copy c3=c2;
		c3.i=20;
		System.out.println(c1.i);
		System.out.println(c2.i);
		System.out.println(c3.i);
	}
	
}
