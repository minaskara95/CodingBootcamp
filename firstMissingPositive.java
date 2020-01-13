package BootCamp;

public class firstMissingPositive {
	public int firstMissingPossitive(int[] nums) {
		if(nums.length<1)
			return 0;
		int x=0;
		int n=nums.length;
		for(int missing=1; missing<=(n+1); missing++) {
			boolean found=false;
			for(int i=0; i<n; i++) {
				if(nums[i]==missing) {
					found=true;
					break;
				}
				if(!found)
					x= missing;
				
			}
		}
		return x;
	}
}
