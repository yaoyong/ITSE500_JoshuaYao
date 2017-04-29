package edu.oit.lesson4.assignment.program3;

public class Point {
	Double x;
	Double y;
	Double z;
	public Point(Double x, Double y){
		this.x = x;
		this.y = y;
	}
	public Point(){
		
	}
	public void calDistance(){
		Point point1 = new Point(3.0,4.0);
		Point point2 = new Point(5.0,6.0);
		this.z = Math.sqrt((point2.y - point1.y)*(point2.y - point1.y)+(point2.x - point1.x)*(point2.x - point1.x));
		System.out.println(z);
	}

}
