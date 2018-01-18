package eg.edu.alexu.cse.oop.draw;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

public class Line extends TheShape {
	
	private Map<String,Double> lineProperties;
	public Line(){
		lineProperties= new HashMap<String,Double >();
                lineProperties.put("Pointx", null);
			lineProperties.put("Pointy", null);
	}
	
	@Override
	public void setProperties(Map<String, Double> properties) {
		lineProperties = properties;
		
	}

	@Override
	public Map<String, Double> getProperties() {
		return lineProperties;
	}

	@Override
	public void draw(Graphics canvas) {	
	    	canvas.setColor(fillColor);
	    	 canvas.drawLine(  position.x,  position.y,(int)lineProperties.get("Pointx").doubleValue(),(int) lineProperties.get("Pointy").doubleValue());
		//	 canvas.setColor(color);
			 canvas.drawLine(position.x, position.y, (int) lineProperties.get("Pointx").doubleValue(),(int) lineProperties.get("Pointy").doubleValue());
		
	}
        public Object clone() {
            Line c= new Line();
            c.setPosition(position);
            c.setProperties(lineProperties);
            c.setColor(color);
            c.setFillColor(fillColor);
            return c;
	} 

}