//Program28: MouseListner()

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Program28 extends Applet implements MouseListener 
{
	private String message = "no clicks yet.";

	public void init() 
	{
        	addMouseListener(this);
    	}

	public void paint(Graphics g) 
	{
        	g.drawString(message, 20, 20);
    	}

    	@Override
    	public void mouseClicked(MouseEvent e) 
	{
        	message = "mouse clicked at (" + e.getX() + ", " + e.getY() + ")";
        	repaint();
    	}

    	@Override
    	public void mouseEntered(MouseEvent e) {}
    	@Override
   	public void mouseExited(MouseEvent e) {}
    	@Override
    	public void mousePressed(MouseEvent e) {}
    	@Override
    	public void mouseReleased(MouseEvent e) {}
}
