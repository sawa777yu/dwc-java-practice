package extend.phone;

public interface Flying {
	void fly();
	
//	java8以降からinterfaceにもメソッドの中身がかけるようになった
//	中身を書けるのでオーバーライドをする必要がなくなったのが利点らしい
//	オーバーライドをしたければすればいいししなくてもいいっていうのが利点なのかな？
	default void powerOff() {
		System.out.println("飛んでいる場合は落下します");
	}
}
