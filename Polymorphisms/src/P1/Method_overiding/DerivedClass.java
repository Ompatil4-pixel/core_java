package P1.Method_overiding;

public class DerivedClass extends baseclass{

	public void method() {// Base class method
		System.out.println("I'm the method of DerivedClass");
		}
	
	public static void main(String[] args) {
		
		// method calling from sub class object
		DerivedClass der = new DerivedClass();
		
		der.method();
		// method calling from super class object
		
		baseclass base = new baseclass();
		
		base.method();
		
		baseclass base1 = new DerivedClass();
		
		base1.method();
		}

	
}
