package exclass01;

public class SupersuperCar extends SuperCar {
	public int fly() {
		if(fuel >= 5) {
			fuel -= 5;
			distance += 2 * (FuelEfficiency * FuelEfficiency);
			return 2 * (FuelEfficiency * FuelEfficiency);
		}else {
			return run();
		}
	}
}
