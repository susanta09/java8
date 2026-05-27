package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count_Viwels_in_String {
	public static void main(String[] args) {
		String input = "Hello world! This is a test string.";
		long r=input.toLowerCase().chars()
				.filter(ch->"aeiou".indexOf(ch)!=-1).count();
		System.out.println(r);
		List<Character> list=input.toLowerCase().chars()
				.filter(ch->"aeiou".indexOf(ch)!=-1).mapToObj(i -> (char) i).collect( Collectors.toList());
		System.out.println(list);
		
//		Stream<Character>st=input.chars().mapToObj(i -> (char) i);
//		st.forEach(e->System.out.println(e));
	}

}
