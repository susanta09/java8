package lamdaExpresion;

interface P
{
	public static void show()
	{
		System.out.println("interface P");
	}
}
public class StaticMethodDemo implements P {
	public static void show()
	{
		System.out.println("interface test");
	}
	public static void main(String[] args) {
		P.show();
		show();
	}

}
