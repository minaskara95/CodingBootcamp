package BootCamp;

public class isParalindrome {
	public boolean isPalindrom(int[]nums) {
		if(nums==null||nums.length<2)
			return true;
		int x=nums.length-1;
		for(int i=0; i<nums.length/2; i++) {
			if(nums[i]!=nums[x-i])
				return false;	
		}
		return true;
	}
}
//runtime: O(n)
//space: O(1)