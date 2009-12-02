/*
	Program18:
	----------
	Package “Calculate” has classes “sum” and “sub” with performs addition and
	subtraction of 2 integer variables using required functions respectively. Write a Java
	program to demonstrate this mechanism.
*/

package Addition;
import java.util.*;

public class Add
{
	int ans = 0;
	public void sum()
	{
		System.out.print("num1 : ");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		
		System.out.print("num2 : ");
		Scanner scan1=new Scanner(System.in);
		int num2=scan1.nextInt();
		
		ans = num1 + num2;
		System.out.println(num1+ " + " +num2+" = "+ans);
	}

	public static void main(String[] args)
	{
		Add obj = new Add();
		obj.sum();
	}
}
