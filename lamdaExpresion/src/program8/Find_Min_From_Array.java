package program8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Find_Min_From_Array {
	public static void main(String[] args) {
		Integer array[]= {6,4,9,5,1,3};
		
		List<Integer> list=Arrays.stream(array).collect(Collectors.toList());
		
		Optional<Integer> r=list.stream().min(Integer::compareTo);
		if(r.isPresent())
			System.out.println("Min value: "+r.get());
		
		Optional<Integer> k=list.stream().min(Comparator.comparing(Integer::valueOf));
		if(k.isPresent())
			System.out.println("Min value: "+k.get());
	}

}
