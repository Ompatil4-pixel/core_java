package p1;

public class parameter_return {

	/*-- Method arguments
	b. Directly printing output of a method --*/
	
	int length;
	int breadth;
	
	void parameter_return(int l, int b) {
	length = l;
	breadth = b;
	}
	
	public int getArea() {
	return length * breadth;
	}
	
	public static void main(String[] args)
	{
		parameter_return r = new parameter_return();
		
		r.parameter_return(6, 7);
		
		System.out.println(r.getArea());
		}

}
