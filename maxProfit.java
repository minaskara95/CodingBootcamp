package BootCamp;

public class maxProfit {
	public int maxProfitt(int [] prices) {
		int maxProfit=0;
		int buy=prices[0];
		for(int i=1; i<prices.length; i++) {
			if(prices[i]<buy)
				buy=prices[i];
			if(prices[i]-buy>maxProfit)
				maxProfit=prices[i]-buy;
		}
		return maxProfit;
	}
}
