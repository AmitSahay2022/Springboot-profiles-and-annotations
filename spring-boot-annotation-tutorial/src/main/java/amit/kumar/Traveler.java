package amit.kumar;

public class Traveler {
	private Vehicle vehicle;

	public Traveler(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void going() {
		System.out.println("I am going to US");
		vehicle.move();
	}
}
