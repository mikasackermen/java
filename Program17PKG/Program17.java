/*
        Program17:
        ----------
        Create a pacake “Program17PKG” with a class “Program17” with appropriate functions and use it in
        Java Program.
*/

package Program17PKG;
import java.util.*;

public class Program17
{
        public void greet()
        {
                System.out.print("what's your name?\n myself, ");
                Scanner scan = new Scanner(System.in);
                String name = scan.nextLine();

		System.out.println("hello, "+name+"!");
        }

        public static void main(String[] args)
        {
                Program17 obj = new Program17();
                obj.greet();
        }
}

