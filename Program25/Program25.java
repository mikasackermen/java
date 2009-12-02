// Program25: demostration of applet functiom drawLine() to draw a line.

import java.applet.Applet;
import java.awt.Graphics;

public class Program25 extends Applet 
{
	@Override
	public void paint(Graphics g) {
		g.drawLine(20, 20, 200, 200);
	}
}
