
public class Car_re {
	private double fuelCost;
	private double fuelAmount;
	
	public Car_re(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int distance) {
		System.out.println(distance + "km走ります");
//		thisなしでもいけた
//		メソッドは呼び出すときにクラスを参照しているからthisは不要？
		fuelAmount = fuelAmount - distance / fuelCost;
	}
	
	public double getFuelAmount() {
		return fuelAmount;
	}
}
