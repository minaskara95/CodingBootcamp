package BootCamp;

public class countTarget {
	public int target(int[] nums, int target) {
		int count=0;
		if(nums==null||nums.length==0) {
			return 0;
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==target)
				count=nums[i];
	}
		return count;
	}
}
//runtime: O(n)
//space: O(1)