package extend.phone;

public class FlyingPhonere implements Phone, Flyingre {
//	アクセス修飾子が抜けいている
	int time;
	
	public FlyingPhonere(int num) {
		time = num;
	}
	
	public void fly() {
		System.out.println(this.time + "分間飛びます");		
	}
	
	public void powerOff() {
		Flyingre.super.powerOff();
	}
	
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです");
	}
}
