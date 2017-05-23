/**
 * 
 */
package edu.oit.lesson9;

/**
 * @author JoshuaYao
 *
 */
public enum Color {
	RED(1),ORANGE(2),YELLOW(3),GREEN(4);
	private int value;
	private Color(int value){
		this.value = value;
	}
	public int getValue(){
	       return this.value;
	    }
	    
	public void setValue(int value){
	       this.value = value;
	    }	
	public String getColor(Color color){
		switch(color){
		case RED:
			return "apple";
		case GREEN:
			return "grass";
		case ORANGE:
			return "orange";
		
		case YELLOW:
			return "balana";
		default:
			return "haha";
			
		
	}
		}
}
