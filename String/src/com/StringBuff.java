package com;

public class StringBuff
{
	public static void main(String[] args)
	{
		//legacy
		StringBuffer s1 = new StringBuffer("    welcome");
//		s1.append("abc");
//		s1.append("fff");
//		s1.append("hhh");
//		s1.append("jj");
//		s1.append("abkkkc");
//		s1.append("jjj");
//		s1.append("abkkkc");
		String s2=s1.toString().trim();
		System.out.println(s2);
		System.out.println(s1.reverse());

	}

}
