// Program21: multiple threads in same program.
import java.lang.Thread;

public class Program21 extends Thread
{
	private int threadNumber;
	
	public Program21 (int threadNumber)
	{
		this.threadNumber = threadNumber;
	}	

	public void run() 
	{
		for (int i = 1; i <= 3; i++) {
                        System.out.println("thread " + threadNumber + " - count: " + i);
                        try {
                                Thread.sleep(2000); // execution sleep (paused) for 2 second.
                        } catch (InterruptedException e) {
                                System.out.println("thread " +threadNumber + "interrupted");
                        }
                }

	}

	public static void main(String[] args)
	{
		Program21 thread1 = new Program21(1);
                Program21 thread2 = new Program21(2);
		Program21 thread3 = new Program21(3);		

                thread1.start();
                thread2.start();
		thread3.start();

	}
}
