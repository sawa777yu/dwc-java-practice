package extend;

//PhoneはimportしていないのにCameraだけあるのはクラスメソッドで使っているから？
import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
		mobilePhone.call("99-8888-7777");
//		ここってthisではだめなのか？
//		→クラスメソッドは特定のオブジェクトに関連付けられていないため
//		thisを使っての記述はできない
		Interface01.classTakePicture(mobilePhone);
	}
	
//	戻り値なしのクラスメソッド
//	この引数ってなんなんやろう。Cameraクラスのインスタンス？
	public static void classTakePicture(Camera camera) {
		camera.takePicture();
	}
}
