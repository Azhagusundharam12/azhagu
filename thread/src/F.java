public class F extends Thread
{
	public static void main(String[] args)
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		System.out.println("----------------");
		F f1=new F();
		System.out.println(f1.getId());
		System.out.println(f1.getName());
		System.out.println(f1.getPriority());
		System.out.println(f1.isDaemon());
		System.out.println("--------------------");
		F f2=new F();
		f2.setDaemon(true);
		f2.setName("daemons");
		f2.setPriority(8);
		System.out.println(f2.getId());
		System.out.println(f2.getName());
		System.out.println(f2.getPriority());
		System.out.println(f2.isDaemon());
		System.out.println(t1.isAlive());
		System.out.println(f1.isAlive());
		
	}
}
