package inheritance;

public class main {

	public static void main(String []args) {
		
		// TODO Auto-generated method stub
		Bike splendor=new Bike();//overloading
		Car audi=new Car();
		splendor.move();
    	splendor.displayBike();
		System.out.println(splendor.speed);
		audi.stop();
		System.out.println(splendor.wheels);
		System.out.println(audi.wheels);
		audi.print();//overriding
    	splendor.print();//overriding
		audi.Park();//final
		Vehicle v=new Car();//upcasting
		v.print();
		if(v instanceof Car) {
    	Car c=(Car)v;//downcasting using instanceof operator
     	c.display();}
	}

}
