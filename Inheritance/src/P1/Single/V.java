package P1.Single;

public class V {

	String color;
	private int speed;
	private int size;
	
	
	public String get_color()
	{
		return color;
	}
	
	public void set_color(String color)
	{
		this.color=color;
	}
	
	private int get_speed()
	{
		return speed;
	}
	
	private void set_speed(int speed)
	{
		this.speed=speed;
	}
	
	protected int get_size()
	{
		return size;
	}
	
	protected void set_size(int size)
	{
		this.size=size;
	}
}
