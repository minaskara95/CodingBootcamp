package BootCamp;

public class reverseString {
	public char [] reverseStringg(char[]str) {
		if(str==null)
			return null;
		for(int i=0; i<str.length; i++) {
			char c=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=c;
		}
		return str;
	}
}
//Runtime: O(n)
//Space: O(1)