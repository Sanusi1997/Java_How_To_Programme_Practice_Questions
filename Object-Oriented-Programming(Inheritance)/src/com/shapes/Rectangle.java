package com.shapes;

public class Rectangle extends Quadrilateral {

	public Rectangle(Point point, double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		super(point, x1, y1, x2, y2, x3, y3, x4, y4);
	}

	public double calculateRectArea() {
		double area = super.calculateXDistance() * super.calculateYDistance();
		return area;
	}
}
