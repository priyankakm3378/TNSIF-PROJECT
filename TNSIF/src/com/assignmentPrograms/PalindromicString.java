package com.assignmentPrograms;

import java.util.Scanner;

public class PalindromicString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		
		if(checkPalindrome1(str)) {
			System.out.println("Yes, It is Palindrome");
		}else {
			System.out.println("No, It is not Palindrome");
		}
		
		
	}

	private static boolean checkPalindrome1(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left < right) {
			if(str.charAt(left) == str.charAt(right)) {
				left++;
				right--;
			}
			else{
				return false;
			}
		}
		return true;
	}
	
	

}
