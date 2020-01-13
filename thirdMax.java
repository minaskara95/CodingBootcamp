package BootCamp;

public class thirdMax {
	public int thirdMaximun(int[] nums) {
		int largest = nums[0], larger = Integer.MIN_VALUE, 
                large = Integer.MIN_VALUE;
		
		for (int i=0; i<nums.length; i++) {
			if(nums[i]>largest) {
				large=larger;
				larger=largest;
				large=nums[i];
			}
			else if(nums[i]>larger) {
				large=larger;
				larger=nums[i];
			}
			else if(nums[i]>large)
				large=nums[i];
		}
		return large;
	}
}
