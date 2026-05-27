import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, Integer> f1=i->i*2;
		Function<Integer, Integer> f2=i->i*i*i;
		
		System.out.println(f1.andThen(f2).apply(null));
		System.out.println(f2.andThen(f1).apply(2));

	}
}
