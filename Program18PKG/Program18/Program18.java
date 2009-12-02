package Program18;
import java.util.*;

import Addition.Add;
import Substraction.Sub;
import  Multiplication.Multi;
import Division.Divide;

public class Program18
{
	public static void main(String args[])
	{
		System.out.println("-----selection menu-----");
		System.out.print("1. addition \n2. subtraction \n3. multiplication \n4. divisioin \n select option : ");

		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		switch(t)
		{
			case 1:
				Add a = new Add();
				a.sum();
			break;
			
			case 2:
				Sub s = new Sub();
				s.minus();
			break;
			
			case 3:
				Multi m = new Multi();
				m.multi();
			break;		
			
			case 4:
				Divide  d = new Divide();
				d.div();
			break;

			default: System.out.println("invalid option selected.");
		}
	}
}
