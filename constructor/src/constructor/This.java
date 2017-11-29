package constructor;

public class This
{
	int i;

	This(int i)
	{
		this.i = i;
	}

public static void main(String[] args)
{
	This t1=new This(10);
	System.out.println(t1.i);
			
}
}
