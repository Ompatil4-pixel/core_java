package P1.Multilevell;

public class maruti800 extends maruti {

	public maruti800() {
		System.out.println("Constructor of class Maruti800");
		}
		public void speed() {
		System.out.println("Max speed: 80Kmph");
		}
		public static void main(String[] args) {
		maruti800 obj = new maruti800();
		obj.vehicleType();
		obj.brand();
		obj.speed();
		}
	
}
