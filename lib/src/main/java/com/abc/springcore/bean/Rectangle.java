package com.abc.springcore.bean;
 
public class Rectangle implements Shape { 
    private int length;
    private int breadth;    

    public void setLength(int length) {
    	this.length = length;
    } 
    public void setBreadth(int breadth) {
    	this.breadth = breadth;
    } 
    @Override
    public double area() {
        double area = length*breadth*0.5;
        return area;
    } 
}