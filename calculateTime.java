package BootCamp;

public class calculateTime {
	public static int calculateTimes(String keyboard, String word) {
		int finger=0;
		int time=0;
		char []c=keyboard.toCharArray();
		char[] w=word.toCharArray();
		for(int i =0; i<w.length; i++) {
			for(int j=0; j<c.length; j++) {
				if(c[j]==w[i]) {
					time+= Math.abs(finger-j);
					finger=j;
				}
			}
		}
		return time;
	}
	
	
	
	public static void main(String[] args) {
		String k = "abcdefghklmnopqrstuvwxyz";
		String w ="cbadf";
		System.out.print(calculateTimes(k,w));
	}
}
