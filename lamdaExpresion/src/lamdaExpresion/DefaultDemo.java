package lamdaExpresion;
interface A
{
	default void show()
	{
		System.out.println("interface A");
	}
}
interface B
{
	default void show()
	{
		System.out.println("interface B");
	}
}
public class DefaultDemo implements A, B{
	public void show()
	{
		System.out.println("in DefaultDemo class");
		//A.super.show();
	}
	public static void main(String args[]) {
		DefaultDemo d=new DefaultDemo();
		d.show();
	}

}
