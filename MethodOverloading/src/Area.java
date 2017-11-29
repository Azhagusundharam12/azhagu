public class Area
{
	void rect()
	{
		int len=12;
		int width=20;
		int area=len*width;
		System.out.println("Area of rectangle="+area);
	}
	void triangle(int h,int b)
	{
		int area=(h*b)/2;
		System.out.println("Area of Trianle="+area);
	}
	public static void main(String[] args)
	{
		Area a1=new Area();
		a1.rect();
		a1.triangle(12, 6);
	}
}
