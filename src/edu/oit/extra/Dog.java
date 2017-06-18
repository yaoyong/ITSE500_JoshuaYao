/**
 * 
 */
package edu.oit.extra;

/**
 * @author JoshuaYao
 *
 */
public class Dog {

	/**
	 * @param Dog
	 * 15. Create a class called Dog containing two Strings: name and says. 
	 * In main( ), create two dog objects with names ¡°spot¡± (who says, ¡°Ruff!¡±)
	 *  and ¡°scruffy¡± (who says, ¡°Wurf!¡±). Then display their names and 
	 *  what they say.
	 */
	String name;
    String says;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }
    public static void main(String args[]) {
       Dog spot = new Dog();
       spot.setName("spot");
       spot.setSays("Ruff!");

        Dog scruffy = new Dog();
        scruffy.setName("scruffy");
        scruffy.setSays("Wurf!");

        System.out.println("The dog "+spot.getName()+ " says: "+spot.getSays());
        System.out.println("The dog "+scruffy.getName()+ " says: "+scruffy.getSays());
    }
}