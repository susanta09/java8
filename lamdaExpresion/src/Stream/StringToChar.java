package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToChar {
	public static boolean check(Object obj){
		List l=(List)obj;
		if(l.get(0) instanceof Character)
			return true;
		return false;
	}
	public static void main(String[] args) {
		String st="susanta";
		List<String> c=st.chars().mapToObj(e->(char)e)
										.map(String::valueOf)
										.collect(Collectors.toList());
		System.out.println(c);
		String c1=st.chars().mapToObj(e->(char)e)
				.map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(c1);
		
		List<Character> d=st.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		System.out.println(d+"  ->type of data "+check(d));
		String d1=st.chars().mapToObj(e->(char)e).map(String::valueOf)
				.collect(Collectors.joining());
		System.err.println(d1);
		
	}

}
