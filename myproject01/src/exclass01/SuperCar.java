package exclass01;

public class SuperCar {
	int fuel;
	int distance;
	int FuelEfficiency;
	
	public int run() {
		if(fuel > 0) {
			fuel--;
			distance += FuelEfficiency;
			return FuelEfficiency;
		}
		return 0;
	}
}
