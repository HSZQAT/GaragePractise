package garage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage();

		Vehicle car1 = new Car("Volvo", 4, 10000, "Red", false, 5);
		garage.addVehicle(car1);
		garage.addVehicle("Toyota", 4, 29199, "Silver", true, 5);
		garage.addVehicle("Boeing", 3, 126797134, "White", 32, 8);

		System.out.println(car1.toString());
		System.out.println(garage.findByID(2).toString());
		System.out.println(garage.findByID(3).toString());

		garage.fixVehicle();
	}

}
