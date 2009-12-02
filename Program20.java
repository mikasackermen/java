// Program20: demonstration of sleep() method of thread class.
import java.lang.Thread;

public class Program20 extends Thread
{
	public void run() 
	{
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - count: " + i);
			try {
				Thread.sleep(2000); // execution sleep (paused) for 2 second.
			} catch (InterruptedException e) {
				System.out.println("thread interrupted.");
			}
		}
	}	

	public static void main(String[] args)
	{
		Program20 thread1 = new Program20();
		Program20 thread2 = new Program20();

		thread1.start();
		thread2.start();
	}
}
