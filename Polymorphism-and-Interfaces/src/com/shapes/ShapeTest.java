package com.shapes;

public class ShapeTest{

    public static void main(String[] args) {
        Shape [] shapes  = new Shape[4];
        shapes[0] = new Circle(7);
        shapes[1] = new Square(4);
        shapes[2] = new Triangle(4, 8);
        shapes[3] = new Cube(3);

        for (Shape currentShape : shapes) {
            if (currentShape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape shape = (ThreeDimensionalShape) currentShape;
                System.out.printf("%n%s%n%s%s: %.2f%n%s: %.2f", shape.getClass().getName(), shape,
                        "Area of Shape is: ", shape.getArea(),
                        "Volume of Shape is:", shape.getVolume());
            }
            else {
                System.out.printf("%n%s%n%s%s: %.2f", currentShape.getClass().getName(), currentShape,
                        "Area of shape is", currentShape.getArea());
                System.out.println();
            }

        }

    }

}
