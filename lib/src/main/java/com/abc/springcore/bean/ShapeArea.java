package com.abc.springcore.bean;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
 
public class ShapeArea { 
    @Autowired
    //@Qualifier("rectangle")
    private Shape shapeObj;    

    public void setShapeObj(Shape shapeObj) {
    	this.shapeObj = shapeObj;
    }
    public double findArea() {
    	double result = shapeObj.area();
        return result;
    }
}