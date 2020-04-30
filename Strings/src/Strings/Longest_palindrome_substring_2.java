package Strings;

public class Longest_palindrome_substring_2 {
	
	public static String isPalindrome(String str,int low,int high) {
		int len = str.length();
		while (low >= 0 && high < len &&
				(str.charAt(low) == str.charAt(high))) {
			low--;
			high++;
		}
		return str.substring(low+1, high);
	}
	
	public static String longestPalindrome(String str) {
		 String odd_curr_str="", even_curr_str="", max_str="", curr_str="";
		 for(int i=0;i<str.length()-1;i++) {
			 odd_curr_str=isPalindrome(str,i,i);
			 if(odd_curr_str.length()>max_str.length()) {
				 max_str=odd_curr_str;
			 }
			 even_curr_str=isPalindrome(str,i,i+1);
			 if(even_curr_str.length()>max_str.length()) {
				 max_str=even_curr_str;
			 }
		 }
		return max_str;
	}
	
	public static void main(String[] s) {
		String str="azza";
		System.out.println(longestPalindrome(str));
	}
}
