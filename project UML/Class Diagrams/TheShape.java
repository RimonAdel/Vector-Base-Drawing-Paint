package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public abstract class TheShape implements Shape {
	protected Point position;
	protected Color color;
	protected Color fillColor;
	

	@Override
	public void setPosition(Point position) {
		this.position = position;
	}

	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public abstract void setProperties(Map<String, Double> properties) ;

	@Override
	public abstract Map<String, Double> getProperties(); 

	@Override
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void setFillColor(Color color) {
		fillColor = color;
	}

	@Override
	public Color getFillColor() {
		return fillColor;
	}

	@Override
	public abstract void draw(Graphics canvas) ;
	@Override
	public  Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
