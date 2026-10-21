package p1;

public class Multi_args {
	/*--Method arguments
b. While calling sending parameters and receiving output in main
method.--*/
	
	double Multi_args(double x, double y) {
		return x * y;
		}
	
		public static void main(String[] args) {
		Multi_args area = new Multi_args();
		double z = area .Multi_args(10.2, 23.4);
		System.out.println(z);
		}
}
