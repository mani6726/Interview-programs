package com.java.interviewprograms;

public class Armstrong {

	
	public static void isArmstrong(int num) {
		int i=0,j=0;	
		int temp=num;
		int a=temp;
		while (a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
				}
		if (temp==j) {
			System.out.println("the given number  " +  num  + " is armstrong");	
		}
		else {
			System.out.println("the given number  " +  num  + " is not armstrong");
		}
	}
	
	
	
	public static void main(String[] args) {

			isArmstrong(153);
		isArmstrong(155);
	}

}










