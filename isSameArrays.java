package BootCamp;

public class isSameArrays {
	public boolean isSameArray(int[]array1, int[]array2) {
		if(array1==null&&array2==null)
			return true;
		if(array1.length!=array2.length||(array1==null||array2==null))
			return false;
		for(int i=0; i<array1.length; i++) {
			if(array1[i]!=array2[i])
				return false;
		}
		return true;
	}
}
//runtime: O(n)
//space: O(1)