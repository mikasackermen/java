// Program16: implements keyword; however, it is same as Program15 i.e. demonstration of interface class.

interface A 
{
	void methodA();
}

interface B 
{
	void methodB();
}

class sample implements A, B
{
	public void methodA() 
	{
		System.out.println("Method A used in interface: A");
	}

	public void methodB() 
	{
		System.out.println("Method B used in interface: B");
	}
}

public class Program16
{
	public static void main(String[] args)
	{
		sample obj = new sample();
		obj.methodA();
		obj.methodB();
	}
}
