package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

public class Rectangle extends TheShape {
private Map<String,Double> recProperties;
public Rectangle(){
	recProperties= new HashMap<String,Double >();
        recProperties.put("length", null);
        recProperties.put("width", null);

        
}
	@Override
	public void setProperties(Map<String, Double> properties) {
		
		recProperties= properties;
	}

	@Override
	public Map<String, Double> getProperties() {
		
		return recProperties;
	}

	@Override
	public void draw(Graphics canvas) {
             canvas.setColor(fillColor);
           canvas.fillRect( position.x, position.y, (int)recProperties.get("length").doubleValue(), (int)recProperties.get("width").doubleValue());
     		canvas.setColor(color);
		canvas.drawRect(position.x, position.y, (int)recProperties.get("length").doubleValue(), (int)recProperties.get("width").doubleValue());
		
	}
         public Object clone() {
            Rectangle c= new Rectangle();
            c.setPosition(position);
            c.setProperties(recProperties);
            c.setColor(color);
            c.setFillColor(fillColor);
            return c;
	} 

}
