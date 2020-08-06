/**
 * 
 */

import java.util.Scanner;

/**
 * @author Hameed Sanusi
 *
 */
public class Sphere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius of Sphere: ");
		double radius = input.nextDouble();
		System.out.printf("The volume of the sphere of radius %.2fCm is %.2f", radius, sphereVolume(radius));
	}
	
	public static double sphereVolume(double radius) {
		
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		
		return volume;
		
		}
	

}
