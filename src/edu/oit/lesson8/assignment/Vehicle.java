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
	 * 请定义一个交通工具(Vehicle)的类，其中有: 属性：速度(speed)，体积(size)等等  
	 * 方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等. 
	 * 最后在测试类Vehicle中的main()中实例化一个交通工具对象，
	 * 并通过方法给它初始化speed,size的值，并且通过打印出来。另外，调用加速，减速的方法对速度进行改变。
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
