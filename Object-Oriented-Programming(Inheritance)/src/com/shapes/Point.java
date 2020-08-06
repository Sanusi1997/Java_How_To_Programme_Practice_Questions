package com.shapes;

public class Point {
	private String pointA;
	private String pointB;
	private String pointC;
	private String pointD;

	public Point(String pointA, String pointB, String pointC, String pointD) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}

	public String getPointA() {
		return pointA;
	}

	public void setPointA(String pointA) {
		this.pointA = pointA;
	}

	public String getPointB() {
		return pointB;
	}

	public void setPointB(String pointB) {
		this.pointB = pointB;
	}

	public String getPointC() {
		return pointC;
	}

	public void setPointC(String pointC) {
		this.pointC = pointC;
	}

	public String getPointD() {
		return pointD;
	}

	public void setPointD(String pointD) {
		this.pointD = pointD;
	}

	public String toString() {
		return String.format("%s%n%s%s%n%s%s%n%s%s%n%s%s%n", "Points in the quadrilateral", "Point A: ",
				getPointA(), "Point B: ", getPointB(), "Point C: ", getPointC(), "Point D: ", getPointD());
	}

}
