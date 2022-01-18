
public class Chapter09re {
	public static void main(String[] args) {
		double fuelCost = 12.5;
		
		double fuelAmount = 55.0;
		
		Car_re car = new Car_re(fuelCost, fuelAmount);
		
		car.move(20);
		System.out.println("残量は、" + car.getFuelAmount() + "です");
	}
}