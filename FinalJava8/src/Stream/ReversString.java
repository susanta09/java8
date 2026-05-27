package Stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReversString {
	public static void main(String[] args) {
		String st="susanta";
		int n=st.length();
		String s=IntStream.range(0, n).mapToObj(e->st.charAt(n-1-e))
						.map(String::valueOf)
						.collect(Collectors.joining())
						.toString();
		System.out.println(s);
	}

}
