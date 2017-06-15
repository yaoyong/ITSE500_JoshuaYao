/**
 * 
 */
package edu.oit.extra;

/**
 * @author JoshuaYao
 *
 */
public class TryFinallyTest {

	/**
	 * @param args
	 * 10.
	 * Is the following code legal?
	 * try {
     *
	 *	} finally {
	 *    
	 * }
	 */
	public  static void tryFinallyTest(){
		try{
		for(int i = 0; i<3; i++){
			System.out.println(i);
		}
		}finally{System.out.println("'try' and 'finally' can be used together without 'catch',so it is legal!!");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryFinallyTest.tryFinallyTest();

	}

}
