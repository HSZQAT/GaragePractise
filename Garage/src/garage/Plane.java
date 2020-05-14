package garage;

public class Plane extends Vehicle {
	private int wingspan;
	private int doors;

	public Plane() {

	}

	public Plane(String make, int wheels, int mileage, String colour, int wingspan, int doors) {
		super(make, wheels, mileage, colour);
		this.wingspan = wingspan;
		this.doors = doors;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public int calculateBill() {
		if (wingspan > 25) {
			cost = 1300 + (doors * 20);
		} else {
			cost = 900 + (doors * 20);
		}
		return cost;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Plane other = (Plane) obj;
		if (doors != other.doors) {
			return false;
		}
		if (wingspan != other.wingspan) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Plane [wingspan=" + wingspan + ", doors=" + doors + ", getID()=" + getID() + ", getMake()=" + getMake()
				+ ", getWheels()=" + getWheels() + ", getMileage()=" + getMileage() + ", getColour()=" + getColour()
				+ "]";
	}

}
