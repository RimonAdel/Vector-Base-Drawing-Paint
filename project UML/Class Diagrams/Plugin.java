/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Plugin {
private String path;
private String s=null;
private static Plugin plugininstence= null;
private Plugin(){
    
}
public static Plugin getInctance(){
    if( plugininstence == null){
      plugininstence= new Plugin();
    }
    return plugininstence;
}
public Class<?> getplugin() 
{
    if (path == null) {
         System.out.println("no1");
        return  null;
    }
    try {
        Class<?> cload;
        JarFile jarFile = new JarFile(path);
        
        Enumeration<JarEntry> e = jarFile.entries(); //by3d el folders wl file el gwa el jar file
        System.out.println("yes1");
          System.out.println(path);

        URL[] urls = {new URL("jar:file:" + path + "!/")};

        URLClassLoader cl = URLClassLoader.newInstance(urls);

        while (e.hasMoreElements()) {

            JarEntry je = (JarEntry) e.nextElement();
            if (je.isDirectory() || !je.getName().endsWith(".class")) {// is directory dy y3ny ay 7ga enfd with "/"
                continue;

            }
            String className = je.getName().substring(0, je.getName().length() - 6);
            className = className.replace('/', '.'); //kda ana gbt asm el class mn awlo l3'yt ablha b 6 7rof abl l a5r w bdlt kol '/' b '.'
            s=className;
            cload = cl.loadClass(className);
            if (Shape.class.isAssignableFrom(cload)) {
                Class cls= Class.forName(className);
                Shape shape= (Shape)cls.newInstance();
                System.out.println("yes2");
               return cload;
            }  
        }
    }catch(Exception e){
        System.out.println(e);
        
    }
    System.out.println("no2");
    return null;
}
public void setName(String path){
    this.path=path;
}
public String getClassName(){
    return s;
}
} 

