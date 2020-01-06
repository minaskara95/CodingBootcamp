package BootCamp;

public class sumOfArrays {
	public int[] sumOfArray(int[] array1, int [] array2) {
		if(array1==null&&array2==null)
			return null;
		if(array1.length==0)
			return array2;
		if(array2.length==0)
			return array1;
		int max= Math.max(array1.length, array2.length);
		int min=Math.min(array1.length, array2.length);
		int[] sum= new int[max]; 
		for(int i=0; i<min; i++) {
			sum[i]=array1[i]+array2[i]; 
		}
		for(int i=min; i<max; i++) {
			if(array1.length>array2.length)
				sum[i]+=array1[i];
			else
				sum[i]+=array2[i];
		}
		return sum;
	}
}
//runtime: O(n)
//space: O(1)