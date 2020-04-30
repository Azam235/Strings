package Strings;

public class Rotated_Palindrome_1 {
	public static boolean isPalindrome(String str) {
		int low=0,high=str.length()-1;
		
		while(low<=high) {
			if(str.charAt(low++)!=str.charAt(high--)) {
				return false;
			}
		}
		return true;
	}
	public static boolean isRotatedPalindrome(String str) {
		for(int i=0;i<str.length();i++) {
			str=str.substring(1)+str.charAt(0);
			if(isPalindrome(str)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] s) {
		String str="CBAABCD";
		if(isRotatedPalindrome(str)) {
			System.out.println(str+" is a rotated palindrome");
		}
		else {
			System.out.println(str+"is not a rotated palindrome");
		}
	}
}
