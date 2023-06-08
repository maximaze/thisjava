package sec07.exam05_method_polymorphism;

public class DriverExample2 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive((Vehicle)bus);
		driver.drive((Vehicle)taxi);
	}
}
