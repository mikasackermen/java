// Program23: create a simple applet using Applet tag of java.
import java.applet.Applet;
import java.awt.Graphics;

public class Program23 extends Applet
{
	@Override
	public void paint (Graphics g)
	{
		g.drawString("hello, applet!", 50, 25);
	}
}
