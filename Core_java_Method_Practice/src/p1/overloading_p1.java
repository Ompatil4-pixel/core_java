package p1;

public class overloading_p1 {

	public void overloading_p1(int a){
		System.out.println(a);
	}
	
	
	protected int overloading_p1(int b,int c)
	{
		System.out.println(b);
		System.out.println(c);
		return 1;
	}
	
	private String overloading_p1(String a){
		System.out.println(a);
		return null;
	}
	
	
	public static void main(String[] args)
	{
		overloading_p1 obj1= new overloading_p1() ;
		obj1.overloading_p1(1);

		System.out.println(obj1.overloading_p1(1,2));
		

		System.out.println(obj1.overloading_p1("om"));
	
	
	
	
}
}
