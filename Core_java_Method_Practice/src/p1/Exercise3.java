package p1;

public class Exercise3 {

	//One method and in same class we will have main method
	 
		int a = 15000;
		int b = -20000;
		void add() {
		int c = a + b;
		System.out.println("The int Value is : " + c);
		}
		public static void main(String[] args) {
		Exercise3 obj = new Exercise3();
		obj.add();
		}
}
