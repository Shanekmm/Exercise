package inheritance;

public class Vehicle {
	protected int speed;
	int wheels=10;
	Vehicle()
	{
		this.speed=10;
	}
	void move()
	{
		System.out.println("Vehicle is moving");
	}
	void stop()
	{
		System.out.println("Vehicle is stopped");
	}
	void print()
	{
		System.out.println("parent class");
	}
	final void Park()
	{
		System.out.println("Vehicle is parked");
	}

}
