package BootCamp;

public class only14 {
 public boolean only1four(int[]nums) {
	 if(nums==null|| nums.length==0) {
		 return false;
	 }
	 for(int i=0; i<nums.length; i++) {
		 if(nums[i]!=1||nums[i]!=4)
			 return false; 
	 }
	 return true;
 }
}
