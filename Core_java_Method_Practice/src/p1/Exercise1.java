package p1;

public class Exercise1 {
	 
		int a; 
		float b; 
		String str;
		
		public void operation1()
		{
		   a= 10;
		   
		   b = 15.26f;// float value should be defined as decimal with f
		   
		   
		   str = "Java";
		
		}
		
		public void operation2()
		{
			a= 20;
		    b = 27f;
		    str = "SELENIUM";
		
		}
		
		public void display()
		{
		System.out.println("The Integer Value is :" + a);
		System.out.println("The Float Value is :" + b);
		System.out.println("The String Value is: " + str);
		}
		
		public static void main(String args[]) {
			Exercise1 obj = new Exercise1();
			obj.operation1();
			obj.display();
			obj.operation2();
			obj.display();
			}

		}
	

