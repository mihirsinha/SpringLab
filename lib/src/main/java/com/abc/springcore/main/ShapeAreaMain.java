package com.abc.springcore.main;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.abc.springcore.bean.Circle;
import com.abc.springcore.bean.Rectangle;
import com.abc.springcore.bean.Shape;
import com.abc.springcore.bean.ShapeArea;
 
public class ShapeAreaMain { 
    public static void main(String[] args) {       
//        //input shape object        
//        Circle circle = new Circle(5);        
//        ShapeArea shapeArea = new ShapeArea();        
//        //injecting into shapeArea 
//        shapeArea.setShapeObj(circle);    


        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        ShapeArea shapeArea = (ShapeArea) context.getBean("shapeArea");    

        double result = shapeArea.findArea();

        System.out.println("Area : "+result);
    } 
}