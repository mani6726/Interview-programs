package com.java.interviewprograms;

import java.util.HashMap;
import java.util.Map;

public class Countofeachcharacter {

	public static void main(String[] args) {
String str="manikandan";
Map<Character, Integer> mp = new HashMap<Character, Integer>();
char[] cs = str.toCharArray();

for (char c : cs) {
	if (mp.containsKey(c)) {
		Integer x = mp.get(c);
		mp.put(c,x+1);
		
	}else {
		mp.put(c,1);
	}
		
}
System.out.println(mp);


	}

}
