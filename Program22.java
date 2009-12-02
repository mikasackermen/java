// Program22: thread priorities.
import java.lang.Thread;

public class Program22 implements Runnable
{
	private String threadName;

	public Program22(String threadName) 
	{
		this.threadName = threadName;
	}

	@Override
	public void run() 
	{
		for (int i = 1; i <= 3; i++) {
			System.out.println(threadName + " - count: "+ i);
			try {
                                Thread.sleep(2000); // execution sleep (paused) for 2 second.
                        } catch (InterruptedException e) {
                                System.out.println("thread " +threadName + "interrupted");
                        }

		}
	}

	public static void main(String[] args) 
	{
		Program22 runnable1 = new Program22("thread 1");
		Program22 runnable2 = new Program22("thread 2");
		Program22 runnable3 = new Program22("thread 3");

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		Thread thread3 = new Thread(runnable3);

		// set priorities
		thread1.setPriority(Thread.MIN_PRIORITY); 	// priority: 1
		thread1.setPriority(Thread.NORM_PRIORITY); 	// priority: 5
		thread1.setPriority(Thread.MAX_PRIORITY);	// priority: 10

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
