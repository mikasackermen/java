// Program15: interface keyword.
 
interface Dog
{
	public void bark();
}       
 
interface Cat
{
        public void meow();
}       
 
class Program15 implements  Dog, Cat
{
	@Override
	public void bark()
        {
                System.out.println("bhow..bhow..bhowwww");
        }       
	
	@Override
	public void meow()
        {
                System.out.println("meow..meowww...");
        }       	

        public static void main(String[] args)
        {       
                Program15 obj = new Program15();
                obj.bark();    
                obj.meow();
        }       
}       

