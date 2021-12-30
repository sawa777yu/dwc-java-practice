package exception;

public class Exception03 {
	public static void main(String[] args) {
		try {
//			division変数の定義はこの時点ではまだされていないのになぜ使えるのか
			Exception03.division(100, 0);
//		「catch(例外クラス　変数)」という公式
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException例外が発生");
		}catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException例外が発生");
//			「throw 例外インスタンス」で例外インスタンスをスローする。
//			下記のeはcatchで定義した変数のe。catchした例外インスタンスをスローしている
			throw e;
		}
		System.out.println("プログラム終了");
	}
	
	public static void division(int a, int b) {
		System.out.println(a + " ÷ " + b + " は？ ");
		if (b == 0) {
//			「throw new 例外クラス」で例外インスタンスを生成してスローする。
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
}
