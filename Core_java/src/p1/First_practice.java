package p1;

public class First_practice {

	
	int a=10; //instance member variable
	
	int b; // Access With in a class 
	
	void mm() //instance member Function
	{
		int b=20; // Local Variable
		
		System.out.println("Local Variable"+ b);
		
	}
	
	void mm1() //instance member Function
	{
		a=40;
		
		int b=60; //Local Variable with in a Method
	}
	
	public static void main(String[] args)
	{
		
		First_practice F1= new First_practice();
	
		System.out.println("Instance Variable"+ F1.a);
	
		System.out.println("Instance Variable With No Value" +  F1.b);
		
		F1.mm(); 
		
		F1.mm1();
	 
		System.out.println("Instance Variable With No Value" +  F1.b);
	}
	
	
}
