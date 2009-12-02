// Program19: demonstration of thread class.
import java.lang.Thread;

public class Program19 extends Thread
{
	public void run() 
	{
		System.out.println("Thread "+ Thread.currentThread().getName() + " is running.");
	}
	
	public static void main(String[] args)
	{
		Program19 thread1 = new Program19();
		Program19 thread2 = new Program19();

		thread1.start();
		thread2.start();
	}		
}

