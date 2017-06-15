/**
 * 
 */
package edu.oit.extra;

/**
 * @author JoshuaYao
 *
 */
public class TryCatchTest {

	/**
	 * @param args
	 * Is there anything wrong with the following exception 
	 * handler as written? Will this code compile?
	 * try {

				} catch (Exception e) {
				    
				} catch (ArithmeticException a) {
			    
			}
			
	 * result: it is wrong exception already handled by Exception e, compile will not pass.		
	 */
	
	public  static void tryCatchTest(){
		try{
		for(int i = 0; i<3; i++){
			System.out.println(i);
		}
		}catch (Exception e) {
		    
		} catch (ArithmeticException a) {
		    
		}
	public static void main(String[] args) {
//		Result: Multiple markers at  line 32
//		- Unreachable catch block for ArithmeticException. It is already handled by the catch block for 
//		 Exception

	}

}
