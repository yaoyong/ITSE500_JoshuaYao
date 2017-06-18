/**
 * 
 */
package edu.oit.extra;

/**
 * @author JoshuaYao
 *
 */
public class MixString {

	/**
	 * @param MixString
	 * 17.Given two strings, a and b, create a bigger string made of 
	 * the first char of a, the first char of b, the second char of a, 
	 * the second char of b, and so on. Any leftover chars go at the end of 
	 * the result.
	 */
	public static String mixString(String a, String b){
        String c="";
        if(a.length()>= b.length()){
            for(int i=0;i<a.length(); i++){
                if(i<b.length()) {
                    c = c + a.charAt(i) + b.charAt(i);
                }else c= c+a.charAt(i);
            }
        }else{
            for(int i=0;i<b.length(); i++){
                if(i<a.length()) {
                    c = c + a.charAt(i) + b.charAt(i);
                }else c= c+b.charAt(i);
            }

        }
        return c;
    }
    public static void main(String args[]) {
        System.out.println("(\"abc\", \"xyz\") ¡ú"+MixString.mixString("abc", "xyz"));
        System.out.println("(\"Hi\", \"There\") ¡ú"+MixString.mixString("Hi", "There"));
        System.out.println("(\"xxxx\", \"There\") ¡ú"+MixString.mixString("xxxx", "There"));

    }
}
