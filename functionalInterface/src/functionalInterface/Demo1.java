package functionalInterface;
@FunctionalInterface
interface Calculator{
	int operation(int a,int b);
	default boolean isPalindrom(int a)
	{
		int n=a;
		int x=0;
		while(n!=0)
		{
			int r=n%10;
			x=x*10+r;
			n=n/10;
		}
		return a==x;
	}
	static void calculatorRetting(int r)
	{
		System.out.println("Retting of Calculator out of 5 is "+r);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Calculator add=(a,b)->a+b;
		System.out.println("Addition of 3,4 "+add.operation(3, 4));
		System.out.println("Number 121 is palindrom "+add.isPalindrom(121));
		Calculator.calculatorRetting(3);
		
	}

}
