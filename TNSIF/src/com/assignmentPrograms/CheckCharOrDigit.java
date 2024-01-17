package com.assignmentPrograms;

import java.util.Scanner;

public class CheckCharOrDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		StringBuilder digit = new StringBuilder();
		StringBuilder alpha = new StringBuilder();
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				count1++;
				digit.append(ch);
			}
			if(Character.isLetter(ch)) {
				count2++;
				alpha.append(ch);
			}
			
		}
		
		System.out.println("The number of characters -> "+count2);
		System.out.println("The number of Digits -> "+count1);
		
	}

}
