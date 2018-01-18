package eg.edu.alexu.cse.oop.draw;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import java.awt.Point;
import java.awt.Color;

public class Triangle extends TheShape {

	private Map<String,Double> triProperties;
	public Triangle(){
		triProperties= new HashMap<String,Double >();
                triProperties.put("LineLength" ,null);
	}
	
	@Override
	public void setProperties(Map<String, Double> properties) {
		triProperties = properties;
		
	}

	@Override
	public Map<String, Double> getProperties() {
		return triProperties;
		
	}
	@Override
	public void draw(Graphics canvas) {
		Double line = (Double)  triProperties.get("LineLength");
		Double squareLine = Math.pow((line), 2);
		Double halfSquareLine = Math.pow(line/2, 2);
		Double squareAverageLine = squareLine-halfSquareLine;
		Double rootSquareAverageLine = Math.pow(squareAverageLine, 0.5);
		Double rootSquareAverageLineOnThree = rootSquareAverageLine/3;
		Double rootSquareAverageLineOnThreeCrossTwo =rootSquareAverageLineOnThree*2;
		
		Point p1 = new Point(position.x , (int) (position.y -rootSquareAverageLineOnThreeCrossTwo));
		Point p2 = new Point((int) (position.x +line/2) , (int) (position.y+rootSquareAverageLineOnThree));
		Point p3 = new Point((int) (position.x -line/2) ,  (int) (position.y+rootSquareAverageLineOnThree));
		
		int xPoly[] = { p1.x , p2.x , p3.x};
        int yPoly[] = { p1.y , p2.y , p3.y};
        
        canvas.setColor(fillColor);
          canvas.fillPolygon(xPoly , yPoly , xPoly.length);
        canvas.setColor(color);
      canvas.drawPolygon(xPoly , yPoly , xPoly.length);	
	}
        public  Object clone() throws CloneNotSupportedException {
		Triangle e= new Triangle();
                e.setProperties(triProperties);
                e.setColor(color);
                e.setFillColor(fillColor);
                e.setPosition(position);
		return e;
	}
	

}
