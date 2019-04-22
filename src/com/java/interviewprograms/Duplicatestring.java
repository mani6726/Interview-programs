package com.java.interviewprograms;

public class Duplicatestring {

	public static void main(String[] args) {
String[] st= {"mani","mai"};

for (int i = 0; i < st.length; i++) {

	for (int j = i+1; j < st.length; j++) {
		if (st[i]==st[j]) {
			String dup = st[i];
			System.out.println(dup);
		}
		else {
			System.out.println("no duplicate string");
		}
		
	}
	
}

	}
	
	}
