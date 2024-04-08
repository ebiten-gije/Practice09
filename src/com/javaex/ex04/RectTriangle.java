package com.javaex.ex04;

public class RectTriangle extends Shape {
   
	private double width;
    private double height;

    public RectTriangle(double width, double height) {
    	super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (width * height) / 2;
	}

	@Override
	public double getPerimeter() {
		double c = Math.sqrt(width * width + height * height);
		return  width + height + c;
	}
}