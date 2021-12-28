package classMethod.human;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	
//	正解
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
//	なんか計算式にreturnとか付けてて不正解になっていた
	public void move(int move) {
		System.out.println(move + "km 走ります");
		this.fuelAmount = this.fuelAmount - move / this.fuelCost;
	}
	
//	正解
	public double getFuelAmount() {
		return fuelAmount;
	}

}