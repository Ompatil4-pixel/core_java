package P1.Single;

public class B extends A{

	
	public void method_B()
	{
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		
		B obj1=new B();
		obj1.methodA();
		obj1.method_B();
		
	}
}
