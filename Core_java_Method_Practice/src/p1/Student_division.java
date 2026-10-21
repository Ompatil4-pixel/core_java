package p1;

public class Student_division {
	
	Student_division(int s1,int s2,int s3,int s4,int s5)
	{
		int Total=s1+s2+s3+s4+s5;
		double percentage=Total/5;
		
		System.out.println("Total_marks"+ Total);
		System.out.println("Percentage"+ percentage);
		

        if (percentage >= 60) {
            System.out.println("Division: First Division");
        }
        else if (percentage >= 50) {
            System.out.println("Division: Second Division");
        } 
        else if (percentage >= 40) {
            System.out.println("Division: Third Division");
        } 
        else {
            System.out.println("Division: Fail");
        }
	}
	
	public static void main(String[] args)
	{
			
		Student_division obj1=new Student_division(50,90,95,80,75);
	}

}
