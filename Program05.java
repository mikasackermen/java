// Program05: write a program to print numbers divisible by 7 upto 100.

class Program05
{
	public static void main(String[] args)
	{
		for (int i=1;i<=100;i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}
