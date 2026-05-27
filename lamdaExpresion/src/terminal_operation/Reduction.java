package terminal_operation;

import java.util.stream.IntStream;

public class Reduction {
	public static void main(String[] args) {
		
//==============================================================================
		//*****Optional<T> reduce(BinaryOperator<T> accumulator)***********
		int i = IntStream
				.range(1, 6)  //output:120
//				.range(1, 2)  //output:1
//				.range(0, 0)  //output:-1
//				.empty()      //output:-1
				.reduce(
						(a, b) -> a * b  //Accumulator here a: partial result  and b: current element of stream 
						)
				.orElse(-1);

		System.out.println(i);
//==============================================================================
		  //**** T reduce(T identity, BinaryOperator<T> accumulator)****************
		  int k = IntStream
				  .empty()//output:1
                  .reduce(
                		  1,  //Identity (default or initial value also)
                		  (a, b) -> a * b  //Accumulator here a: partial result  and b: current element of stream 
                		  );
 System.out.println(k);
	}

}
