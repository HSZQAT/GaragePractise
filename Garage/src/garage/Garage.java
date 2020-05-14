package garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
	}

	public void addVehicle(String make, int wheels, int mileage, String colour, boolean fourWheelDrive, int doors) {
		this.vehicles.add(new Car(make, wheels, mileage, colour, fourWheelDrive, doors));
	}

	public void addVehicle(String make, int wheels, int mileage, String colour, boolean requiresHelmet) {
		this.vehicles.add(new Motorcycle(make, wheels, mileage, colour, requiresHelmet));
	}

	public void addVehicle(String make, int wheels, int mileage, String colour, int wingspan, int doors) {
		this.vehicles.add(new Plane(make, wheels, mileage, colour, wingspan, doors));
	}

	public void removeVehicle(Vehicle v) {
		this.vehicles.remove(v);
	}

	public void removeVehicle(int ID) {
		for (Vehicle v : vehicles) {
			if (v.getID() == ID) {
				this.vehicles.remove(v);
			}
		}
	}

	public Vehicle findByID(int ID) {

		for (Vehicle v : vehicles) {
			if (v.getID() == ID) {
				return v;
			}
		}
		System.out.println("Vehicle not found");
		return null;
	}

	public void fixVehicle() {
		for (Vehicle v : vehicles) {
			System.out.println("ID: " + v.getID() + "\nMake: " + v.getMake() + "\nCost: £" + v.calculateBill());
		}
	}

	public void emptyGarage() {
		vehicles.clear();
		System.out.println("Garage emptied.");
		return;
	}

}
