package P1.Get_Set;

public class Encapsulate_main {

	public static void main(String[] args)
	 {
		Encapsulate obj1 = new Encapsulate();
		
		 
		obj1.setName("OM");
		 
		obj1.setAge(23);
	 
		obj1.setRoll(31);
		
		// Displaying values of the variables
		 System.out.println(" name: " + obj1.getName());
		 System.out.println(" age: " + obj1.getAge());
		 System.out.println("roll: " + obj1.getRoll());
		 
		 // Direct access of Roll is not possible
		 // due to encapsulation
		 // System.out.println("roll: " +
		 // obj.Name);
	  
	 }
	  
	
}
