package sreamApiDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("A","B","C","B","D","C","E");

		String st=list.stream().map(e->"["+e+"]").collect(Collectors.joining(","));
		System.out.println(st);
		String st1=list.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(st1);
		String st2=list.stream().map(e->"\""+e+"\"").collect(Collectors.joining(",","[","]"));
		System.out.println(st2);

	}

}
