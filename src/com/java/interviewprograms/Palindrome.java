package com.java.interviewprograms;

public class Palindrome {
	
	public static void isPalindrome(int number) {
		int t=number;
		int r=0;
		int sum=0;

		while (number>0) {
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
					
		}
			
		System.out.println(sum);
		if (t==sum) {
				System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		

	}
		

	public static void main(String[] args) {

		isPalindrome(157);
		isPalindrome(75857);
		isPalindrome(0);

	}

}
