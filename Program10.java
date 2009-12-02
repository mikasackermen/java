/*	
	Program10:
	-----------
	Class Number has a variable x which is an integer number. Class Square is derived
	from class number which prints square of the given number and class Cube is derived
	from class Square which prints the cube of the integer number. Write a progrma to
	demonstrate the mechanism.
*/

class Number 
{
	int x = 10;
}

class Square extends Number
{
	double sqr = Math.pow(x,2);
	void displaySquare() {
		System.out.println("square of 10 is: "+sqr);
	}
}

class Cube extends Square
{
	double cube = Math.pow(x,3);
	void displayCube() {
		System.out.println("cube of 10 is: "+cube);
	}

}

class Program10 extends Cube
{
	public static void main(String[] args)
	{
		Cube obj = new Cube();
		System.out.println("value of x is: "+obj.x);
		obj.displaySquare();
		obj.displayCube();
	}
}
