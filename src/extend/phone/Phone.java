package extend.phone;

//ここがclassではなくinterface
public interface Phone {
//	定数ってfinalがつくんやなかったっけ
//	→インターフェースにすると「public static final」が自動でつくようで
//	明示的に記述する必要は無いらしい
	final int MAX_NUMBER_DIGITS = 11;
//	抽象メソッド
//	→抽象メソッドとするためにはabstractの記述が必要であるが
//	こちらに関しても「public abstract」が自動でつくので
//	明示する必要はない
	void call(String number);
	
	default void powerOff() {
		System.out.println("電源を切ります");
	}
}
