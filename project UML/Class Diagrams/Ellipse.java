package eg.edu.alexu.cse.oop.draw;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

public class Ellipse extends TheShape {
private Map<String,Double> ellipseProperties;
public Ellipse(){
	ellipseProperties= new HashMap<String,Double >();
        ellipseProperties.put("length", null);
        ellipseProperties.put("width", null);
}
	@Override
	public void setProperties(Map<String, Double> properties) {
		
		ellipseProperties= properties;
	}

	@Override
	public Map<String, Double> getProperties() {
		
		return ellipseProperties;
	}

	@Override
	public void draw(Graphics canvas) {
             canvas.setColor(fillColor);
       canvas.fillOval(position.x, position.y, (int)ellipseProperties.get("length").doubleValue(), (int)ellipseProperties.get("width").doubleValue());
        canvas.setColor(color);
		canvas.drawOval(position.x, position.y, (int)ellipseProperties.get("length").doubleValue(), (int)ellipseProperties.get("width").doubleValue());
		
	}
        public  Object clone() throws CloneNotSupportedException {
		Ellipse e= new Ellipse();
                e.setProperties(ellipseProperties);
                e.setColor(color);
                e.setFillColor(fillColor);
                e.setPosition(position);
		return e;
	}

}
