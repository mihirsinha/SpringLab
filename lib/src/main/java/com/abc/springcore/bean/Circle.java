package com.abc.springcore.bean;
 
public class Circle implements Shape { 
	private int radius;

//  public void setRadius(int radius) {​​​​
//      this.radius = radius;
//  }​​​​

  public Circle(int radius) {
	  this.radius = radius;
  }
  @Override
  public double area() {
	  double area = 3.14 * radius * radius;
      return area;
  }
}