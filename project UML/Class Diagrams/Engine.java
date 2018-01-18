/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

/**
 *
 * @author rimon
 */
public class Engine implements DrawingEngine {
protected LinkedList<Shape> shapeList;
	private LinkedList<LinkedList<Shape>> undoList;
	private Stack<LinkedList<Shape>> redoStack;
	private static Engine instanceEngine = null;
 static List<Class<? extends Shape>> supportedShapes;
  
	// private static final String FILE_NAME = "/debug/markPeter00.log";

	public Engine() {

		shapeList = new LinkedList<Shape>();
		redoStack = new Stack<LinkedList<Shape>>();
		undoList = new LinkedList<LinkedList<Shape>>();

		undoList.addFirst(new LinkedList<Shape>());

	}

	public static Engine getInstance() {
		if (instanceEngine == null) {
			instanceEngine = new Engine();
		}
		return instanceEngine;
	}

	@Override
	public void refresh(Graphics canvas) {

		for (Shape shape : shapeList) {
			shape.draw(canvas);
		}

	}

	@Override
	public void addShape(Shape shape) {

		shapeList.add(shape);

		LinkedList<Shape> shapeListClone = new LinkedList<Shape>();

		shapeListClone.addAll(shapeList);

		undoList.addFirst(shapeListClone);

		redoStack.clear();


	}

	@Override
	public void removeShape(Shape shape) {

		int i = 0;
		int index = -1;
		for (Shape shape2 : shapeList) {
			if (shape2 == shape) {
				index = i;
			}
			i++;
		}

		if (index == -1)
			throw new RuntimeException();
		else {
			shapeList.remove(index);
			LinkedList<Shape> shapeListClone = new LinkedList<Shape>();
			shapeListClone.addAll(shapeList);
			undoList.addFirst(shapeListClone);
			redoStack.clear();

		}

	}

	@Override
	public Shape[] getShapes() {

		int i = 0;
		Shape[] shapesArray = new Shape[shapeList.size()];
		for (Shape shape : shapeList) {
			shapesArray[i] = shape;
			i++;
		}

		return shapesArray;
	}

	@Override
	public List<Class<? extends Shape>> getSupportedShapes() {
		// TODO Auto-generated method stub

		/*Plugin p = new Plugin();

		return p.getPlugin();*/
	return null ;
        }
@Override
    public void installPluginShape(Class<? extends Shape> shapeClass) {
       supportedShapes.add(shapeClass);
    }

	@Override
	public void undo() {

		if (undoList.size() < 2) {

			throw new RuntimeException();
		} else {

			redoStack.push(undoList.removeFirst());
			LinkedList<Shape> shapeListClone = new LinkedList<Shape>();
			shapeListClone.addAll(undoList.peekFirst());
			shapeList = shapeListClone;
		}

	}

	@Override
	public void redo() {

		if (redoStack.isEmpty()) {

			throw new RuntimeException();
		}

		undoList.addFirst(redoStack.pop());
		LinkedList<Shape> shapeListClone = new LinkedList<Shape>();
		shapeListClone.addAll(undoList.peekFirst());
		shapeList = shapeListClone;

		

	}


}
