// Program 11: demonstration of final keyword.

class Final
{
	final void Pi() {
		final double pi = 3.14;
		System.out.println("final key word for variable pi : "+pi+" this cannot be modify.");	
	}
}

final class Program11 extends Final 
{
	final void Info() {
		System.out.println("this is final class and final function. final class cannot be inherited and method cannot be overidden.");
	}

	public static void main(String[] args)
	{
		Program11 obj = new Program11();
		obj.Info();
		obj.Pi();		
	}
}
