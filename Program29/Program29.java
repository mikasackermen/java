// Program29: ActionListner()

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program29 extends Applet implements ActionListener 
{
	 private String message = "";
	 private Button clickButton;

    	public void init() 
	{
        	clickButton = new Button("click me");
 	       	add(clickButton);
        	clickButton.addActionListener(this);
    	}

    	public void paint(Graphics g) 
	{
        	g.drawString(message, 50, 60);
    	}

    	@Override
    	public void actionPerformed(ActionEvent e) 
	{
        	message = "button was clicked!";
        	repaint();
    	}
}
