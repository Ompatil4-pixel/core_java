package P1.Types_constructor;

public class Student_main {

	public static void main(String args[]) {
		// This object creation would call the default constructor
		Student_dataa myobj = new Student_dataa();
		System.out.println("Student Name is: " + myobj.getStuName());
		System.out.println("Student Age is: " + myobj.getStuAge());
		System.out.println("Student ID is: " + myobj.getStuID());
		/*
		* This object creation would call the parameterized constructor
		* StudentData(int, String, int)
		*/
		Student_dataa myobj2 = new Student_dataa(555, "Om Patil", 25);
		System.out.println("Student Name is: " + myobj2.getStuName());
		System.out.println("Student Age is: " + myobj2.getStuAge());
		System.out.println("Student ID is: " + myobj2.getStuID());
		}

}
