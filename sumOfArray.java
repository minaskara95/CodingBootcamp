package BootCamp;

public class sumOfArray {
	public int sumOfArr(int[] nums) {
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
}
//runtime: O(n)
//space: O(1)