// Program26: drawOval function in applet to draw an oval.

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Program26 extends Applet {
	@Override
	public void paint(Graphics g) 
	{
		g.setColor(Color.RED);
		g.drawOval(50,50,150,100);
		g.fillOval(50,50,150,100);
	}
}
