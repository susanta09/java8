package QueryDemo;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctDemo {
	public static void main(String[] args) {
//		int[] array= {10,20,30,40,50,60,70,30,20};
//		List<Integer> uE=Arrays.stream(array).boxed().distinct().collect(Collectors.toList());
//		System.out.println(uE);
//		Map<Integer, Long> groupBy=Arrays.stream(array).boxed()
//										.collect(Collectors.groupingBy(n->n,Collectors.counting()));
//		List<Integer>de=groupBy.entrySet().stream()
//				.filter(e->e.getValue()>1)
//				.map(Map.Entry::getKey)
//				.collect(Collectors.toList());
//		System.out.println(de);
//		List<Integer> oneTime=groupBy.entrySet().stream()
//				.filter(e->e.getValue()==1)
//				.map(Map.Entry::getKey)
//				.collect(Collectors.toList());
//		System.out.println(oneTime);//
		
		
//		Stream.iterate(1,n->n+2).limit(4).forEach(System.out::println);
//		Stream.generate(()->new Random().nextInt(100)).limit(3).forEach(System.out::println);
		Stream.generate(()->ThreadLocalRandom.current().nextInt(100000, 999999)).limit(1).forEach(System.out::println);

		
		
	}

}
