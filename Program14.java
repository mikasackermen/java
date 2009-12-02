// Program14: abstract keywork for class.

abstract class Animal // abstract class must be extended i.e inherited.
{
	abstract void makeSound();
}

class Dog extends Animal
{
	@Override
	void makeSound() 
	{
		System.out.println("bhow..bhow...bbhowwwww");
	}
}

class Program14 extends Dog
{
	public static void main(String[] args)
	{
		Dog obj = new Dog();
		obj.makeSound();
	}
}
