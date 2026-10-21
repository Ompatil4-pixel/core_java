package P1.Single;

public class Car extends Vehicle {
	
	String model_type;
	
	void show_details()
	{
		vehicle_type="Car";//Accesing instance variable of parent class
		model_type="SUV";
		
		System.out.println(vehicle_type + model_type );
	}

	public static void main(String[] args)
	{
		Car o1=new Car();
		
		o1.show_details();
		
	}
}
