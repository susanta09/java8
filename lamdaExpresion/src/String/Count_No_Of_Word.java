package String;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count_No_Of_Word {
	public static void main(String[] args) {
        String input = "Hello world! This is a test string.";
 //===========================================================       
        String[] array=input.split("\\s+");
        
        List<String> list=Arrays.stream(array).collect(Collectors.toList());
        System.out.println(list);
        long count=list.stream().count();
        System.out.println(count);
        
  //===========================================================  
          //*****Skip line 12,14*********
        long count1=Arrays.stream(input.split("\\s+")).count();
        System.out.println(count1);
        
        
        
		/*
		 * We split the input string into an array of words using split("\\s+"). The
		 * regular expression "\\s+" matches one or more whitespace characters (space,
		 * tab, newline, etc.), effectively splitting the string into words.
		 */
	}

}
