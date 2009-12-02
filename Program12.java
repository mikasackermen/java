// Program12: final class

final class FinalClass  
{  
    	public void display()  
    	{  
        	System.out.println("inside finalclass display method.");  
    	}  
}  

// uncommenting the code below will cause a compile-time error because final class cannot be extended i.e inherited.
/*  
class SubClass extends FinalClass  
{  
    	// Cannot extend a final class  
}  
*/  

public class Program12 
{  
   	public static void main(String[] args)  
    	{  
        	FinalClass obj = new FinalClass();  
        	obj.display();  
    	}  
}
