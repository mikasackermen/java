// Program27: Indian flag using applet

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Program27 extends Applet  
{  
	public void paint(Graphics g)  
    	{  
        	int width = getWidth();  
        	int height = getHeight();  
        	int stripeHeight = height / 3;  
        
        	// Saffron   
        	g.setColor(new Color(255, 153, 51));  
        	g.fillRect(0, 0, width, stripeHeight);  
        
        	// White  
        	g.setColor(Color.white);  
        	g.fillRect(0, stripeHeight, width, stripeHeight);  
        
        	// Green 
        	g.setColor(new Color(19, 136, 8));  
        	g.fillRect(0, 2 * stripeHeight, width, stripeHeight);  
        
        	// Ashoka Chakra   
        	int circleDiameter = stripeHeight / 2;  
        	int circleX = (width - circleDiameter) / 2;  
        	int circleY = stripeHeight + (stripeHeight - circleDiameter) / 2;  
        	g.setColor(new Color(0, 0, 128));  
        	g.drawOval(circleX, circleY, circleDiameter, circleDiameter);  
        
       		// Draw 24 spokes in the chakra  
        	int centerX = circleX + circleDiameter / 2;  
        	int centerY = circleY + circleDiameter / 2;  
        	double angleIncrement = 2 * Math.PI / 24;  
        
        	for (int i = 0; i < 24; i++)  {  
            		double angle = i * angleIncrement;  
            		int xEnd = centerX + (int) ((circleDiameter / 2) * Math.cos(angle));  
            		int yEnd = centerY + (int) ((circleDiameter / 2) * Math.sin(angle));  
            		g.drawLine(centerX, centerY, xEnd, yEnd);  
        	}  
    	}  
}
