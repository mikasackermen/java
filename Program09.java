// Program09: multilevel inheritance.

class Super
{
	int a = 10;	
}

class Derived extends Super
{
	int b = 20;
}

class Program09 extends Derived
{
	public static void main(String[] args)
	{
		Program09 obj = new Program09();
		int ans = obj.a + obj.b;
		System.out.println(obj.a+" + "+obj.b+" = "+ans);
	}
}
