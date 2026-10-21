package p1;

public class Exercise4 {

	/*-- int and float type of variable
	b. Calling method and variable from main method
	c. Doing arithmetic operations in a program
	d. How to call method of same class without creating a object.-> Static method
	i. Display method is called from various other methods of
	same --*/
	
	 
	int x = 10,y =20;
	float z;
	
	void add() 
	{
	 z = x+y;
	System.out.println(z);
	}
	
	void sub() 
	{
	z = x- y;
	System.out.println(z);
	}
	
	void mult()
	{
	z = x*y;
	System.out.println(z);
	}
	
	void div()
	{
	z = x/y;
	System.out.println(z);
}
	public static void main(String[] args) {
		Exercise4 obj = new Exercise4();
		obj.add();
		obj.sub();
		obj.mult();
		obj.div();
}
}
