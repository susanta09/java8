package lamdaExpresion;
interface K
{
	 void show();
	
}
interface T
{
	 void show();
	
}
public class DimondProblem implements K, T{
	public void show()
	{
		System.out.println("override");
	}
	public static void main(String[] args) {
		DimondProblem d=new DimondProblem();
		d.show();
	}

}
