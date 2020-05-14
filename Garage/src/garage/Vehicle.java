package garage;

public abstract class Vehicle {

	private int ID;
	private String make;
	private int wheels;
	private int mileage;
	private String colour;
	protected int cost;
	private static int count;

	public Vehicle() {

	}

	public Vehicle(String make, int wheels, int mileage, String colour) {
		ID = ++count;
		this.make = make;
		this.wheels = wheels;
		this.mileage = mileage;
		this.colour = colour;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public abstract int calculateBill();

}
