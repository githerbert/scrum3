package de.scrummies.scrum3;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

public class ScreenSize {
	
	// Klasse dient für die Ausrichtung der GUI's
	 
	private Dimension dimension;
	private int x;
	private int y;
	
	public ScreenSize(Component comp){
	    dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    x = (int) ((dimension.getWidth() - comp.getWidth()) / 2);
	    y = (int) ((dimension.getHeight() - comp.getHeight()) / 2);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
