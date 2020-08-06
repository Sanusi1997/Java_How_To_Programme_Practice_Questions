package com.shapes;

public class QuadrilateralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point shapeOne = new Point("(3,1)", "(3,5)", "(5,5)","(5,1)");
		System.out.println(shapeOne);
		Quadrilateral rectCoordinate = new Quadrilateral(shapeOne, 3, 1, 3, 5, 5, 5, 5, 1);
		Rectangle rect = new Rectangle(shapeOne, 3, 1, 3, 5, 5, 5, 5, 1);
		System.out.printf("Breadth of rectangle is: %.2f%n", rect.calculateXDistance());
		System.out.printf("Length of rectangle is: %.2f%n", rect.calculateYDistance());
		System.out.printf("Area of rectangle is: %.2f%n", rect.calculateRectArea());
	}

}
