package edu.classShape;


public class Shape {
	double area;
	Shape(){};
	public double getArea(){
		return area;
	}
}
class Circle extends Shape{
	double radius=0;
	Circle (double aRadius){
		radius = aRadius;
		area = radius * radius * Math.PI;
	}
	
}

class Triangle extends Shape{
	double height = 0;
	double base = 0;
	
	Triangle(double aHeight, double aBase){
		height = aHeight;
		base = aBase;
		area = base * height/2;
	}
	
}
class Rectangle extends Shape{
	double length = 0;
	double width = 0;
	
	Rectangle(double aLength, double aWidth){
		length = aLength;
		width = aWidth;
		area = length * width;
	}
}	