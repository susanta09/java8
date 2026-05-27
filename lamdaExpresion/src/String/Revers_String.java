package String;

public class Revers_String {
	public static void main(String[] args) {
		String input = "Hello World";

		String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Original string: " + input);
		System.out.println("Reversed string: " + reversed);
		
		
		
		/*
		 * We use new StringBuilder(input).reverse().toString() to reverse the string.
		 * This method creates a StringBuilder from the input string, calls the
		 * reverse() method to reverse the content, and then converts the StringBuilder
		 * back to a string using toString().
		 */	}

}
