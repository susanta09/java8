package sreamApiDemo;

import java.util.Arrays;

public class CheckTheWordKthNumberOFVowels {
	public static Long countVowels(String s)
	{
		return s.chars()
				.mapToObj(ch->(char)ch)
//				.peek(e->{
//					System.out.print(e.TYPE+" ");
//					System.out.print(e+" ");
//				})
				.distinct()
				.filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
				.count();
	}
	public static void main(String[] args) {
		String st="i have a apple and orange on the table";
		long k=2;
		Arrays.stream(st.split(" "))
			.filter(w->countVowels(w)==k)
			.forEach(System.out::println);
		System.out.println("==================");
		Arrays.stream(st.split(" "))
		.filter(w->w.chars()
					.mapToObj(e->(char)e)
					.distinct()
					.filter(a->"aeiouAEIOU".indexOf(a)!=-1)
					.count()==k)
		.forEach(System.out::println);
		
//		String st="mpom";
//		st.chars()
//		.mapToObj(ch->(char)ch)
//		.filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
//		.forEach(e->System.out.println(e));;
		
	}

}
