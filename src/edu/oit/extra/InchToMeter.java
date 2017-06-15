/**
 * 
 */
package edu.oit.extra;

/**
 * @author JoshuaYao
 *
 */
public class InchToMeter {

	/**
	 * @param args
	 * 12.
		Write a Java program that reads a number in inches, converts it to meters. 
		Note: One inch is 0.0254 meter.
		Test Data
		Input a value for inch: 1000
		Expected Output :
		1000.0 inch is 25.4 meters
	 */
	public static String inchToMeter(Double inch){
		Double meter = 0.0;
		meter = inch*0.0254; 
		return ""+inch+" inches is: "+meter+" meters";
		
	}
	public static void main(String[] args) {
		System.out.println(InchToMeter.inchToMeter(1000.0));
		
	}

}
