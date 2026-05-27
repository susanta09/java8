package String;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;

public class String_Is_Palindrom {
	public static void main(String[] args) {
		
//==========================================================================		
		//String input = "padap";
//		Boolean isPalindrom=new StringBuilder(input)
//										.reverse()
//										.toString()
//										.equalsIgnoreCase(input);		
//		if(isPalindrom)
//		{
//			System.out.println("String is palindrom");
//		}else {
//			System.out.println("String is not palindrom");
//		}


//===================================================================		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string or null(for null type null)");
		String input = sc.nextLine();
		if(input.equals("null"))
		{
			input=null;
		}
	//**** Functional Interface is Function**********	
		Function<String, Boolean> f=(e)->{
			return new StringBuilder(e)
			.reverse().toString().equalsIgnoreCase(e);
		};
		
		Optional<String> isPalindrom=Optional.ofNullable(input);
		
		isPalindrom.ifPresent(e -> {

			if (f.apply(e)) {
				System.out.println("String is palindrom");
			} else {
				System.out.println("String is not palindrom");
			}
		});
		
		//*** one line*****
		Optional.ofNullable(input).ifPresent(e -> {

			if (f.apply(e)) {
				System.out.println("String is palindrom");
			} else {
				System.out.println("String is not palindrom");
			}
		});
		

	}

}
