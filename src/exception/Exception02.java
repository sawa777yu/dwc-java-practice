package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100 ÷ 0 は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
//			上記try文で発生するエラーはArithmeticExceptionという例外クラスらしい
//			eというのは変数名にあたるようなのだがこれは何でもええのだろうか
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		} finally {
			System.out.println("プログラム終了");
		}
	}

}
