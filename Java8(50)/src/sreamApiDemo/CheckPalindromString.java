package sreamApiDemo;

import java.util.stream.IntStream;

public class CheckPalindromString {
	public static void main(String[] args) {
		String st="mamX";
		Boolean b=IntStream.rangeClosed(0,st.length()/2)
				.allMatch(i->st.charAt(i)==st.charAt(st.length()-1-i));
		System.err.println(b);
	}

}
