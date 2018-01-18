/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author rimon
 */
public class Canvas extends JPanel {
     private Graphics graphic;
   private static Canvas canvas=null;
           public static Canvas getInstance() {
		if (canvas == null) {
			canvas = new Canvas();
		}
		return canvas;
	}

	public void paintComponent(Graphics g) {
                
		super.paintComponent(g);
	    graphic = (Graphics)g;
		Engine.getInstance().refresh(g); 
                repaint();  
        }
        public void edit(Class clss,Color color,Color fillColor,Point p,Map<String,Double> map,int i){
            /* Shape shape=(Shape)clss.newInstance();
            shape.setColor(color);
            shape.setFillColor(fillColor);
            shape.setPosition(p);
            shape.setProperties(map);*/
            Engine.getInstance().shapeList.get(i).setColor(color);
            Engine.getInstance().shapeList.get(i).setFillColor(fillColor);
            Engine.getInstance().shapeList.get(i).setPosition(p);
            Engine.getInstance().shapeList.get(i).setProperties(map);
            repaint();
        }
        public void draw(Class cls,Point p,Map<String,Double> map)
        {
         try {
             Shape shape=(Shape)cls.newInstance();
             shape.setProperties(map);
             shape.setPosition(p);
             shape.setColor(Color.BLACK);
             shape.setFillColor(Color.white);
             if(cls.getSimpleName().equals("Line")){
                 shape.setFillColor(Color.black);
             }
             Engine.getInstance().addShape(shape);
             repaint();
         } catch (InstantiationException ex) {
             Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
}
   

