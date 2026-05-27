package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {
	public static Map<Character,Long> createList(String st)
	{
		
		char[] array=st.toCharArray();
		List<Character>list=new ArrayList<Character>();
		for (Character character : array) {
			list.add(character);
		}
		Map<Character,Long>hm=list.stream()
				.collect(Collectors.groupingBy(Character::charValue,Collectors.counting()));
		
		return hm;
	}
	public static void main(String[] args) {
		 String str1 ="funeral" ;//"funeral" ,"debit card"
	     String str2 ="realfun" ;//"realfun", "bad credit"
	     if(str1.length()==str2.length()&&createList(str1).equals(createList(str2)))
	     {
	    	 System.out.println("is anagram");
	     }else {
	    	 System.out.println("is not anagram");
		}
	     // Replace any number of spaces with a single space
	     //    String result = input.replaceAll("\\s+", "");
	     
	        
	}

}
