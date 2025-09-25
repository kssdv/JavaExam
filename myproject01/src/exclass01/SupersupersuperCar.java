package exclass01;

public class SupersupersuperCar extends SupersuperCar {
	public int teleport() {
		if(fuel >= FuelEfficiency * FuelEfficiency) {
			fuel -= FuelEfficiency * FuelEfficiency;
			distance += FuelEfficiency * FuelEfficiency * FuelEfficiency * FuelEfficiency;
			return FuelEfficiency * FuelEfficiency * FuelEfficiency * FuelEfficiency;
		}else {
			return fly();
		}
	}
}
