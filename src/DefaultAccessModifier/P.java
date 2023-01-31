package DefaultAccessModifier;

public class P {
  int i=30;
void m3()
{
System.out.println("M3 method of defaultModifier");	
}
public static void main(String[] args)
{
P p=new P();
System.out.println(p.i);
p.m3();
}
}
