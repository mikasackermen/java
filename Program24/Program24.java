//Program24: Create an Applet and use drawRect() function to draw a Rectangle

import java.applet.Applet;
import java.awt.Graphics;

public class Program24 extends Applet 
{
	@Override
	public void paint(Graphics g) 
	{
		g.drawRect(50, 50, 100, 80);
		g.fillRect(50, 50, 100, 80);
	}
}
