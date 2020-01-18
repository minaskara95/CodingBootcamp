package BootCamp;

public class removeVowels {
	public String removeVowelss(String s) {
		if(s==null||s.length()==0)
			return null;
		String str="";
		char [] c=s.toCharArray();
		for(int i=0; i<c.length; i++) {
			if(c[i]!='a'||c[i]!='e'||c[i]!='i'||c[i]!='o'||c[i]!='u')
				str+=c[i];
		}
		return str;
	}
}
//Runtime: O(n)
//Space: O(n)