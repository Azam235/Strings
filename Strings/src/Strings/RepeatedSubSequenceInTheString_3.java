package Strings;

import java.util.HashMap;
import java.util.Map;

public class RepeatedSubSequenceInTheString_3 {
	
	public static boolean isPalindrome(String str,int low,int high) {
		if(low>=high) {
			return true;
		}
		return (str.charAt(low)==str.charAt(high)) && isPalindrome(str,low+1,high-1);
	}
	
	public static boolean RepeatedSubSequence(String str) {
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))==null) {
				map.put(str.charAt(i),0);
			}
			map.put(str.charAt(i),map.get(str.charAt(i))+1);
			if(map.get(str.charAt(i))>=3) {
				return true;
			}
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))>=2) {
				sb.append(str.charAt(i));
			}
		}
		return !isPalindrome(sb.toString(),0,sb.length()-1);
	}
	
	public static void main(String[] s) {
		String str="XXXXX";
		if(RepeatedSubSequence(str)) {
			System.out.println("sub sequence is present");
		}
		else {
			System.out.println("sub sequence is not present");
		}
	}
}
