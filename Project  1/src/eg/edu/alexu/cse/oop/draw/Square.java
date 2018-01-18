package eg.edu.alexu.cse.oop.draw;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

public class Square extends TheShape {
	Map<String,Double> squareProperties;
public Square(){
	squareProperties= new HashMap<String,Double>();
        squareProperties.put("sides", null);
}
	@Override
	public void setProperties(Map<String, Double> properties) {
		squareProperties= properties;
		
	}

	@Override
	public Map<String, Double> getProperties() {
		return squareProperties;
	}

	@Override
	public void draw(Graphics canvas) {
canvas.setColor(fillColor);
		canvas.fillRect( position.x, position.y,(int)squareProperties.get("sides").doubleValue(),(int)squareProperties.get("sides").doubleValue());
		canvas.setColor(color);	   
canvas.drawRect(position.x, position.y,(int)squareProperties.get("sides").doubleValue(),(int)squareProperties.get("sides").doubleValue());	
}
        public Object clone() {
            Square c= new Square();
            c.setPosition(position);
            c.setProperties(squareProperties);
            c.setColor(color);
            c.setFillColor(fillColor);
            return c;
	} 

}
