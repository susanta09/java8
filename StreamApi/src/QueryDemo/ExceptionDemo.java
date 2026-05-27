package QueryDemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionDemo {
	public static void show()
	{
//		System.out.println(4/0);
		throw new ArithmeticException("Manulaly handle");
	}
	public static int get()
	{
		int n=4/0;
		return n;
	}
	public static void demo() throws FileNotFoundException
	{
		PrintWriter pw=new PrintWriter("ab.text");
		pw.print("hello");
	}
	public static void main(String[] args) throws Exception  {
//		try {
//			show();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		int n=get();
			demo();
//		show();
		
		System.out.println("rama");
		
	}

}
