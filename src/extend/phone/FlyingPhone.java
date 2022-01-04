package extend.phone;

public class FlyingPhone implements Phone, Flying {
//	時間を保持するフィールドの定義
	private int time;
	
//	時間を拾うコンストラクタの定義
	public FlyingPhone(int time) {
		this.time = time;
	}
	
//	publicを付けないとエラーになる
//	package-privateではだめらしい
	public void fly() {
//		ここはthisなしでもいけるっぽい
		System.out.println(this.time + "分間、飛びます");
	}
	
//	こっちも
	public void call(String number) {
		System.out.println(number + "に電話します。");
	}
	
//	powerOffというdefaultメソッドがPhoneとFlyingという
//	同じ階層のインターフェースに存在していて競合しているので
//	どちらを優先させるのかを明示する必要があるっぽい
	public void powerOff() {
		Flying.super.powerOff();
	}
	
}
