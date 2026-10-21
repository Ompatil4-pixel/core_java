package P1.Protected_Var;

public class Shape {
	
	protected int side;
	
	public Shape() {
		side = 3;
		System.out.println(side);
		}
	
	public int getSides() {
		return side;
		}
	
	public void printSides() {
		System.out.println("This object has " + side + " side.");
		}

}
