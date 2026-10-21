package P1.Protected_Var;

public class Square extends Shape{

	public Square(int nSides) {
		side = nSides; 
		System.out.println(side);
	
}
	void display() {
		Shape shape= new Shape();
		System.out.println("display method in sub class"+shape.side);
	}

}