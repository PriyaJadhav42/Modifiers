package PrivateAcessModifier;

public class X {

	private int i=10;
	private void m2()
	{
		System.out.println("Method M2 of private X  class");
	}
	public static void main(String[] args)
	{
		X x=new X();
		System.out.println(x.i);
		x.m2();
	}
}
