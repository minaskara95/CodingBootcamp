package BootCamp;

public class moveElements {
	public int[] moveElement(int []nums) {
		if(nums==null||nums.length==0)
			return null;
		int count=0;
		int []moved=new int [nums.length];
		for(int i=0; i<nums.length; i++) {
		if(nums[i]%2!=0) {
			moved[count]=nums[i];
			count++;
		}
		else
			moved[i]=nums[i];
		}
		return moved;
	}
}
