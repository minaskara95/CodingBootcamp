package BootCamp;

public class missingNumber {
	public int missingNum(int[]nums) {
		if(nums==null||nums.length==0)
			return 0;
		int sum=0;
		int total=nums.length+1*(nums.length+2)/2;
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		return total-sum;
	}
}
//Runtime: O(n)
//Space: O(1)