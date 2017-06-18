/**
 * 
 */
package edu.oit.extra;

/**
 * @author JoshuaYao
 *
 */
public class TeaParty {

	/**
	 * @param TeaParty
	 * 18.Implement the function teaParty.We are having a party with 
	 * amounts of tea and candy. Return the int outcome of the party encoded 
	 * as 0=bad, 1=good, or 2=great.A party is good 
	 * (1)if both tea and candy are at least 5.However, if either tea or candy 
	 * is at least double the amount of the other one, the party is great 
	 * (2).However, in all cases, if either tea or candy is less than 5, 
	 * the party is always bad (0). 
	 * teaParty(6, 8) ¡ú 1 
	 * teaParty(3, 8) ¡ú 0 
	 * teaParty(20, 6) ¡ú 2

	 */
	public static int teaParty(int tea, int candy){
        int result = 3;
        if (tea >=5 && candy >=5) {
            if(tea >= 2*candy || candy >+ 2*tea){
                result= 2;
            }else result= 1;
        }
        if(tea <5 || candy < 5){
            if(tea >= 2*candy || candy >+ 2*tea  ){
                result = 0;
            }else result= 0;
        }

        return result;
    }
    public static void main(String args[]) {
        System.out.println(TeaParty.teaParty(6, 8));
        System.out.println(TeaParty.teaParty(3, 8));
        System.out.println(TeaParty.teaParty(20, 6));

    }
}