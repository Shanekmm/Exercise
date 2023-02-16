package inheritance;

public class Bike extends Vehicle{
	int wheels=2;
	Bike()
	{
		System.out.println("constructor of bike");
	}
	Bike(int a)
	{
		System.out.println("constructer with argument");
	}
	Bike(String b)
	{
		System.out.println(b);
	}
void displayBike()
{
	System.out.println("Bike is running");
}
void print()
{
	System.out.println("child class 2");
	super.print();
}

}
