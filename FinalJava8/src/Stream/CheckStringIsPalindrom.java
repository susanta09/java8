package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckStringIsPalindrom {
	public static void main(String[] args) {
		String st="sus";
		int n=st.length();
		 //String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		boolean b=IntStream.rangeClosed(0, n/2).allMatch(e->st.charAt(e)==(st.charAt(n-e-1)));
				
						
		if(b) {
			System.out.println("is palindrom");
		}else {
			System.out.println("is not palindrom");
		}
		
		
		
		   List<String> list = Arrays.asList("madam", "hello", "racecar", "java", "level");

	        Map<Boolean, List<String>> result = list.stream()
	                .collect(Collectors.partitioningBy(s -> 
	                        s.equals(new StringBuilder(s).reverse().toString())
	                ));

	        System.out.println(result);
	    }
	}

