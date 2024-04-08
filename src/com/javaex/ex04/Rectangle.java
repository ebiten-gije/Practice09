package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;
    
    public Rectangle (double width, double height) {
    	super(4);
    	this.width = width;
    	this.height = height;
    }

	@Override
	public double getArea() {
		
		return width * height;
	}

	@Override
	public double getPerimeter() {
		
		return (width + height) * 2;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
		
	}

}