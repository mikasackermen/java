// Program07: write a program to demonstrate parameterized constructor.

class Program07
{
	Program07(String name)
	{
		System.out.println("Hello, "+name);
	}

	public static void main(String[] args) 
	{
		Program07 obj = new Program07("Stuart Little");
	}
}	
