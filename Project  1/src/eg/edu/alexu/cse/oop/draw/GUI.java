/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author rimon
 */
public class GUI extends javax.swing.JFrame {
    private JButton plugine;
	private String string;
	private boolean drawPlugin = false;
        private Class<?> cload;
        private int flage =0;
private JTextField[] array ;
	private JTextField jt1 =null;
	private JTextField jt2 = null;
	private JTextField jt3 = null;
	private JTextField jt4 = null;
	private JTextField jt5 = null;
	private JTextField jt6 = null;
	/*private JTextField jt7 = null;
	private JTextField jt8 =  null;
	private JTextField jt9 = null;
	private JTextField jt10 =  null;*/
private Point p= null;
   private Map<String,Double> m;
   private Map returnmap =null ;
   private Map<String, Double> mmap ;
   //private static final Map<Integer,String> mapofpaths= new HashMap<Integer,String>();
   // private static final Map<Integer,String> shapes= new HashMap<Integer,String>();
    private  int counter2=0;
   private String path=null;
    public GUI() {
         m=new HashMap<String,Double>();
        initComponents();
             }
public void shapeinput(Map<String,Double> map,Class cls,int j){
Canvas c= new Canvas();
int counter=0;
shapeinput.setTitle("                                          "+cls.getSimpleName());
        Point p= new Point();
     JTextField[] array ;
	 JTextField jt1 = new JTextField();
	 JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	 JTextField jt5 = new JTextField();
	JTextField jt6 = new JTextField();
	 JTextField jt7 = new JTextField();
	 /* JTextField jt8 = new JTextField();
	 JTextField jt9 = new JTextField();
	 JTextField jt10 = new JTextField();*/
     array = new JTextField[10];
		
		array[0] = jt1  ;
		array[1] = jt2  ;
		array[2] = jt3  ;
		array[3] = jt4  ;
		array[4] = jt5  ;
		array[5] = jt6  ;
		array[6] = jt7  ;
		/*array[7] = jt8  ;
		array[8] = jt9  ;
		array[9] = jt10 ;*/
     mmap = map ;
  JPanel contentpanel = null;
   JLabel lblNewLabel ;
   JPanel datapanel=new JPanel();
    contentpanel = new JPanel();
    JPanel agreepanel =new JPanel();
   JPanel positionpanel =new JPanel();
   JButton agree= new JButton("agree");
    contentpanel.setLayout(new BorderLayout(0,0));
    shapeinput.setContentPane(contentpanel);
    contentpanel.add(positionpanel,BorderLayout.NORTH);
    positionpanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5) );
     JTextField pointx = new JTextField();
  JTextField pointy = new JTextField("0");
     JLabel label1=new JLabel("enter first point x");
   JLabel label2=new JLabel("enter first point y");
   label1.setBounds(80, 40, 46, 14);
   pointx.setBounds(60,40,46,14);
     pointx.setColumns(5);
   pointx.setText("0");
   positionpanel.add(label1);
    positionpanel.add(pointx) ;
   label2.setBounds(60, 40, 46, 14);
   pointy.setColumns(5);
pointy.setBounds(60,40,46,14);
  positionpanel.add(label2);
  positionpanel.add(pointy);
 contentpanel.add(agreepanel,BorderLayout.SOUTH);
    contentpanel.add(datapanel,BorderLayout.CENTER);
    try{
        int num=0;
		//Print Properties on screen screen in frame to set it from user
		for (Map.Entry<String, Double> entry : map.entrySet() )
		{
			
			lblNewLabel = new JLabel(entry.getKey());
			lblNewLabel.setBounds(85, 40+counter, 46, 14);
			datapanel.add(lblNewLabel);
			
			array[num].setText("0");
			array[num].setBounds(231, 37+counter, 86, 20);
			datapanel.add(array[num]);
			array[num].setColumns(10);
			counter+=30;
			num++;
		}
		}catch(Exception e){}
    agreepanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
    Map returnmap =null;
    agreepanel.add(agree);
  agree.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent event) {      
           int num2 = 0 ;
            Map returnmap = new HashMap<String , Double>();
            int x=Integer.parseInt(pointx.getText());
  int y=Integer.parseInt(pointy.getText());
  p.setLocation(x, y); 
				try{
				for (Map.Entry<String, Double> entry : map.entrySet() )
				{
					returnmap.put(entry.getKey(), Double.parseDouble(array[num2].getText()));
					num2++;      
				}
                          
                              if(j==0){
                                   Canvas.getInstance().draw((cls),p,returnmap);
                              shapechooser.addItem(cls.getSimpleName()+counter2); 
                               counter2++;
                              }else if(j==1){
                                  
                                  Canvas.getInstance().edit(cls,Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).getColor(),Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).getFillColor(),p,returnmap,shapechooser.getSelectedIndex());
                              

                              }
                             
				}catch(NumberFormatException e){}	
				    shapeinput.dispose();
         } 
        });
   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        shapeinput = new javax.swing.JDialog();
        moveinput = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pointx = new javax.swing.JTextField();
        pointy = new javax.swing.JTextField();
        doo = new javax.swing.JButton();
        colorinput = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        fillcolor = new javax.swing.JButton();
        bordercolor = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        componentpanel = new javax.swing.JPanel();
        circle = new javax.swing.JButton();
        ellipse = new javax.swing.JButton();
        rectangle = new javax.swing.JButton();
        square = new javax.swing.JButton();
        line = new javax.swing.JButton();
        triangle = new javax.swing.JButton();
        draw = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        move = new javax.swing.JButton();
        undo = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        copy = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        plugin = new javax.swing.JButton();
        color = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        shapechooser = new javax.swing.JComboBox<>();
        drawingarea = new Canvas();

        javax.swing.GroupLayout shapeinputLayout = new javax.swing.GroupLayout(shapeinput.getContentPane());
        shapeinput.getContentPane().setLayout(shapeinputLayout);
        shapeinputLayout.setHorizontalGroup(
            shapeinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        shapeinputLayout.setVerticalGroup(
            shapeinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel2.setText("point x");

        jLabel3.setText("point y");

        pointx.setText("0");
        pointx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointxActionPerformed(evt);
            }
        });

        pointy.setText("0");

        doo.setText("move");
        doo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dooActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pointx)
                            .addComponent(pointy, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(doo)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(doo)
                .addGap(48, 48, 48))
        );

        moveinput.getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        fillcolor.setText("FillColor");
        fillcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillcolorActionPerformed(evt);
            }
        });

        bordercolor.setText("BorderColor");
        bordercolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bordercolorActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fillcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bordercolor)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(cancel)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fillcolor)
                    .addComponent(bordercolor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(42, 42, 42))
        );

        colorinput.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        componentpanel.setLayout(new java.awt.GridBagLayout());

        circle.setText("Circle");
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });
        componentpanel.add(circle, new java.awt.GridBagConstraints());

        ellipse.setText("Ellipse");
        ellipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ellipseActionPerformed(evt);
            }
        });
        componentpanel.add(ellipse, new java.awt.GridBagConstraints());

        rectangle.setText("Rectanle");
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });
        componentpanel.add(rectangle, new java.awt.GridBagConstraints());

        square.setText("Square");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });
        componentpanel.add(square, new java.awt.GridBagConstraints());

        line.setText("LineSegmant");
        line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineActionPerformed(evt);
            }
        });
        componentpanel.add(line, new java.awt.GridBagConstraints());

        triangle.setText("Triangle");
        triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleActionPerformed(evt);
            }
        });
        componentpanel.add(triangle, new java.awt.GridBagConstraints());

        draw.setText("Plugin Draw");
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });
        componentpanel.add(draw, new java.awt.GridBagConstraints());

        getContentPane().add(componentpanel, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        move.setText("Move");
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        jPanel3.add(move, gridBagConstraints);

        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        jPanel3.add(undo, gridBagConstraints);

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 11, 0, 0);
        jPanel3.add(delete, gridBagConstraints);

        redo.setText("Redo");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 12);
        jPanel3.add(redo, gridBagConstraints);

        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        jPanel3.add(copy, gridBagConstraints);

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 11, 0, 0);
        jPanel3.add(edit, gridBagConstraints);

        plugin.setText("Plugin");
        plugin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pluginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 447, 0);
        jPanel3.add(plugin, gridBagConstraints);

        color.setText("Colorize");
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 11, 447, 0);
        jPanel3.add(color, gridBagConstraints);

        jLabel1.setText("Choose Shape");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel3.add(shapechooser, gridBagConstraints);

        jPanel2.add(jPanel3, java.awt.BorderLayout.LINE_START);

        drawingarea.setBackground(new java.awt.Color(255, 255, 255));
        drawingarea.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), null));

        javax.swing.GroupLayout drawingareaLayout = new javax.swing.GroupLayout(drawingarea);
        drawingarea.setLayout(drawingareaLayout);
        drawingareaLayout.setHorizontalGroup(
            drawingareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        drawingareaLayout.setVerticalGroup(
            drawingareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );

        jPanel2.add(drawingarea, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
  Engine.getInstance().undo();
  Shape[] shapes= new Shape[Engine.getInstance().shapeList.size()];
counter2=0;
shapes=Engine.getInstance().getShapes();
shapechooser.removeAllItems();
for(Shape  x:shapes ){
   shapechooser.addItem(x.getClass().getSimpleName()+counter2);
   counter2++;
}
Canvas.getInstance().repaint();
    }//GEN-LAST:event_undoActionPerformed

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleActionPerformed
        try {
            shapeInput();
            Class clss= Class.forName("eg.edu.alexu.cse.oop.draw.Circle");
             Shape shape=(Shape)clss.newInstance();
            m= new HashMap();
            m=shape.getProperties();
            shapeinput(m,clss,0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_circleActionPerformed

    private void ellipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ellipseActionPerformed
        try {
            shapeInput();
            m= new HashMap();
            Class clss= Class.forName("eg.edu.alexu.cse.oop.draw.Ellipse");
            Shape shape=(Shape)clss.newInstance();
            m=shape.getProperties();
            shapeinput(m,clss,0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ellipseActionPerformed

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
       try {
            shapeInput();
            m= new HashMap();
            Class clss= Class.forName("eg.edu.alexu.cse.oop.draw.Rectangle");
            Shape shape=(Shape)clss.newInstance();
            m=shape.getProperties();
            shapeinput(m,clss,0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rectangleActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
       try {
            shapeInput();
            m= new HashMap();
            Class clss= Class.forName("eg.edu.alexu.cse.oop.draw.Square");
            Shape shape=(Shape)clss.newInstance();
            m=shape.getProperties();
            shapeinput(m,clss,0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_squareActionPerformed

    private void lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineActionPerformed
       try {
            shapeInput();
            m= new HashMap();
            Class clss= Class.forName("eg.edu.alexu.cse.oop.draw.Line");
            Shape shape=(Shape)clss.newInstance();
            m=shape.getProperties();
            shapeinput(m,clss,0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lineActionPerformed

    private void triangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleActionPerformed
         try {
            shapeInput();
            m= new HashMap();
            Class clss= Class.forName("eg.edu.alexu.cse.oop.draw.Triangle");
            Shape shape=(Shape)clss.newInstance();
            m=shape.getProperties();
            shapeinput(m,clss,0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_triangleActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        colorinput.setSize(300,300);
        colorinput.setVisible(true);
        colorinput.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_colorActionPerformed

    private void fillcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillcolorActionPerformed
Color color=JColorChooser.showDialog(null, "Choose Color",Color.red);
  Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).setFillColor(color);
  //System.out.println(shapechooser.getSelectedIndex());
    }//GEN-LAST:event_fillcolorActionPerformed

    private void bordercolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bordercolorActionPerformed
Color color=JColorChooser.showDialog(null, "Choose Color",Color.red);
Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).setColor(color);
System.out.println(shapechooser.getSelectedIndex());
    }//GEN-LAST:event_bordercolorActionPerformed
 
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
colorinput.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveActionPerformed
moveinput.setVisible(true);
    moveinput.setSize(300,300);
    moveinput.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
    }//GEN-LAST:event_moveActionPerformed

    private void pointxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointxActionPerformed

    private void dooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dooActionPerformed

        if (flage==0){
        int x=Integer.parseInt(pointx.getText());
        int y=Integer.parseInt(pointy.getText());
        Point position = new Point();
        position.setLocation(x, y);
        Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).setPosition(position);
        moveinput.dispose();
        }  
        else if (flage==1){
          int x=Integer.parseInt(pointx.getText());
        int y=Integer.parseInt(pointy.getText());
        Point position = new Point();
        position.setLocation(x, y);
        Engine.getInstance().shapeList.get(Engine.getInstance().shapeList.size()-1).setPosition(position);
        moveinput.dispose();  
        flage=0;
        }
    }//GEN-LAST:event_dooActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
     Engine.getInstance().removeShape( Engine.getInstance().shapeList.remove(shapechooser.getSelectedIndex()));
     /* shapechooser.removeItemAt(shapechooser.getSelectedIndex());
      counter2--;*/
     counter2=0;
     for(int i=0;i<Engine.getInstance().shapeList.size();i++){
         shapechooser.addItem(Engine.getInstance().shapeList.get(i).getClass().getSimpleName()+counter2);
         counter2++;
     }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
    shapeInput();
        if(Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).getClass().getName().equals(path)){
        try { System.out.printf("cload");
       // Class clss = Class.forName(Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).getClass().getName());
        Shape shape=(Shape)Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).getClass().newInstance();
        m=shape.getProperties();
        shapeinput(m,cload,1); 
       
    } catch (InstantiationException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else{
    

 m= new HashMap();
    try {   
        Class clss = Class.forName(Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).getClass().getName());
        Shape shape=Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).getClass().newInstance();
        m=shape.getProperties();
        shapeinput(m,clss,1); 
        System.out.print("else");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
    }          
        }
    }//GEN-LAST:event_editActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
Shape shape = null;
        try {         shape = (Shape) Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).getClass().newInstance();
            shape=(Shape) Engine.getInstance().shapeList.get(shapechooser.getSelectedIndex()).clone();
             Engine.getInstance().addShape(shape);
              flage=1;
             moveinput.setVisible(true);
              moveinput.setSize(300,300);
              moveinput.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

shapechooser.addItem(shape.getClass().getSimpleName()+counter2);
counter2++;
    }//GEN-LAST:event_copyActionPerformed

    private void pluginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pluginActionPerformed
        JFileChooser fileChooser = new JFileChooser();

	int returnValue = fileChooser.showOpenDialog(null);

	if (returnValue == JFileChooser.APPROVE_OPTION) {

	File selectedFile = fileChooser.getSelectedFile();
	System.out.println(selectedFile.getAbsolutePath());				
	try {

      //  Plugin.getInctance().setName(selectedFile.getAbsolutePath());
        //System.out.println(selectedFile.getAbsolutePath());
	plugin2(selectedFile.getAbsolutePath());
    
        
	} catch (Exception e1) { }
							
                                               
        }
    }//GEN-LAST:event_pluginActionPerformed

    private void drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawActionPerformed
        if(cload!=null){
                 
        m=new HashMap();
			Shape shape = null;
			try {
			    shape = (Shape)cload.newInstance();
			}catch(InstantiationException | IllegalAccessException b) {}	
			m = shape.getProperties();
                        shapeInput();
			shapeinput(m,cload,0);
        }else{
          
           JOptionPane.showMessageDialog(null,"no class is loaded" ,"alert" , JOptionPane.ERROR_MESSAGE);
        }     
       

    }//GEN-LAST:event_drawActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
Engine.getInstance().redo();
Shape[] shapes= new Shape[Engine.getInstance().shapeList.size()];
counter2=0;
shapes=Engine.getInstance().getShapes();
shapechooser.removeAllItems();
for(Shape  x:shapes ){
   shapechooser.addItem(x.getClass().getSimpleName()+counter2);
   counter2++;
}
Canvas.getInstance();
    }//GEN-LAST:event_redoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void  main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
private void shapeInput(){
    shapeinput.setVisible(true);
     shapeinput.setSize(500,500);
               shapeinput.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
 public void plugin2(String pathToJar) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {


		JarFile jarFile = new JarFile(pathToJar);
		
		Enumeration<JarEntry> e = jarFile.entries();

		URL[] urls = { new URL("jar:file:" + pathToJar + "!/") };
		
		URLClassLoader cl = URLClassLoader.newInstance(urls);

		while (e.hasMoreElements()) {
			
			JarEntry je = (JarEntry) e.nextElement();
                        System.out.print("yes1");
			
			if (je.isDirectory() || !je.getName().endsWith(".class")) {
				continue;
			}
			String className = je.getName().substring(0, je.getName().length() - 6);			
			className = className.replace('/', '.');
			System.out.print(className);
			cload = cl.loadClass(className);
                         path = className;
                        System.out.print(path);
                        draw.setText(cload.getSimpleName());
                        Engine.getInstance().installPluginShape((Class)cload);
                        drawPlugin = true;
			if(cload==null){
                   System.out.println("ops");
                        }
			
			if (Shape.class.isAssignableFrom(cload)&&cload!=null) {
				drawPlugin = true;
			}

		}

	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bordercolor;
    private javax.swing.JButton cancel;
    private javax.swing.JButton circle;
    private javax.swing.JButton color;
    private javax.swing.JDialog colorinput;
    private javax.swing.JPanel componentpanel;
    private javax.swing.JButton copy;
    private javax.swing.JButton delete;
    private javax.swing.JButton doo;
    private javax.swing.JButton draw;
    private javax.swing.JPanel drawingarea;
    private javax.swing.JButton edit;
    private javax.swing.JButton ellipse;
    private javax.swing.JButton fillcolor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton line;
    private javax.swing.JButton move;
    private javax.swing.JDialog moveinput;
    private javax.swing.JButton plugin;
    private javax.swing.JTextField pointx;
    private javax.swing.JTextField pointy;
    private javax.swing.JButton rectangle;
    private javax.swing.JButton redo;
    private javax.swing.JComboBox<String> shapechooser;
    private javax.swing.JDialog shapeinput;
    private javax.swing.JButton square;
    private javax.swing.JButton triangle;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}
