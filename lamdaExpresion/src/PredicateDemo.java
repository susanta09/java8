import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> p=i->i>10;
		Predicate<Integer> q=i->i/2==0;
		
		int t=10;
		System.out.println(p.and(q.negate()).test(t));
	}

}
