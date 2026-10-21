package P1.Get_Set;

public class Emp_main {

	public static void main(String args[]){
		 Employee obj = new Employee();
		 obj.setEmpName("OM");
		 obj.setEmpAge(23);
		 obj.setEmpSSN(1122330);
		 System.out.println("Employee Name: " + obj.getEmpName());
		 System.out.println("Employee SSN: " + obj.getEmpSS());
		 System.out.println("Employee Age: " + obj.getEmpAge());
		 } 
	
	
}
