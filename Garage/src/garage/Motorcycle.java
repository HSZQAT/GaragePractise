package garage;

public class Motorcycle extends Vehicle {
	private boolean requiresHelmet;

	public Motorcycle() {

	}

	public Motorcycle(String make, int wheels, int mileage, String colour, boolean requiresHelmet) {
		super(make, wheels, mileage, colour);
		this.requiresHelmet = requiresHelmet;
	}

	public boolean isRequiresHelmet() {
		return requiresHelmet;
	}

	public void setRequiresHelmet(boolean requiresHelmet) {
		this.requiresHelmet = requiresHelmet;
	}

	@Override
	public void setWheels(int wheels) {
		if (wheels > 3 && wheels < 2) {
			System.out.println("Sorry bud, not sure that works");
		} else {
			this.setWheels(wheels);
		}
	}

	@Override
	public int calculateBill() {
		if (requiresHelmet) {
			cost = (80 * getWheels()) + 50;
		} else {
			cost = (80 * getWheels());
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
		Motorcycle other = (Motorcycle) obj;
		if (requiresHelmet != other.requiresHelmet) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Motorcycle [requiresHelmet=" + requiresHelmet + ", getID()=" + getID() + ", getMake()=" + getMake()
				+ ", getWheels()=" + getWheels() + ", getMileage()=" + getMileage() + ", getColour()=" + getColour()
				+ "]";
	}

}
