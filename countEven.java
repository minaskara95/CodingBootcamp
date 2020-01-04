package BootCamp;

public class countEven {
	public int evenCount(int[]nums) {
		int count=0;
		if(nums==null||nums.length==0) {
			return 0;
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) 
			count+=1;
		}
		return count;
	}
}
//runtime: O(n)
//space: O(1)