// Program30: AWT components in java

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Program30 extends Applet implements ActionListener 
{
    	Button btn;
    	TextField tf;
    	Label lbl;
    
    	public void init() 
	{
        	setLayout(new FlowLayout());
        
        	lbl = new Label("what's your name:");
        	add(lbl);
        
        	tf = new TextField(20);
        	add(tf);
        
        	btn = new Button("save");
        	add(btn);
        	btn.addActionListener(this);
    	}
    
    	public void actionPerformed(ActionEvent e) 
	{
        	String name = tf.getText();
        	lbl.setText("hello, " + name + "!");
    	}
    
    	public void paint(Graphics g) 
	{
        	g.drawRect(10, 10, getWidth() - 20, getHeight() - 20);
    	}
}
