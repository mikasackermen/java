// Peogram13: demonstration of abstract function.

abstract class Info
{
	abstract void info();
	void note() 
	{
		System.out.println("this is non-abstract method. this program will display information about individuals.");
	}
}

class Person1 extends Info
{
	@Override
	void info() 
	{
		String name = "Stuart Little";
		int age = 10;
		String city = "Newyork, USA";	

		System.out.println("-----info-----");	
		System.out.println("name: "+name);
		System.out.println("age :"+age);
		System.out.println("city:"+city);
	}
}
class Program13 extends Person1
{
	public static void main(String[] args)
	{
		Program13 obj = new Program13();
		obj.note();
		obj.info();
	}
}
