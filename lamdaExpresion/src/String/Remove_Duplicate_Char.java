package String;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Remove_Duplicate_Char {
	public static void main(String[] args) {
        String input = "hello world";
        char[] array=input.toCharArray();
        LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
        for (Character ch : array) {
        	lhs.add(ch);
			
		}
        System.out.println(lhs);
        StringBuilder st=new StringBuilder();
        for (Character ch : lhs) {
			st=st.append(ch);
		}
     System.out.println(st.toString());
        
     //*****in oneline usine sream*******   
       String st1 =input.chars()
    		   .mapToObj(e->(char)e)
    		   .collect(LinkedHashSet::new,LinkedHashSet::add , LinkedHashSet::addAll)
    		   .stream()
    		   .map(String::valueOf)
    		   .collect(Collectors.joining());
       System.out.println(st1);
	}

}
