
public class A
{
public static void main(String[] args)
{
	String s1="60";
	System.out.println(s1.hashCode());
	String s2=new String("60");
	System.out.println(s2.hashCode());
	if(s1.equals(s2)){
		System.out.println("same");
	}
	if(s1==s2){
		System.out.println("same");
	}
	else
	{
		System.out.println("differ");
	}
	
	
	Thread t1=new Thread();
	t1.run();
	t1.start();
}

}
