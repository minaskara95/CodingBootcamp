package BootCamp;

public class aVersusB {
	public char aVersusb(String str) {
		int countA=0;
		int countB=0;
		char[]c =str.toCharArray();
		for(int i=0; i<c.length; i++) {
			if(c[i]==97)
				countA++;
			if(c[i]==98)
				countB++;
		}
		return countA>countB? 'a':'b';
	}
}
//Runtime: O(n)
//Space: O(1)