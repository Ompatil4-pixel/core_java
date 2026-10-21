package p1;

public class AddOperation {
	
	/*--Method arguments
     b. While calling sending parameters and receiving output in main
        method--*/
	
	int add_int(int x, int y) {
		return x + y;
		}
	
		public static void main(String[] args) {
		
		AddOperation addOperation = new AddOperation();
		
		int z = addOperation.add_int(2, 4);
		
		System.out.println(z);
		
		}


}
