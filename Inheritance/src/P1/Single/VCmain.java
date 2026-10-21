package P1.Single;

public class VCmain {

	public static void main(String[] args)
	{
		C o1=new C();
		o1.color="Orange";
		//o1.set_speed(200);
		o1.set_size(1000);
		o1.CC=500;
		o1.gears=6;
		System.out.println(o1.get_color());
	    o1.set_color("RED");
	    System.out.println(o1.get_color());
		System.out.println(o1.getCC());
		o1.setCC(700);
		System.out.println(o1.getCC());
		System.out.println(o1.getGears());
		o1.setGears(7);
		System.out.println(o1.getGears());
		System.out.println(o1.get_size());
		o1.set_size(800);
		System.out.println(o1.get_size());
		
	}
	
}
