package com.rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rectangle sampleRect = new Rectangle();		
		
		
		System.out.println("Default value of Sample rect is: " + sampleRect);
		sampleRect.setLength(0.5);
		sampleRect.setWidth(0.9);
		System.out.println("New value of Sample rect is: " + sampleRect);

		
		try {
			sampleRect.setLength(5.0);
			
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			
		}

		try {
			sampleRect.setWidth(10.0);
			
			
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());

		}
	
		

	}

}
