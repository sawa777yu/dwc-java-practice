package extend.phone;

//implementsと記述することでクラスにインターフェースを実装できる
public class MobilePhone implements Phone, Camera {
	private String number;
	public MobilePhone(String number) {
		this.number = number;
	}
	
//	Cameraクラスで定義された抽象メソッドをオーバーライド
	public void takePicture() {
		System.out.println("写真をとります");
	}
	
//	Phoneクラスで定義された抽象メソッドをオーバーライド
	public void call(String number) {
		System.out.println(this.number + "から" + number + "に電話をかけます。");
	}
}
