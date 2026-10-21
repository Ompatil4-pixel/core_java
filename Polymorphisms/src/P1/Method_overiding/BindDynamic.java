package P1.Method_overiding;

public class BindDynamic {

	protected String val;
	
	void display(String str) 
	{
	
		val = "Base Class Fuction ".concat(str);
	
		System.out.println(val);
	}

	
}
