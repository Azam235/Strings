package Strings;

public class StringDerivingEachOther {
	public static boolean isDerived(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		s1=s1+s1;
		for(int i=0;i<s2.length();i++) {
			if((s1.substring(i,i+4)).compareTo(s2)==0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] s) {
		String s1="ABCD";
		String s2="DABC";
		if(isDerived(s1, s2))
			System.out.println("Both strings can derive each other");
		else
			System.out.println("Both strings can not derive each other");
	}
}
