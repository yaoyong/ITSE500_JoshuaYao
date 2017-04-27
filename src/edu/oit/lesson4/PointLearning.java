package edu.oit.lesson4;
/**
 * @author JoshuaYao
 *
 */
public class PointLearning {
    private int x;
    private int y;
    
    public PointLearning(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public double getDistanceFrom(PointLearning p) {
        double distance = 0;
        int xDistance = this.x - p.getX();
        int yDistance = this.y - p.getY();
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }
    
    public static void main(String[] args) {
    	PointLearning p1 = new PointLearning(10, 20);
    	PointLearning p2 = new PointLearning(20, 30);
        
        System.out.println(p1.getDistanceFrom(p2));
    }

}