public class A
{
int i=10;
static int j=20;
static void test()
{
System.out.println("test");
}
Public static void main(String args[])
{
System.out.println(j);
A obj=new A();
System.out.println(obj.i);
test();
}
}
