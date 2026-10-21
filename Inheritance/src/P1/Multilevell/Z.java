package P1.Multilevell;

public class Z extends Y{

	public void method3()
	{
		System.out.println("Child Method");
	}
	
	public static void main(String[] args)
	{
		Z o1= new Z();
		o1.method1();
		o1.method2();
		o1.method3();
	}
}
