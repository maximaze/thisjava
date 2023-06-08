package sec07.exam05_method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) {
		System.out.print("[Vehicle] run() ->");
		vehicle.run();
	}
	
	
	public void drive(Bus bus) {
		System.out.print("[Bus] run() ->");
		bus.run();
	}
	
	public void drive(Taxi vehicle) {
		System.out.print("[Taxi] run() ->");
		vehicle.run();
	}
	
	
}
