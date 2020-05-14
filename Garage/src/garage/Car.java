package garage;

public class Car extends Vehicle {
	private boolean fourWheelDrive;
	private int doors;

	public Car() {

	}

	public Car(String make, int wheels, int mileage, String colour, boolean fourWheelDrive, int doors) {
		super(make, wheels, mileage, colour);
		this.fourWheelDrive = fourWheelDrive;
		this.doors = doors;
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		if (doors > 2) {
			this.doors = doors;
		} else {
			System.out.println("Think thats a bike m8");
		}
	}

	@Override
	public int calculateBill() {
		if (fourWheelDrive) {
			cost = (90 * getWheels());
		} else {
			cost = (70 * getWheels());
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
		Car other = (Car) obj;
		if (doors != other.doors) {
			return false;
		}
		if (fourWheelDrive != other.fourWheelDrive) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Car [fourWheelDrive=" + fourWheelDrive + ", doors=" + doors + ", ID=" + getID() + ", Make=" + getMake()
				+ ", Wheels=" + getWheels() + ", Mileage=" + getMileage() + ", Colour=" + getColour() + "]";
	}

}
