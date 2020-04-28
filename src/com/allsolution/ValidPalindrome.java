package com.allsolution;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */
public class ValidPalindrome {

	public static void main(String[] args) {

		String str = "A man, a plan, a canal: Panama";

		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String s) {

		String str = s.toLowerCase();
		if (str == null) {
			return false;
		}
		int i, j;
		i = 0;
		j = str.length() - 1;
		while (i < j) {
			while (i < j && !((isLATTER(str.charAt(i))))) {
				i++;
			}
			while (i < j && !((isLATTER(str.charAt(j))))) {
				j--;
			}
			if (str.charAt(i++) != str.charAt(j--)) {
				return false;
			}
		}
		return true;

	}

	private static boolean isLATTER(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
	}

}
