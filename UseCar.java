package abstraction;

public class UseCar {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.speedLimit("CIty"));
        System.out.println(c.fuelType(false));
        System.out.println(c.transportType("white"));
	}

}
