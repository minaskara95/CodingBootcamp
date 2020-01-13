package BootCamp;

public class twoSum {
	public int[] twoSums(int [] nums, int target) {
		if(nums==null)
			return nums;
		int arr []=new int[2];
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					arr[0]=i;
					arr[1]=j;
				}	
			}
		}
		return arr;
	}
}
