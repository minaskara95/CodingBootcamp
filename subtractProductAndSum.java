package BootCamp;

public class subtractProductAndSum {
	public int subProductAndSum(int n) {
		if(n==0)
			return n;
		if(n<0)
			n*=-1;
		int product=1;
		int sum=0;
		while(n>0) {
			product*=n%10;
			sum+=n%10;
			n/=10;
		}
		return product-sum;
	}
}
//Runtime: O(n)
//Space: O(1)
