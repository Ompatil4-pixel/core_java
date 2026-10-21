package P1.Multilevell;

public class Manager extends User{

	String department;

	public static void main(String[] agrs)
	{
		Employee E1 = new Employee();
		E1.name = "Candid";
		E1.age = 22;
		E1.ph = 123456789l;
		E1.specialization = "Java";
		
		Manager m1 = new Manager();
		m1.name = "java";
		m1.age = 25;
		m1.ph = 345789l;
		m1.department = "HR";
		
		System.out.println(E1.name);
		System.out.println(E1.age);
		System.out.println(E1.ph);
		System.out.println(E1.specialization);
		System.out.println(m1.name);
		System.out.println(m1.age);
		System.out.println(m1.ph);
		System.out.println(m1.department);
	}
}
