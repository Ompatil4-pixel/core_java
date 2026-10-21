package p1;

public class DataType_Char {
	/*--Char type of variable
	 Calling method and variable from main method--*/

	char a = 'J';
	char b ='A';
	char c ='V';
	char d ='A';
	
	void join() 
	{
	System.out.println("The Characters Value is : " + a + b + c + d);
	}
	
	public static void main(String[] args)
	{
	DataType_Char obj = new DataType_Char();
	obj.join();
	}
}
