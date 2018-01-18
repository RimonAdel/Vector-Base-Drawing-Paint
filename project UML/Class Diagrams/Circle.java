package eg.edu.alexu.cse.oop.draw;

import eg.edu.alexu.cse.oop.draw.TheShape;
import eg.edu.alexu.cse.oop.draw.TheShape;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

public class Circle extends TheShape {
	
	private Map<String, Double> circleProperties;
	
	public Circle() {
		circleProperties = new HashMap<String,Double>() ;
                circleProperties.put("radius", null);
	}
	
	
	@Override
	public void setProperties(Map<String, Double> properties) {
		circleProperties.putAll(properties);
	}

	@Override
	public Map<String, Double> getProperties() {
		return circleProperties;
	}
	
	
	@Override
	public void draw(Graphics canvas) {
          
        
        canvas.setColor(fillColor);
       canvas.fillOval(position.x, position.y,(int) circleProperties.get("radius").doubleValue(),(int) circleProperties.get("radius").doubleValue());
       canvas.setColor(color);
        canvas.drawOval( position.x, position.y,(int) circleProperties.get("radius").doubleValue(),(int) circleProperties.get("radius").doubleValue());
	}

	@Override
	public Object clone() {
            Circle c= new Circle();
            c.setPosition(position);
            c.setProperties(circleProperties);
            c.setColor(color);
            c.setFillColor(fillColor);
            return c;
	} 
}
