package Stream;

import java.util.stream.Collectors;

public class CheckAnagram {
	public static void main(String[] args) {
		String st="mom";
		String s="omms";
		Boolean b=st.chars().boxed().map(String::valueOf)
			.sorted().collect(Collectors.joining()).equals(s.chars().boxed().map(String::valueOf)
			.sorted().collect(Collectors.joining()));
		if(b) {
			System.out.println("Annagram");
		}else {
			System.out.println("not a annagram");
		}
	}

}
