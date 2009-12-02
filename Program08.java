// Program08: write a program to demonstrate single inheritance.

class Base
{
	String name = "Stuart Little";
	void Greet() {
		System.out.println("----- original base class properties----- ");
		System.out.println("Hello, "+name);
	}
}

class Program08 extends Base 
{
	String name = "Mailo the cat";
	@Override
	void Greet() {
		System.out.println("Hello, "+name+" meow...");
	}
	public static void main(String[] args) 
	{
		Program08 obj = new Program08();
		obj.Greet();

		// no need to create object for base class but here we have overidden Greet() so...
		Base obj2 = new Base();
		obj2.Greet();	
	}
}
