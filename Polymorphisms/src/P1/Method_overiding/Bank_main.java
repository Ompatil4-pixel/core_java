package P1.Method_overiding;

public class Bank_main {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Bank Rate of Interest : " + b.getRateOfInterest() + "%");
		Bank b1 = new SBI_Bank();
		Bank b2 = new ICICI_Bank();
		Bank b3 = new Axis_Bank();
		System.out.println("SBI Rate of Interest : " + b1.getRateOfInterest() + "%");
		System.out.println("ICICI Rate of Interest : " + b2.getRateOfInterest() + "%");
		System.out.println("AXIS Rate of Interest : " + b3.getRateOfInterest() + "%");
		}
	
}
