/**
 * 
 */
package edu.oit.lesson6.assignment;

import java.util.Arrays;

/**
 * @author JoshuaYao
 *
 */
public class TwoSum {

	/**
	 * @param this is a bonus program
	 * Given an array of integers, return indices of 
	 * the two numbers such that they add up to a specific target.
	 * Example:
		Given nums = [2, 7, 11, 15], target = 9,
		
		Because nums[0] + nums[1] = 2 + 7 = 9,
		return [0, 1].

		You may assume that each input would have exactly one solution,
		and you may not use the same element twice.
	 */
	public int[] result;
	public int[] twoSum(int[] t, int target){
		
		for(int i = 0; i< t.length; i++){
			for(int j = i + 1; j < t.length; j++){
				if (t[j] + t[i] == target ){
					result = new int[] { i,j };
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		TwoSum myTwoSum = new TwoSum();
		int[] t = new int[]{2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(myTwoSum.twoSum(t, target)));
	}

}
