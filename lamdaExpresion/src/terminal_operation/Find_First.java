package terminal_operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_First {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple",  "banana", "cherry", "date");

		Optional<String> anyElement = strings.stream().findAny();

		if (anyElement.isPresent()) {
		    System.out.println("Any element: " + anyElement.get());
		} else {
		    System.out.println("Stream is empty");
		}
	}

}
