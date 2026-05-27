package Stream;

import java.util.Random;
import java.util.stream.Stream;

public class Genarate_Infinite_stream {
	public static void main(String[] args) {
//		Stream<Integer> stream=Stream.generate(()->{
//			return new Random().nextInt(100);
//		}).limit(5);
//		stream.forEach(System.out::println);
//		System.out.println(new Random().nextInt(100));
		
		Stream<Integer> stream = Stream.iterate(0, n -> n - 2)
				//.skip(1) you can skip first element
				.limit(5);
		stream.forEach(System.out::println);
	}
}
