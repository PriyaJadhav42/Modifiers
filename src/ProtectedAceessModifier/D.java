package ProtectedAceessModifier;

public class D {
 int x=30;
 protected void M5()
 {
	 System.out.println("M5 method of protected class");
	 
 }
 public static void main(String[] args)
 {
	 D d=new D();
	 System.out.println(d.x);
	 d.M5();
	 
 }
}
