/**
 * 
 */
package edu.oit.lesson8.assignment;

/**
 * @author JoshuaYao
 *
 */
public class Vehicle {

	/**
	 * @param Vehicle
	 * �붨��һ����ͨ����(Vehicle)���࣬������: ���ԣ��ٶ�(speed)�����(size)�ȵ�  
	 * �������ƶ�(move())�������ٶ�(setSpeed(int speed))������speedUp(),����speedDown()�ȵ�. 
	 * ����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶���
	 * ��ͨ������������ʼ��speed,size��ֵ������ͨ����ӡ���������⣬���ü��٣����ٵķ������ٶȽ��иı䡣
	 */
	private int speed;
	private int size;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void move(){}	
	public int speedUp(){
		speed = this.speed+30;
		return speed;
	}
	public int speedDown(){
		speed = this.speed-30;
		return speed;
	}
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(300);
		vehicle.setSize(50);
		System.out.println("my car's speed is: "+ vehicle.getSpeed() + " and its size is:"+ vehicle.getSize());
		System.out.println("After speed up, my car's speed is: "+ vehicle.speedUp() + " and After speed down, my car's speed is back:"+ vehicle.speedDown());
	}

}
