package BootCamp;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
	public List<Integer> findDisappearedNums(int[]nums){
		int N=nums.length;
		ArrayList<Integer> myArr=new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			boolean found=false;
			for(int j=0; j<N; j++) {
				if(nums[j]==i) {
					found=true;
					break;
				}
				
			}
			if(!found) 
				myArr.add(i);
			
		}
		return myArr;
	}
}//Runtime:O(n^2)
//Space: O(n)