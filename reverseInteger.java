package BootCamp;

public class reverseInteger {
	public int reversedInteger(int n) {
		boolean isNeg=false;
		if(n<0) {
			n*=-1;
			isNeg=true;
		}
		long reverse=0;
		while(n>0) {
			reverse=(reverse*10)+n%10;
			n/=10;
			if(reverse>Integer.MAX_VALUE)
				return 0;
			if(isNeg)
				return isNeg? -(int)reverse: (int)reverse;
		}
		return (int)reverse;
	}
}
//Runtime: O(n)
//Space: O(1)